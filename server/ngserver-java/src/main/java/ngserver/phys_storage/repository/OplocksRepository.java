package ngserver.phys_storage.repository;

import ngserver.phys_storage.entity.OplockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OplocksRepository extends JpaRepository<OplockEntity, String> {
    @Query(value = "CALL Oplocks_Select_OplockByFullPath(:in_full_path);", nativeQuery = true)
    List<OplockEntity> findOplockByFullPath(@Param("in_full_path") String fullPath);
}
