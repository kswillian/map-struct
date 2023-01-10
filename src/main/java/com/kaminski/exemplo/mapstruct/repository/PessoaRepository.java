package com.kaminski.exemplo.mapstruct.repository;

import com.kaminski.exemplo.mapstruct.domain.People;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PessoaRepository {

    private final ArrayList<People> LISTA_PESSOAS = new ArrayList<>();

    public People cadastrar(People people){
        LISTA_PESSOAS.add(people);
        return people;
    }

    public List<People> consultar(){
        return LISTA_PESSOAS;
    }

}