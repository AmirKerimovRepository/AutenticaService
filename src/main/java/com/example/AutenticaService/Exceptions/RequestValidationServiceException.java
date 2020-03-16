package com.example.AutenticaService.Exceptions;

public class RequestValidationServiceException extends RuntimeException {
    public RequestValidationServiceException(String messages) {
        super(messages);
    }
}

