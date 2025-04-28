package com.coleta.lixoeletronico.services;

import com.coleta.lixoeletronico.dtos.CollectionPoint.CollectionPointRequestDto;
import com.coleta.lixoeletronico.dtos.CollectionPoint.CollectionPointResponseDto;

import java.util.List;

public interface CollectionPointService {

    List<CollectionPointResponseDto> findAll();
    CollectionPointResponseDto findById(Long id);
    List<CollectionPointResponseDto> findByElectronicWasteName(String name);
    CollectionPointResponseDto create(CollectionPointRequestDto dto);
    CollectionPointResponseDto update(Long id, CollectionPointRequestDto dto);
    void delete(Long id);
}
