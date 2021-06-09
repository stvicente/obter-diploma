package com.diploma.validacao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ValidationError.class)
    public ResponseEntity<ApiExceptionDetails> handlerValidationException(ValidationError e){
        return new ResponseEntity<>(
                ApiExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST);
    }
}



