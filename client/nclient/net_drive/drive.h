#pragma once

#include <dokan.h>
#include <fileinfo.h>

namespace net_drive {
    class Drive {
    private:
        DOKAN_HANDLE instance = nullptr;

    public:
        void Run();
    };
}