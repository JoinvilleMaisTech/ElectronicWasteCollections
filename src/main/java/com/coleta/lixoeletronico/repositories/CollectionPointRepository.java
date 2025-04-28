package com.coleta.lixoeletronico.repositories;

import com.coleta.lixoeletronico.entities.CollectionPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CollectionPointRepository extends JpaRepository<CollectionPoint, Long> {

    @Query("SELECT DISTINCT cp FROM CollectionPoint cp JOIN cp.materials m JOIN m.electronicWaste ew WHERE LOWER(ew.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<CollectionPoint> findByElectronicWasteNameContainingIgnoreCase(@Param("name") String name);
}
