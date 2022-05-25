package drive_common.dokan_port.constants.microsoft;

import drive_common.dokan_port.masking.MaskValueEnum;
import drive_common.dokan_port.masking.MaskValueSet;

public enum FileShare implements MaskValueEnum {
    NONE(0),
    READ(1),
    WRITE(2),
    READ_WRITE(3),
    DELETE(4),
    INHERITABLE(16);

    private final int maskingValue;

    public static MaskValueSet<FileShare> maskValueSet(final int mask) {
        return MaskValueSet.maskValueSet(mask, values());
    }

    FileShare(final int maskingValue) {
        this.maskingValue = maskingValue;
    }

    @Override
    public int intValue() {
        return this.maskingValue;
    }
}
