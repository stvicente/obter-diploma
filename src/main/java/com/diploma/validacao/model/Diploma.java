package com.diploma.validacao.model;

import lombok.Data;

@Data
public class Diploma {
    public String mensagem;
    public double media;
    public Aluno aluno;

    public Diploma(){}

    public Diploma(String mensagem, double media, Aluno aluno) {
        this.mensagem = mensagem;
        this.media = media;
        this.aluno = aluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}

