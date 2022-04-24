package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.services.IssueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reclamo")
public class IssueController {

    private final IssueService ISSUE_SERVICE;

    @GetMapping("")
    public List<IssueResponseDTO> getAll() {
        return ISSUE_SERVICE.getAll();
    }

    @GetMapping("/{id}")
    public Issue getById(@PathVariable Integer id) {
        return ISSUE_SERVICE.getById(id);
    }
}
