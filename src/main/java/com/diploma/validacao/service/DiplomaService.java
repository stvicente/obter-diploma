package com.diploma.validacao.service;

import com.diploma.validacao.dto.AlunoDTO;
import com.diploma.validacao.dto.DiplomaDTO;
import com.diploma.validacao.dto.DisciplinaDTO;
import org.springframework.stereotype.Service;

@Service
public class DiplomaService {

    public DiplomaDTO showDiploma(AlunoDTO alunoDTO){
//            throws ValidationError {
//        String nome = alunoDTO.getNome();
//        int length = alunoDTO.getNome().length();
//        if(length > 50 || length < 8) throw new ValidationError();

//        if()
        DiplomaDTO diplomaDTO = new DiplomaDTO();
        diplomaDTO.setAlunoDTO(alunoDTO);
        double media = alunoDTO.getDisciplinas()
                .stream()
                .mapToDouble(DisciplinaDTO::getNota)
                .average()
                .getAsDouble();
        diplomaDTO.setMedia(media);
        diplomaDTO.setMensagem("Sua média foi de " + media);
        return diplomaDTO;
    }
}
