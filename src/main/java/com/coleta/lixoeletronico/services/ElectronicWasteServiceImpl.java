package com.coleta.lixoeletronico.services;

import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteRequestDto;
import com.coleta.lixoeletronico.dtos.ElectronicWaste.ElectronicWasteResponseDto;
import com.coleta.lixoeletronico.entities.ElectronicWaste;
import com.coleta.lixoeletronico.errors.exeptions.ElectronicWasteNotFoundException;
import com.coleta.lixoeletronico.mappers.ElectronicWasteMapper;
import com.coleta.lixoeletronico.repositories.ElectronicWasteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElectronicWasteServiceImpl implements ElectronicWasteService{

    private final ElectronicWasteRepository repository;

    @Override
    public List<ElectronicWasteResponseDto> findAll() {
        List<ElectronicWaste> entities = repository.findAll();
        return ElectronicWasteMapper.toResponseDtos(entities);
    }

    @Override
    public ElectronicWasteResponseDto findById(Long id) {
        ElectronicWaste entity = findEntityById(id);
        return ElectronicWasteMapper.toResponseDto(entity);
    }


    @Override
    public ElectronicWasteResponseDto create(ElectronicWasteRequestDto dto) {
        ElectronicWaste ew = ElectronicWasteMapper.toEntity(new ElectronicWaste(), dto);

        return ElectronicWasteMapper.toResponseDto(repository.save(ew));
    }

    @Override
    public ElectronicWasteResponseDto update(Long id, ElectronicWasteRequestDto dto) {
        ElectronicWaste ew = findEntityById(id);
        ElectronicWasteMapper.toEntity(ew, dto);

        return ElectronicWasteMapper.toResponseDto(repository.save(ew));
    }

    @Override
    public void delete(Long id) {
        ElectronicWaste ew = findEntityById(id);

        repository.delete(ew);
    }

    @Override
    public ElectronicWaste findEntityById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ElectronicWasteNotFoundException(id));
    }
}
