package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.models.IssueType;
import com.uda.gestorreclamos.services.IssueTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tipos_reclamo")
public class IssueTypeController {

    private final IssueTypeService ISSUE_TYPE_SERVICE;

    @GetMapping("")
    public List<IssueType> getAll() {
        return ISSUE_TYPE_SERVICE.getAll();
    }

    @GetMapping("/{id}")
    public IssueType getById(@PathVariable Integer id) {
        return ISSUE_TYPE_SERVICE.getById(id);
    }
}
