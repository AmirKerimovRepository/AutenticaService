package com.example.AutenticaService.Exceptions;

public class IncorrectlyEnteredDataException extends RuntimeException {
    public IncorrectlyEnteredDataException(String messages) {
        super(messages);
    }
}
