package com.coleta.lixoeletronico.errors.exeptions;

public class CollectionPointNotFoundException extends NotFoundException {
    public CollectionPointNotFoundException(Long id) {
        super("Collection point", id);
    }
}