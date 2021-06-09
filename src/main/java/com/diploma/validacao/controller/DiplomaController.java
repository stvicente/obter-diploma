package com.diploma.validacao.controller;

import com.diploma.validacao.dto.AlunoDTO;
import com.diploma.validacao.exception.ValidationError;
import com.diploma.validacao.service.DiplomaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("diplomas")
public class DiplomaController {
    private final DiplomaService diplomaService;

    public DiplomaController(DiplomaService diplomaService) {
        this.diplomaService = diplomaService;
    }

    @GetMapping(path = "/healthcheck")
    public String helloWorld() {
        return "OK";
    }

    @PostMapping(path ="/analiseNotas")
    public ResponseEntity<?> showDiploma(@RequestBody @Valid AlunoDTO alunoDTO) throws ValidationError {
        return ResponseEntity.ok(diplomaService.showDiploma(alunoDTO));
    }
}
