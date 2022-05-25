package drive_common.dokan_port.constants.microsoft;

import drive_common.dokan_port.masking.EnumInteger;

public enum FileMode implements EnumInteger {
    CREATE_NEW(1, "Creates a new file. An exception is raised if the file already exists."),
    CREATE(2, "Creates a new file. If the file already exists, it is overwritten."),
    OPEN(3, "Opens an existing file. An exception is raised if the file does not exist."),
    OPEN_OR_CREATE(4, "Opens the file if it exists. Otherwise, creates a new file."),
    TRUNCATE(5, "Opens an existing file. Once opened, the file is truncated so that its size is zero bytes. The calling process must open the file with at least WRITE access. An exception is raised if the file does not exist."),
    APPEND(6, "Opens the file if it exists and seeks to the end.  Otherwise, creates a new file.");

    private final int intValue;
    private final String description;

    FileMode(final int intValue, final String description) {
        this.intValue = intValue;
        this.description = description;
    }

    public static FileMode fromInt(final int value) {
        return EnumInteger.enumFromInt(value, values());
    }

    @Override
    public int intValue() {
        return this.intValue;
    }

    public String getDescription() {
        return this.description;
    }
}
