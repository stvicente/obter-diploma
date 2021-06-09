package com.diploma.validacao.dto;

public class DiplomaDTO {
    public String mensagem;
    public double media;
    public AlunoDTO alunoDTO;

    public DiplomaDTO(){}

    public DiplomaDTO(AlunoDTO alunoDTO, double media, String mensagem) {
        this.alunoDTO = alunoDTO;
        this.media = media;
        this.mensagem = mensagem;
    }

    public AlunoDTO getAlunoDTO() {
        return alunoDTO;
    }

    public void setAlunoDTO(AlunoDTO alunoDTO) {
        this.alunoDTO = alunoDTO;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
