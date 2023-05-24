package com.example.tddestudo.controller;

import com.example.tddestudo.model.FilmeModel;
import com.example.tddestudo.service.FilmeService;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class FilmeControllerTest {
    @Autowired
    private FilmeController filmeController;
    @MockBean
    private FilmeService filmeService;
    @BeforeEach
    public void setup() {
        standaloneSetup(this.filmeController);
    }
    @Test
    public void deveRetornarSucesso_QuandoBuscarFilme(){
        long filmeCodigo = 1L;
        FilmeModel filmeModel = new FilmeModel(filmeCodigo, "O Poderoso Chefão", "Sem descrição");

        when(this.filmeService.obterFilme(filmeCodigo))
                .thenReturn(filmeModel);
        given()
                .accept(ContentType.JSON)
                .when()
                .get("/filmes/{codigo}", filmeCodigo)
                .then()
                .statusCode(HttpStatus.OK.value());
    }
}