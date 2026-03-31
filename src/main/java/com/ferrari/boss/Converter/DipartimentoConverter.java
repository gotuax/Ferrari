package com.ferrari.boss.Converter;

import com.ferrari.boss.DTO.DipartimentoDTO;
import com.ferrari.boss.Model.Dipartimento;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DipartimentoConverter extends AbstractConverter<DipartimentoDTO, Dipartimento>{
    final private ModelMapper mapper = new ModelMapper();

    @Override
    public Dipartimento toEntity(DipartimentoDTO dipartimentoDTO) {
        return mapper.map(dipartimentoDTO, Dipartimento.class);
    }

    @Override
    public DipartimentoDTO toDTO(Dipartimento dipartimento) {
        return mapper.map(dipartimento, DipartimentoDTO.class);
    }
}
