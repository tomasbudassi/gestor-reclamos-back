package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.models.IssueType;
import com.uda.gestorreclamos.services.impl.IssueTypeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo_reclamo")
public class IssueTypeController {

    private final IssueTypeServiceImpl ISSUE_TYPE_SERVICE;

    public IssueTypeController(IssueTypeServiceImpl issue_type_service) {
        ISSUE_TYPE_SERVICE = issue_type_service;
    }

    @GetMapping("")
    public List<IssueType> getAll() {
        return ISSUE_TYPE_SERVICE.getAll();
    }

    @GetMapping("/{id}")
    public IssueType getById(@PathVariable Integer id) {
        return ISSUE_TYPE_SERVICE.getById(id);
    }
}
