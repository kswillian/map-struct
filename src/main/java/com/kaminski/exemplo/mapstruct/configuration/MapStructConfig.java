package com.kaminski.exemplo.mapstruct.configuration;

import com.kaminski.exemplo.mapstruct.mapper.PessoaRequestMapperImpl;
import com.kaminski.exemplo.mapstruct.mapper.PessoaResponseDTOMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapStructConfig {

    @Bean
    public PessoaRequestMapperImpl PessoaRequestMapperConfig(){
        return new PessoaRequestMapperImpl();
    }

    @Bean
    public PessoaResponseDTOMapperImpl PessoaResponseDTOMapperConfig(){
        return new PessoaResponseDTOMapperImpl();
    }

}