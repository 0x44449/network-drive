package ngserver.phys_storage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oplocks")
public class OplockEntity {
    @Id
    @Column(name = "full_path")
    private String fullPath;
    @Column(name = "lock_bit")
    private int lockBit;

    public String getFullPath() {
        return fullPath;
    }

    public int getLockBit() {
        return lockBit;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public void setLockBit(int lockBit) {
        this.lockBit = lockBit;
    }
}
