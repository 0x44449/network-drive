package ngserver.phys_storage.repository;

import ngserver.phys_storage.entity.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ObjectsRepository extends JpaRepository<ObjectEntity, String> {
    @Query(value = "CALL Objects_Select_ObjectByFullPath(:in_full_path);", nativeQuery = true)
    ObjectEntity findObjectByFullPath(@Param("in_full_path") String fullPath);

    @Query(value = "CALL Objects_Insert_Object(:in_full_path, :in_container_path, :in_name, :in_underlying_path, :in_file_attributes, :in_file_creation_time, :in_file_last_write_time, :in_file_last_access_time, :in_file_size);", nativeQuery = true)
    void addObject(
            @Param("in_full_path") String fullPath,
            @Param("in_container_path") String containerPath,
            @Param("in_name") String name,
            @Param("in_underlying_path") String underlyingPath,
            @Param("in_file_attributes") int fileAttributes,
            @Param("in_file_creation_time") LocalDateTime fileCreationTime,
            @Param("in_file_last_write_time") LocalDateTime fileLastWriteTime,
            @Param("in_file_last_access_time") LocalDateTime fileLastAccessTime,
            @Param("in_file_size") long fileSize);

    @Query(value = "CALL Objects_Delete_ObjectByFullPath(:in_full_path);", nativeQuery = true)
    void removeObjectByFullPath(@Param("in_full_path") String fullPath);
}
