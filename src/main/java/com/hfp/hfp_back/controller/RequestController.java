package com.hfp.hfp_back.controller;

import com.hfp.hfp_back.model.Request;
import com.hfp.hfp_back.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {
    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<Request> getAllRequest() {
        return requestService.getAllRequest();
    }

    @PostMapping("/request/create")
    public void addRequest(@RequestBody Request request) {
        requestService.addRequest(requestService);
    }

    @GetMapping ("/request")
    public void deleteMemberRSO(@RequestParam Long id) {requestService.deleteRequest(id); }
}
