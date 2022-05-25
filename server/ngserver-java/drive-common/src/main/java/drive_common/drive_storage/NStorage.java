package drive_common.drive_storage;

import drive_protocol.request.*;
import drive_protocol.response.*;

public interface NStorage {
    CreateFileResponse createFile(CreateFileRequest request);
    CloseFileResponse closeFile(CloseFileRequest request);
    ReadFileResponse readFile(ReadFileRequest request);
    WriteFileResponse writeFile(WriteFileRequest request);
    GetFileInformationResponse getFileInformation(GetFileInformationRequest request);
    DeleteFileResponse deleteFile(DeleteFileRequest request);
    DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request);
    MoveFileResponse moveFile(MoveFileRequest request);
    FlushFileBufferResponse flushFileBuffer(FlushFileBufferRequest request);
    SetAllocationSizeResponse setAllocationSize(SetAllocationSizeRequest request);
    SetEndOfFileResponse setEndOfFile(SetEndOfFileRequest request);
    SetFileAttributesResponse setFileAttributes(SetFileAttributesRequest request);
    LockFileResponse lockFile(LockFileRequest request);
    UnlockFileResponse unlockFile(UnlockFileRequest request);
}
