#include "drive.h"

namespace net_drive {
    void Drive::Run()
    {
        DOKAN_OPTIONS options;
        ZeroMemory(&options, sizeof(DOKAN_OPTIONS));

        options.Version = DOKAN_VERSION;
        options.SingleThread = false;

        // mount
        options.MountPoint = L"S:";

        // network drive
        options.Options |= DOKAN_OPTION_NETWORK;
        options.UNCName = L"\\localhost\\ndrive";

        options.GlobalContext = reinterpret_cast<ULONG64>(this);

        NTSTATUS status = DokanCreateFileSystem(&options, &operations, &instance);
        switch (status)
        {
            case DOKAN_SUCCESS:
            {
                break;
            }
            default:
            {
                throw std::runtime_error("");
            }
        }
    }

    void Drive::Wait()
    {
        DokanWaitForFileSystemClosed(instance, INFINITE);
    }

    void Drive::Stop()
    {
        DokanRemoveMountPoint(L"S:");
    }
}