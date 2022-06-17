package ngserver.phys_storage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objects")
public class ObjectEntity {
    @Id
    @Column(name = "full_path")
    private String fullPath;
    @Column(name = "container_path")
    private String containerPath;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "underlying_path")
    private String underlyingPath;

    public String getFullPath() {
        return fullPath;
    }

    public String getContainerPath() {
        return containerPath;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUnderlyingPath() {
        return underlyingPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUnderlyingPath(String underlyingPath) {
        this.underlyingPath = underlyingPath;
    }

    public boolean isFile() {
        return this.type.equals("F");
    }

    public boolean isDirectory() {
        return this.type.equals("D");
    }
}
