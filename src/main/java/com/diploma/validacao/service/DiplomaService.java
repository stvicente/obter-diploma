package com.diploma.validacao.service;

import com.diploma.validacao.dto.AlunoDTO;
import com.diploma.validacao.dto.DiplomaDTO;
import com.diploma.validacao.exception.ValidationError;
import org.springframework.stereotype.Service;

@Service
public class DiplomaService {

    public DiplomaDTO showDiploma(AlunoDTO alunoDTO) throws ValidationError {
        DiplomaDTO diplomaDTO = new DiplomaDTO();
        diplomaDTO.setAlunoDTO(alunoDTO);
        double media = alunoDTO.getDisciplinas()
                .stream()
                .mapToDouble(disciplina -> disciplina.getNota())
                .average()
                .getAsDouble();
        diplomaDTO.setMedia(media);
        diplomaDTO.setMensagem("Sua média foi de " + media);
        return diplomaDTO;
    }
}
