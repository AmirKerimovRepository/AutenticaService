package com.example.AutenticaService.service;

import com.example.AutenticaService.Exceptions.IncorrectlyEnteredDataException;
import com.example.AutenticaService.domain.Request;


public class RequestValidationService {

    public void validate(Request request) {
        checkNotNull(request);
        quantityValidate(request);
    }

    void checkNotNull(Request request) {
        if (request == null) {
            throw new IncorrectlyEnteredDataException("Request Can't be null, please check your request.");
        }
    }

    private void quantityValidate(Request request) {
        if (request.getQuantity() < 1 || request.getQuantity() > 10) {
            throw new IncorrectlyEnteredDataException("Quantity Can't be smaller that 1, and bigger that 10.");
        }
    }

}
