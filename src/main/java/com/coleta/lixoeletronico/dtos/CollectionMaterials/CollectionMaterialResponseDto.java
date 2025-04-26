package com.coleta.lixoeletronico.dtos.CollectionMaterials;

import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteResponseDto;
import java.math.BigDecimal;

public record CollectionMaterialResponseDto(
        Long id,
        ElectronicWasteResponseDto electronicWasteResponseDto,
        BigDecimal maxCapacity
){
}
