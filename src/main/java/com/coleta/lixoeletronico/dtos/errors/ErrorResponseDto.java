package com.coleta.lixoeletronico.dtos.errors;

public record ErrorResponseDto(
            String code,
            String message,
            String cause,
            String exceptionClassName
) {
}
