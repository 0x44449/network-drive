#include "operations.h"

namespace net_drive {
	static NTSTATUS DOKAN_CALLBACK CreateFileImpl(
		LPCWSTR fileName, PDOKAN_IO_SECURITY_CONTEXT securityContext,
		ACCESS_MASK desiredAccess, ULONG fileAttributes,
		ULONG shareAccess, ULONG createDisposition,
		ULONG createOptions, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static void DOKAN_CALLBACK CloseFileImpl(
		LPCWSTR fileName, PDOKAN_FILE_INFO dokanFileInfo)
	{

	}

	static void DOKAN_CALLBACK CleanupImpl(
		LPCWSTR fileName, PDOKAN_FILE_INFO dokanFileInfo)
	{

	}

	static NTSTATUS DOKAN_CALLBACK ReadFileImpl(
		LPCWSTR fileName, LPVOID buffer,
		DWORD bufferLength, LPDWORD readLength,
		LONGLONG offset,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK WriteFileImpl(
		LPCWSTR fileName, LPCVOID buffer,
		DWORD numberOfBytesToWrite,
		LPDWORD numberOfBytesWritten,
		LONGLONG offset,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK FlushFileBuffersImpl(
		LPCWSTR fileName, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK GetFileInformation(
		LPCWSTR fileName, LPBY_HANDLE_FILE_INFORMATION handleFileInformation,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK FindFilesImpl(
		LPCWSTR fileName,
		PFillFindData fillFindData, // function pointer
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK DeleteFileImpl(
		LPCWSTR fileName, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK DeleteDirectoryImpl(
		LPCWSTR fileName, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK MoveFileImpl(
		LPCWSTR fileName, // existing file name
		LPCWSTR newFileName, BOOL replaceIfExisting,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK LockFileImpl(
		LPCWSTR fileName,
		LONGLONG byteOffset,
		LONGLONG length,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK SetEndOfFileImpl(
		LPCWSTR fileName, LONGLONG byteOffset, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK SetAllocationSizeImpl(
		LPCWSTR fileName, LONGLONG allocSize, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK SetFileAttributesImpl(
		LPCWSTR fileName, DWORD fileAttributes, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK SetFileTimeImpl(
		LPCWSTR fileName, CONST FILETIME* creationTime,
		CONST FILETIME* lastAccessTime, CONST FILETIME* lastWriteTime,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK UnlockFileImpl(
		LPCWSTR fileName, LONGLONG byteOffset, LONGLONG length,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK GetFileSecurityImpl(
		LPCWSTR fileName, PSECURITY_INFORMATION securityInformation,
		PSECURITY_DESCRIPTOR securityDescriptor, ULONG bufferLength,
		PULONG lengthNeeded, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK SetFileSecurityImpl(
		LPCWSTR fileName, PSECURITY_INFORMATION securityInformation,
		PSECURITY_DESCRIPTOR securityDescriptor, ULONG securityDescriptorLength,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK GetVolumeInformationImpl(
		LPWSTR volumeNameBuffer, DWORD volumeNameSize, LPDWORD volumeSerialNumber,
		LPDWORD maximumComponentLength, LPDWORD fileSystemFlags,
		LPWSTR fileSystemNameBuffer, DWORD fileSystemNameSize,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK GetDiskFreeSpaceImpl(
		PULONGLONG freeBytesAvailable, PULONGLONG totalNumberOfBytes,
		PULONGLONG totalNumberOfFreeBytes, PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK FindStreamsImpl(
		LPCWSTR fileName, PFillFindStreamData fillFindStreamData,
		PVOID findStreamContext,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK MountedImpl(
		LPCWSTR mountPoint,
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	static NTSTATUS DOKAN_CALLBACK UnmountedImpl(
		PDOKAN_FILE_INFO dokanFileInfo)
	{
		return STATUS_SUCCESS;
	}

	DOKAN_OPERATIONS operations = {
		CreateFileImpl,
		CleanupImpl,
		CloseFileImpl,
		nullptr, // ReadFile
		nullptr, // WriteFile
		nullptr, // FlushFileBuffers
		nullptr, // GetFileInformation
		nullptr, // FindFiles
		nullptr, // FindFilesWithPattern
		nullptr, // SetFileAttributes
		nullptr, // SetFileTime
		nullptr, // DeleteFile
		nullptr, // DeleteDirectory
		nullptr, // MoveFile
		nullptr, // SetEndOfFile
		nullptr, // SetAllocationSize
		nullptr, // LockFile
		nullptr, // UnlockFile
		nullptr, // GetDiskFreeSpace
		nullptr, // GetVolumeInformation
		nullptr, // Mounted
		nullptr, // Unmounted
		nullptr, // GetFileSecurity
		nullptr, // SetFileSecurity
		nullptr, // FindStreams
	};
}