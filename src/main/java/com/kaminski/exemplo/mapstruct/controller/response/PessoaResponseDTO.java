package com.kaminski.exemplo.mapstruct.controller.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaResponseDTO {

    private String nome;
    private String sobrenome;
    private String documento;
    private Integer idade;

}