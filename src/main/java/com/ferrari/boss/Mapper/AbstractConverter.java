package com.ferrari.boss.Mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<DTO, Entity> implements Converter<DTO, Entity> {

    @Override
    public List<DTO> toDTOList(Iterable<Entity> entityList) {
        List<DTO> list = new ArrayList<>();
        for (Entity entity : entityList) {
            list.add(toDTO(entity));
        }
        return list;
    }

    @Override
    public List<Entity> toEntityList(Iterable<DTO> dtoList) {
        List<Entity> list = new ArrayList<>();
        for (DTO dto : dtoList) {
            list.add(toEntity(dto));
        }
        return list;
    }
}
