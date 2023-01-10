package com.kaminski.exemplo.mapstruct.controller.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PessoaRequestDTO {

    private String nome;
    private String sobrenome;
    private String documento;
    private LocalDate dataNascimento;

}