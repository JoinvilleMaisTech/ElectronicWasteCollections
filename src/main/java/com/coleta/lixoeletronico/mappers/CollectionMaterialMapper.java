package com.coleta.lixoeletronico.mappers;


import com.coleta.lixoeletronico.dtos.CollectionMaterials.CollectionMaterialResponseDto;
import com.coleta.lixoeletronico.entities.CollectionMaterial;

import java.util.List;

public class CollectionMaterialMapper {
    private CollectionMaterialMapper() {}


    public static CollectionMaterialResponseDto toResponseDto(CollectionMaterial entity) {
        return new CollectionMaterialResponseDto(
                entity.getId(),
                ElectronicWasteMapper.toResponseDto(entity.getElectronicWaste()),
                entity.getMaxCapacity()
        );
    }

    public static List<CollectionMaterialResponseDto> toResponseDtos(List<CollectionMaterial> entities) {
        return entities.stream().map(CollectionMaterialMapper::toResponseDto).toList();
    }
}
