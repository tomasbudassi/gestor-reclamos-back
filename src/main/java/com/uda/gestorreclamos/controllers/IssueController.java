package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.dtos.IssueRequestDTO;
import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.dtos.IssueUpdateRequestDTO;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.services.IssueService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.uda.gestorreclamos.utils.Constants.STATUS_CERRADO;

@RestController
@AllArgsConstructor
@RequestMapping("/reclamos")
public class IssueController {

    private final IssueService ISSUE_SERVICE;

    @GetMapping("/todos")
    public List<IssueResponseDTO> getAll(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                                         @RequestParam(value = "size", required = false, defaultValue = "100") int size) {
        return ISSUE_SERVICE.getAll(page, size);
    }

    @GetMapping("")
    public List<IssueResponseDTO> getAllWithoutCloses(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                                                      @RequestParam(value = "size", required = false, defaultValue = "100") int size) {
        return ISSUE_SERVICE.getAllWithoutCloses(STATUS_CERRADO, page, size);
    }

    @GetMapping("/estado/{status}")
    public List<IssueResponseDTO> getByStatus(@PathVariable String status,
                                              @RequestParam(value = "page", required = false, defaultValue = "0") int page,
                                              @RequestParam(value = "size", required = false, defaultValue = "100") int size) {
        return ISSUE_SERVICE.getByStatus(status, page, size);
    }

    @GetMapping("/{id}")
    public Issue getById(@PathVariable Integer id) {
        return ISSUE_SERVICE.getById(id);
    }

    @GetMapping("/empleado/{id}")
    public List<IssueResponseDTO> getByEmployeeId(@PathVariable Integer id) {
        return ISSUE_SERVICE.getByEmployee(id);
    }

    @PostMapping("")
    public Issue newIssue(@Valid @RequestBody IssueRequestDTO newIssue) {
        return ISSUE_SERVICE.insert(newIssue);
    }

    @PutMapping("/{id}")
    public Issue update(@PathVariable Integer id, @RequestBody IssueUpdateRequestDTO issue) throws Exception {
        return ISSUE_SERVICE.update(id, issue);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIssue(@PathVariable Integer id) {
        ISSUE_SERVICE.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
