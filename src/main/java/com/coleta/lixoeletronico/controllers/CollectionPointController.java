package com.coleta.lixoeletronico.controllers;

import com.coleta.lixoeletronico.dtos.CollectionPoint.CollectionPointRequestDto;
import com.coleta.lixoeletronico.dtos.CollectionPoint.CollectionPointResponseDto;
import com.coleta.lixoeletronico.services.CollectionPointService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/collection_points")
public class CollectionPointController {

    private final CollectionPointService service;

    @GetMapping
    public List<CollectionPointResponseDto> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public CollectionPointResponseDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CollectionPointResponseDto save(@RequestBody CollectionPointRequestDto dto) {
        return service.create(dto);
    }

    @PutMapping("{id}")
    public CollectionPointResponseDto update(@PathVariable Long id, @RequestBody CollectionPointRequestDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
