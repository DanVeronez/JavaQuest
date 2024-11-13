package com.javaquest.javaquest.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class JavaQuestService {

    public List<String> ListaAlunos(){

        List<String> listaAlunos = new ArrayList<String>();
        listaAlunos.add("joaoinho");
        listaAlunos.add("antonio");
        listaAlunos.add("mariazinha");
        System.out.println(listaAlunos);
        return listaAlunos;
    }
}
