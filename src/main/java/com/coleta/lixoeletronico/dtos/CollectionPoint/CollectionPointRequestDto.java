package com.coleta.lixoeletronico.dtos.CollectionPoint;


import com.coleta.lixoeletronico.dtos.CollectionMaterials.CollectionMaterialRequestDto;
import java.util.List;

public record CollectionPointRequestDto(
        String name,
        String address,
        String collectionDay,
        List<CollectionMaterialRequestDto> materials
){
}
