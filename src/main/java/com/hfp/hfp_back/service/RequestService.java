package com.hfp.hfp_back.service;

import com.hfp.hfp_back.model.Request;
import com.hfp.hfp_back.repository.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepo requestRepo;

    @Autowired
    public  RequestService(RequestRepo requestRepo) {
        this.requestRepo = requestRepo;
    }

    public List<Request> getAllORequest() {
        return (List<Request>) requestRepo.findAll();
    }

    public void addRequest(Request request) {
        requestRepo.save(request);
    }

    public void deleteRequest(Long id) {
        requestRepo.deleteRequestById(id);
    }

    public void addRequest(RequestService requestService) {
    }

}
