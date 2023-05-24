package com.example.tddestudo.controller;

import com.example.tddestudo.model.FilmeModel;
import com.example.tddestudo.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping("/{codigo}")
    public ResponseEntity<FilmeModel> obterFilme(@PathVariable Long codigo) {
        FilmeModel filmeModel = this.filmeService.obterFilme(codigo);

        if (filmeModel == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filmeModel);
    }
}
