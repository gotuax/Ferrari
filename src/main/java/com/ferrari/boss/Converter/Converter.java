package com.ferrari.boss.Converter;

import java.util.List;

public interface Converter <DTO, Entity>
{

     Entity toEntity(DTO dto);

     DTO toDTO(Entity entity);

     List<DTO> toDTOList(Iterable<Entity> entityList);
     List<Entity> toEntityList(Iterable<DTO> entityList);

}
