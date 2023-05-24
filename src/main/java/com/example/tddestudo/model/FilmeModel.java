package com.example.tddestudo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmeModel {

    private Long codigo;
    private String titulo;
    private String descricao;
}
