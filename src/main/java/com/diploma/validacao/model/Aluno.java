package com.diploma.validacao.model;

import com.diploma.validacao.dto.DisciplinaDTO;
import lombok.Data;

import java.util.List;

@Data
public class Aluno {
    public String nome;
    public List<Disciplina> disciplinas;

    public Aluno(){}

    public Aluno(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}

