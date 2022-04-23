package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.services.impl.IssueServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/reclamo")
public class IssueController {

    private final IssueServiceImpl ISSUE_SERVICE;

    IssueController(IssueServiceImpl issueService) {
        this.ISSUE_SERVICE = issueService;
    }

    @GetMapping("")
    public List<Issue> getAll() {
        return ISSUE_SERVICE.getAll();
    }

    @GetMapping("/{id}")
    public Issue getById(@PathVariable Integer id) {
        return ISSUE_SERVICE.getById(id);
    }
}
