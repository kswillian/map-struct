package com.kaminski.exemplo.mapstruct.controller;

import com.kaminski.exemplo.mapstruct.controller.request.PessoaRequestDTO;
import com.kaminski.exemplo.mapstruct.controller.response.PessoaResponseDTO;
import com.kaminski.exemplo.mapstruct.domain.People;
import com.kaminski.exemplo.mapstruct.mapper.PessoaRequestMapper;
import com.kaminski.exemplo.mapstruct.mapper.PessoaResponseDTOMapper;
import com.kaminski.exemplo.mapstruct.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaRequestMapper pessoaRequestMapper;
    private final PessoaResponseDTOMapper pessoaResponseDTOMapper;

    @PostMapping
    public ResponseEntity<PessoaResponseDTO> cadastrar(@RequestBody PessoaRequestDTO responseDTO){

        var pessoa = pessoaRequestMapper.pessoaRequestDtoToPessoa(responseDTO);

        var response = pessoaService.cadastrar(pessoa);

        var pessoaResponse = pessoaResponseDTOMapper.pessoaToPessoaResponseDto(response);

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaResponse);

    }

    @GetMapping
    public ResponseEntity<List<People>> consultar(){

        var pessoaResponse = pessoaService.consultar();
        return ResponseEntity.status(HttpStatus.OK).body(pessoaResponse);

    }

}