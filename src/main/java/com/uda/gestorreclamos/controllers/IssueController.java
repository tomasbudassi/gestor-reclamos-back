package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.services.IssueService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reclamos")
public class IssueController {

    private final IssueService ISSUE_SERVICE;

    @GetMapping("/todos")
    public List<IssueResponseDTO> getAll() {
        return ISSUE_SERVICE.getAll();
    }

    @GetMapping("")
    public List<IssueResponseDTO> getAllWithoutCloses() {
        return ISSUE_SERVICE.getAllWithoutCloses("Cerrado");
    }

    @GetMapping("/estado/{status}")
    public List<IssueResponseDTO> getByStatus(@PathVariable String status) {
        return ISSUE_SERVICE.getByStatus(status);
    }

    @PostMapping("")
    public Issue newIssue(@RequestBody Issue newEmployee) {
        return ISSUE_SERVICE.insert(newEmployee);
    }

    @GetMapping("/{id}")
    public Issue getById(@PathVariable Integer id) {
        return ISSUE_SERVICE.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIssue(@PathVariable Integer id) {
        ISSUE_SERVICE.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
