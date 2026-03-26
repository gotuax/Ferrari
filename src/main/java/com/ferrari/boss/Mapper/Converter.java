package com.ferrari.boss.Mapper;

import jakarta.persistence.Entity;

import java.util.List;

public interface Converter <DTO, Entity>
{

     Entity toEntity(DTO dto);

     DTO toDTO(Entity entity);

     List<DTO> toDTOList(Iterable<Entity> entityList);
     List<Entity> toEntityList(Iterable<DTO> entityList);

}
