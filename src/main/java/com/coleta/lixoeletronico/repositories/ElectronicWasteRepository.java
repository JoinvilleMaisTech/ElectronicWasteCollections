package com.coleta.lixoeletronico.repositories;

import com.coleta.lixoeletronico.entities.ElectronicWaste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicWasteRepository extends JpaRepository<ElectronicWaste, Long> {
}
