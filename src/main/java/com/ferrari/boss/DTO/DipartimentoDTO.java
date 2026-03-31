package com.ferrari.boss.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DipartimentoDTO {
    private int idDipartimento;
    private String nomeReparto;
    private String sedeGeografica;
}
