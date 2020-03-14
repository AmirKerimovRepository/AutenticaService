package com.example.AutenticaService.service;

import com.example.AutenticaService.Exceptions.RequestValidationServiceException;
import com.example.AutenticaService.domain.Request;
import com.example.AutenticaService.repository.RequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RequestService {

    private final RequestRepository repository;

    RequestValidationService validationService;

    public RequestService(RequestRepository repository) {
        this.repository = repository;

    }


    public Request findById(Long id) {
        if (id == null) {
            throw new RequestValidationServiceException("Id can't be null, please check your input and try again");
        } else {
            return repository.getOne(id);
        }
    }

    public List<Request> findAllRequests() {
        return repository.findAll();
    }

    public Request addRequest(Request request) {
        validationService.validate(request);
        return repository.save(request);

    }


    public void deleteByID(Long id) {
        if (id == null) {
            throw new RequestValidationServiceException("Wrong Request id, its not possible to delete Request");
        } else {
            repository.deleteById(id);
        }
    }

    public void updateRequest(Request request) {
        if (request == null) {
            throw new RequestValidationServiceException("Wrong Request , its not possible to update ");
        } else {
            repository.save(request);
        }

    }

}
