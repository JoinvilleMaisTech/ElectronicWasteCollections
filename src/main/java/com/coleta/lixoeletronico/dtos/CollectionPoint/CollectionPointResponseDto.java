package com.coleta.lixoeletronico.dtos.CollectionPoint;


import com.coleta.lixoeletronico.dtos.CollectionMaterials.CollectionMaterialResponseDto;
import java.util.List;

public record CollectionPointResponseDto(
        Long id,
        String name,
        String address,
        String collectionDay,
        List<CollectionMaterialResponseDto> materials
){
}
