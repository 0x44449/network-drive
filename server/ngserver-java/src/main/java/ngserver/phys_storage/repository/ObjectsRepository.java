package ngserver.phys_storage.repository;

import ngserver.phys_storage.entity.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectsRepository extends JpaRepository<ObjectEntity, String> {
    @Query(value = "CALL Objects_Select_ObjectByFullPath(:in_full_path);", nativeQuery = true)
    List<ObjectEntity> findObjectByFullPath(@Param("in_full_path") String fullPath);
}
