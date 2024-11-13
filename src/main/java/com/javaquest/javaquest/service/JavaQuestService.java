package com.javaquest.javaquest.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class JavaQuestService {

    public List<String> ListaAlunos(){

        List<String> listaAlunos = new ArrayList<String>();

        listaAlunos.add("Joaoinho");
        listaAlunos.add("Mariazinha");
        listaAlunos.add("Roberto");
        listaAlunos.add("Antonio");
        listaAlunos.add("Vinicius");
        listaAlunos.add("Daniel");
        listaAlunos.add("Barrabas");
        listaAlunos.add("Carlos");
        listaAlunos.add("Paulo");
        listaAlunos.add("Gretchen");

        System.out.println(listaAlunos);

        System.out.println("Lista ordenada");
        ListaAlunosOrdenada(listaAlunos);
        System.out.println(listaAlunos);

        return listaAlunos;
    }

    public List<String> ListaAlunosOrdenada(List<String> listaAlunos){

        Collections.sort(listaAlunos);

    return listaAlunos;
    }

    public List<Integer> OdernadorDeNumeros(List<Integer> numeros){

        Collections.sort(numeros);

        return numeros;
    }

    public List<Integer> ListaDeNumeros(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(30);
        numeros.add(20);
        numeros.add(50);
        numeros.add(10);
        numeros.add(40);

        System.out.println(numeros);

        OdernadorDeNumeros(numeros);
        System.out.println("numeros ordenados");
        System.out.println(numeros);

        OdernadorDeNumerosReverso(numeros);
        System.out.println("numeros ordenados reverso");
        System.out.println(numeros);
        
        return numeros;
    }

    public List<Integer> OdernadorDeNumerosReverso(List<Integer> numeros){

        Collections.sort(numeros, Collections.reverseOrder());

        return numeros;
    }
    
}
