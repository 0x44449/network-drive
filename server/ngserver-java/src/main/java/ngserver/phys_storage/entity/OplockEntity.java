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
    @Column(name = "owner")
    private String owner;
    @Column(name = "lock_bit")
    private String lockBit;

    public String getFullPath() {
        return fullPath;
    }

    public String getOwner() {
        return owner;
    }

    public String getLockBit() {
        return lockBit;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLockBit(String lockBit) {
        this.lockBit = lockBit;
    }
}
