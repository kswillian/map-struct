package com.kaminski.exemplo.mapstruct.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
public class People {

    private String name;
    private String lastName;
    private String document;
    private Integer age;
    private LocalDate birthDate;

    public Integer getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}