package com.example.tddestudo.service;

import com.example.tddestudo.model.FilmeModel;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    public FilmeModel obterFilme(Long codigo) {
        if (codigo > 100) {
            return null;
        }

        return new FilmeModel(
                codigo,
                "O Poderoso Chefão",
                "Sem Descrição"
        );
    }
}
