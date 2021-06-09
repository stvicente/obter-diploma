package com.diploma.validacao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationError extends RuntimeException{

    public ValidationError(String message) {
        super(message);
    }
}
