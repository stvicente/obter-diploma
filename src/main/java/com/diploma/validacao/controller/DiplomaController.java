package com.diploma.validacao.controller;

import com.diploma.validacao.dto.AlunoDTO;
import com.diploma.validacao.exception.ValidationError;
import com.diploma.validacao.service.DiplomaService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

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
    public ResponseEntity<?> showDiploma(@RequestBody @Valid AlunoDTO alunoDTO, Errors errors) throws Exception {
            if (errors.hasErrors()) {
                // Extract ConstraintViolation list from body errors
                List<ConstraintViolation<?>> violationsList = new ArrayList<>();
                for (ObjectError e : errors.getAllErrors()) {
                    violationsList.add(e.unwrap(ConstraintViolation.class));
                }

                String exceptionMessage = "";

                // Construct a helpful message for each input violation
                for (ConstraintViolation<?> violation : violationsList) {
                    exceptionMessage += violation.getPropertyPath() + " " + violation.getMessage() + "\n";
                }
                throw new Exception(String.format("Request input is invalid:\n%s", exceptionMessage));
            }
            return ResponseEntity.ok(diplomaService.showDiploma(alunoDTO));
    }
}
