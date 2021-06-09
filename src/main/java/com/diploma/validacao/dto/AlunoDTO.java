package com.diploma.validacao.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class AlunoDTO {

    @Size(min = 8, max = 50, message="Nome deve ter entre 8 e 50 caracteres")
    @Pattern(regexp = "^[A-Za-z ]*$", message = "O nome deve possuir apenas letras")
    private String nome;

    @Valid
    private List<DisciplinaDTO> disciplinas;

    public AlunoDTO(){}

    public AlunoDTO(String nome, List<DisciplinaDTO> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<DisciplinaDTO> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaDTO> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
