package com.coleta.lixoeletronico.services;

import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteRequestDto;
import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteResponseDto;
import com.coleta.lixoeletronico.entities.ElectronicWaste;

import java.util.List;

public interface ElectronicWasteService {

    List<ElectronicWasteResponseDto> findAll();
    ElectronicWasteResponseDto findById(Long id);
    ElectronicWasteResponseDto create(ElectronicWasteRequestDto dto);
    ElectronicWasteResponseDto update(Long id, ElectronicWasteRequestDto dto);
    void delete(Long id);

    ElectronicWaste findEntityById(Long id);
}
