package com.kaminski.exemplo.mapstruct.mapper;

import com.kaminski.exemplo.mapstruct.controller.response.PessoaResponseDTO;
import com.kaminski.exemplo.mapstruct.domain.People;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "string")
public interface PessoaResponseDTOMapper {

    @Mapping(source = "name", target = "nome")
    @Mapping(source = "lastName", target = "sobrenome")
    @Mapping(source = "document", target = "documento")
    @Mapping(source = "age", target = "idade")
    PessoaResponseDTO pessoaToPessoaResponseDto(People people);

}