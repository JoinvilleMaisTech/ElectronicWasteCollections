package com.coleta.lixoeletronico.mappers;

import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteRequestDto;
import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteResponseDto;
import com.coleta.lixoeletronico.entities.ElectronicWaste;

import java.util.List;

public class ElectronicWasteMapper {
    private ElectronicWasteMapper() {}


    public static ElectronicWaste toEntity(ElectronicWaste entity, ElectronicWasteRequestDto dto) {
        entity.setTypeWaste(dto.typeWaste());
        entity.setDescription(dto.description());
        return entity;
    }

    public static ElectronicWasteResponseDto toResponseDto(ElectronicWaste entity) {
        return new ElectronicWasteResponseDto(
                entity.getId(),
                entity.getTypeWaste(),
                entity.getDescription()
        );
    }

    public static List<ElectronicWasteResponseDto> toResponseDtos(List<ElectronicWaste> entities) {
        return entities.stream().map(ElectronicWasteMapper::toResponseDto).toList();
    }
}
