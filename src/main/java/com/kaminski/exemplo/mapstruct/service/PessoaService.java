package com.kaminski.exemplo.mapstruct.service;

import com.kaminski.exemplo.mapstruct.domain.People;
import com.kaminski.exemplo.mapstruct.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public People cadastrar(People people){
        return pessoaRepository.cadastrar(people);
    }

    public List<People> consultar(){
        return pessoaRepository.consultar();
    }

}