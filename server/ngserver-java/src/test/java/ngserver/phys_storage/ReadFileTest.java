package ngserver.phys_storage;

import drive_common.dokan_port.constants.microsoft.NtStatus;
import drive_protocol.request.ReadFileRequest;
import ngserver.phys_storage.repository.ObjectsRepository;
import ngserver.phys_storage.service.PhysStorageService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ReadFileTest {
    @Autowired
    PhysStorageService storage;
    @Autowired
    ObjectsRepository objectsRepository;

    Path targetPath;

    @BeforeEach
    public void beforeReadFile() throws IOException {
        var testStorageRoot = "C:\\test_storage";
        Files.createDirectories(Paths.get(testStorageRoot));

        var testFilename = UUID.randomUUID().toString();
        targetPath = Paths.get(testStorageRoot, testFilename);

        byte[] data = new byte[1024 * 100];
        new Random().nextBytes(data);
        Files.write(targetPath, data);

        objectsRepository.addObject(
                "\\" + targetPath.getFileName().toString(),
                "\\",
                targetPath.getFileName().toString(),
                "F",
                targetPath.toString());
    }

    @AfterEach
    public void afterReadFile() {
        objectsRepository.removeObjectByFullPath(targetPath.toString());
        // Files.deleteIfExists(targetPath);
    }

    @Test
    public void testReadFile() throws IOException {
        long offset = 0;
        long length = 10;
        var fileName = "\\" + targetPath.getFileName().toString();
        var request = ReadFileRequest.newBuilder()
                .setFileName(fileName)
                .setLength(length)
                .setOffset(offset)
                .build();
        var response = storage.readFile(request);

        var status = response.getStatus();
        var buffer = response.getBuffer();

        assertThat(status).isEqualTo(NtStatus.SUCCESS.intValue());
        assertThat(buffer.size()).isEqualTo(10);

        var objectEntities = objectsRepository.findObjectByFullPath(fileName);
        var objectInfo = objectEntities.size() > 0 ? objectEntities.get(0) : null;

        assertThat(objectInfo).isNotNull();

        var underlyingPath = objectInfo.getPhysicalPath();
        var fileInputStream = new FileInputStream(underlyingPath);
        var readBuffer = ByteBuffer.allocateDirect((int) length);
        fileInputStream.getChannel().read(readBuffer, offset);

        var bufferByteArray = buffer.toByteArray();
        var readBufferByteArray = readBuffer.array();

        assertThat(bufferByteArray).isEqualTo(readBufferByteArray);
    }
}
