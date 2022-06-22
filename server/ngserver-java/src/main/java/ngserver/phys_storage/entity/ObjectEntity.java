package ngserver.phys_storage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

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
    @Column(name = "file_attributes")
    private int fileAttributes;
    @Column(name = "file_creation_time")
    private LocalDateTime fileCreationTime;
    @Column(name = "file_last_write_time")
    private LocalDateTime fileLastWriteTime;
    @Column(name = "file_last_access_time")
    private LocalDateTime fileLastAccessTime;
    @Column(name = "file_size")
    private long fileSize;

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

    public int getFileAttributes() {
        return fileAttributes;
    }

    public void setFileAttributes(int fileAttributes) {
        this.fileAttributes = fileAttributes;
    }

    public LocalDateTime getFileCreationTime() {
        return fileCreationTime;
    }

    public void setFileCreationTime(LocalDateTime fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
    }

    public LocalDateTime getFileLastWriteTime() {
        return fileLastWriteTime;
    }

    public void setFileLastWriteTime(LocalDateTime fileLastWriteTime) {
        this.fileLastWriteTime = fileLastWriteTime;
    }

    public LocalDateTime getFileLastAccessTime() {
        return fileLastAccessTime;
    }

    public void setFileLastAccessTime(LocalDateTime fileLastAccessTime) {
        this.fileLastAccessTime = fileLastAccessTime;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isFile() {
        return this.type.equals("F");
    }

    public boolean isDirectory() {
        return this.type.equals("D");
    }
}
