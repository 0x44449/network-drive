#pragma once

#include <dokan.h>
#include <fileinfo.h>

#include <iostream>

#include "operations.h"

namespace net_drive {
    class Drive {
    private:
        DOKAN_HANDLE instance = nullptr;

    public:
        void Run();
        void Stop();
        void Wait();
    };
}