package drive_common.dokan_port.constants.microsoft;

import drive_common.dokan_port.masking.EnumInteger;

/**
 * @see <a href="https://docs.microsoft.com/en-us/windows-hardware/drivers/ddi/content/wdm/nf-wdm-zwcreatefile#parameters">Microsoft documentation of ZwCreateFile</a>
 * @see <a href="https://dokan-dev.github.io/dokany-doc/html/struct_d_o_k_a_n___o_p_e_r_a_t_i_o_n_s.html#a40c2f61e1287237f5fd5c2690e795183">Dokany documentation of ZwCreateFile</a>
 */
public enum CreateDisposition implements EnumInteger {

    FILE_SUPERSEDE(CreateDispositions.FILE_SUPERSEDE),
    FILE_OPEN(CreateDispositions.FILE_OPEN),
    FILE_CREATE(CreateDispositions.FILE_CREATE),
    FILE_OPEN_IF(CreateDispositions.FILE_OPEN_IF),
    FILE_OVERWRITE(CreateDispositions.FILE_OVERWRITE),
    FILE_OVERWRITE_IF(CreateDispositions.FILE_OVERWRITE_IF);

    private final int intValue;

    CreateDisposition(int intValue) {
        this.intValue = intValue;
    }

    public static CreateDisposition fromInt(final int value) {
        return EnumInteger.enumFromInt(value, values());
    }

    @Override
    public int intValue() {
        return this.intValue;
    }
}