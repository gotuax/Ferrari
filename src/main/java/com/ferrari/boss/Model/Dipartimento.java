package com.ferrari.boss.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dipartiimento", schema = "ferrari")
public class Dipartimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDipartimento;

    @Column(nullable = false, unique = true)
    private String nomeReparto;

    private String sedeGeografica;
}
