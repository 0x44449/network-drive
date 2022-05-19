package com.ngserver.storage.minimal;

import com.ngserver.storage.NStorage;
import drive_protocol.request.CreateFileRequest;
import drive_protocol.response.CreateFileResponse;
import org.springframework.stereotype.Service;

@Service
public class MinimalStorage implements NStorage {
    @Override
    public CreateFileResponse createFile(CreateFileRequest request) {
        return CreateFileResponse.newBuilder()
            .setStatus(0)
            .build();
    }
}
