package com.coleta.lixoeletronico.mappers;

import com.coleta.lixoeletronico.dtos.CollectionPoint.CollectionPointRequestDto;
import com.coleta.lixoeletronico.dtos.CollectionPoint.CollectionPointResponseDto;
import com.coleta.lixoeletronico.entities.CollectionPoint;

import java.util.List;

public class CollectionPointMapper {
    private CollectionPointMapper() {}


    public static CollectionPoint toEntity(CollectionPoint entity, CollectionPointRequestDto dto) {
        entity.setName(dto.name());
        entity.setAddress(dto.address());
        entity.setCollectionDay(dto.collectionDay());
        return entity;
    }

    public static CollectionPointResponseDto toResponseDto(CollectionPoint entity) {
        return new CollectionPointResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getAddress(),
                entity.getCollectionDay(),
                CollectionMaterialMapper.toResponseDtos(entity.getMaterials())
        );
    }

    public static List<CollectionPointResponseDto> toResponseDtos(List<CollectionPoint> entities) {
        return entities.stream().map(CollectionPointMapper::toResponseDto).toList();
    }
}
