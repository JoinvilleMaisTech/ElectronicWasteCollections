package com.coleta.lixoeletronico.errors.exeptions;

public abstract class NotFoundException extends RuntimeException {
    NotFoundException(String objectName, Long id) {
        super(objectName + " with id '" + id + "' not found");
    }
}