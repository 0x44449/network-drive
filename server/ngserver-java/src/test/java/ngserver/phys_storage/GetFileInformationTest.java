package ngserver.phys_storage;

import drive_common.dokan_port.constants.microsoft.FileAttribute;
import drive_common.dokan_port.constants.microsoft.NtStatus;
import drive_protocol.request.GetFileInformationRequest;
import ngserver.phys_storage.repository.ObjectsRepository;
import ngserver.phys_storage.service.PhysStorageService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GetFileInformationTest {
    @Autowired
    PhysStorageService storage;
    @Autowired
    ObjectsRepository objectsRepository;

    Path targetPath;
    LocalDateTime fileCreateTime;
    LocalDateTime fileLastWriteTime;
    LocalDateTime fileLastAccessTime;

    @BeforeEach
    public void beforeGetFileInformation() throws IOException {
        var testStorageRoot = "C:\\test_storage";
        Files.createDirectories(Paths.get(testStorageRoot));

        var testFilename = UUID.randomUUID().toString();
        targetPath = Paths.get(testStorageRoot, testFilename);

        fileCreateTime = LocalDateTime.now().minusSeconds(100);
        fileLastWriteTime = LocalDateTime.now().minusSeconds(100);
        fileLastAccessTime = LocalDateTime.now().minusSeconds(100);

        byte[] data = new byte[1024 * 100];
        new Random().nextBytes(data);
        Files.write(targetPath, data);

        objectsRepository.addObject(
                "\\" + targetPath.getFileName().toString(),
                "\\",
                targetPath.getFileName().toString(),
                targetPath.toString(),
                FileAttribute.NORMAL.intValue(),
                fileCreateTime,
                fileLastWriteTime,
                fileLastAccessTime,
                1024 * 100);
    }

    @AfterEach
    public void afterGetFileInformation() {
        objectsRepository.removeObjectByFullPath("\\" + targetPath.getFileName().toString());
        // Files.deleteIfExists(targetPath);
    }

    @Test
    public void testGetFileInformation() {
        var fileName = "\\" + targetPath.getFileName().toString();
        var request = GetFileInformationRequest.newBuilder()
                .setFileName(fileName)
                .build();
        var response = storage.getFileInformation(request);

        var status = response.getStatus();

        assertThat(status).isEqualTo(NtStatus.SUCCESS.intValue());

        var objectEntities = objectsRepository.findObjectByFullPath(fileName);
        var objectInfo = objectEntities.size() > 0 ? objectEntities.get(0) : null;

        assertThat(objectInfo).isNotNull();
        assertThat(objectInfo.getFileCreationTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()).isEqualTo(response.getFileCreationTime());
        assertThat(objectInfo.getFileLastWriteTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()).isEqualTo(response.getFileLastWriteTime());
        assertThat(objectInfo.getFileLastAccessTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()).isEqualTo(response.getFileLastAccessTime());
        assertThat(objectInfo.getFileAttributes()).isEqualTo(response.getFileAttributes());
        assertThat(objectInfo.getFileSize()).isEqualTo(response.getFileSize());
    }
}
