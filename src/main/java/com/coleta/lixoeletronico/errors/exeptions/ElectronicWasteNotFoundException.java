package com.coleta.lixoeletronico.errors.exeptions;

public class ElectronicWasteNotFoundException extends NotFoundException {
    public ElectronicWasteNotFoundException(Long id) {
        super("Electronic waste", id);
    }
}