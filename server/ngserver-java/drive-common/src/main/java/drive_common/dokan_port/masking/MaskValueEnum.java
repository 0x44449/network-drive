package drive_common.dokan_port.masking;

public interface MaskValueEnum extends EnumInteger {

    default int maskingValue() {
        return intValue();
    }
}