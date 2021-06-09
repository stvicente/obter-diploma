package com.diploma.validacao.dto;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DisciplinaDTO {

    @Size(min = 8, max = 50, message="Nome deve ter entre 8 e 50 caracteres")
    @Pattern(regexp = "^[A-Za-z ]*$", message = "O nome deve possuir apenas letras")
    private String nome;

    @NotNull
    @Range(min = 0, max = 10, message="Nota da disciplina deve ser entre 0 e 10")
    private Double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
