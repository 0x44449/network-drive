package com.ngserver.storage;

import drive_protocol.request.CreateFileRequest;
import drive_protocol.response.CreateFileResponse;

public interface NStorage {
    CreateFileResponse createFile(CreateFileRequest request);
}
