package com.kaminski.exemplo.mapstruct.mapper;

import com.kaminski.exemplo.mapstruct.controller.request.PessoaRequestDTO;
import com.kaminski.exemplo.mapstruct.domain.People;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "string")
public interface PessoaRequestMapper {

    @Mapping(source = "nome", target = "name")
    @Mapping(source = "sobrenome", target = "lastName")
    @Mapping(source = "documento", target = "document")
    @Mapping(source = "dataNascimento", target = "birthDate")
    People pessoaRequestDtoToPessoa(PessoaRequestDTO requestDTO);

}