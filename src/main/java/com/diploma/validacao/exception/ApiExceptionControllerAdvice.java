package com.diploma.validacao.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ApiExceptionControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler (ValidationError.class)
    protected ResponseEntity<Object> handleExcept (Exception e, WebRequest wr) {
        String msg = null;
        if ( e instanceof ValidationError ) msg = "Student name must be between 8 and 50 char";
//        if ( e instanceof InvalidSubjectName ) msg = "Subject name must be between 8 and 50 char";

        return handleExceptionInternal(e, msg, new HttpHeaders(), HttpStatus.CONFLICT, wr);
    }
}



