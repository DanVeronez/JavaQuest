package com.javaquest.javaquest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.javaquest.javaquest.service.JavaQuestService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class JavaQuestController {
    
    @Autowired
    JavaQuestService javaQuestService;

    @GetMapping("/listaAlunos")
    public List<String> getAlunos() {
        return javaQuestService.ListaAlunos();
    }

    @GetMapping("/listaNumeros")
    public List<Integer> getNumeros() {
        return javaQuestService.ListaDeNumeros();
    }
}
