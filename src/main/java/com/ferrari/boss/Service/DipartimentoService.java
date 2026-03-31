package com.ferrari.boss.Service;


import com.ferrari.boss.Converter.DipartimentoConverter;
import com.ferrari.boss.DTO.DipartimentoDTO;
import com.ferrari.boss.Model.Dipartimento;
import com.ferrari.boss.Repository.DipartimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipartimentoService extends AbstractService<Dipartimento, DipartimentoDTO>{

    private DipartimentoConverter converter;
    private DipartimentoRepository repository;

    public DipartimentoService(DipartimentoRepository repository, DipartimentoConverter converter) {
        super(repository, converter);
        this.converter = converter;
        this.repository = repository;
    }

    public List<DipartimentoDTO> findDipartimentoBySedeGeografica(String sedeGeografica) {
        return converter.toDTOList(repository.findDipartimentoBySedeGeografica(sedeGeografica));
    }

    public DipartimentoDTO findDipartimentoByNomeReparto(String nomeReparto) {
        return converter.toDTO(repository.findDipartimentoByNomeReparto(nomeReparto));
    }
}
