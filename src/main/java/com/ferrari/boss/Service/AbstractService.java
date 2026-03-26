package com.ferrari.boss.Service;

import com.ferrari.boss.Mapper.Converter;
import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractService<ENTITY, DTO> implements ServiceDTO<DTO> {

    protected JpaRepository<ENTITY, Integer> repository;
    protected Converter<DTO, ENTITY> converter;

    protected AbstractService(JpaRepository<ENTITY, Integer> repository, Converter<DTO, ENTITY> converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public Iterable<DTO> getAll() {
        return converter.toDTOList(repository.findAll());
    }

    @Override
    public DTO read(Integer id) {
        return converter.toDTO(repository.findById(id).get());
    }

    @Override
    public DTO insert(DTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }

    @Override
    public DTO update(DTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
