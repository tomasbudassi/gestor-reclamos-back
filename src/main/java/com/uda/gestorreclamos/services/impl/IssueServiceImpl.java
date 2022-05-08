package com.uda.gestorreclamos.services.impl;

import com.uda.gestorreclamos.dtos.IssueRequestDTO;
import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.repositories.EmployeeRepository;
import com.uda.gestorreclamos.repositories.IssueRepository;
import com.uda.gestorreclamos.repositories.IssueTypeRepository;
import com.uda.gestorreclamos.services.IssueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository ISSUE_REPOSITORY;
    private final IssueTypeRepository ISSUE_TYPE_REPOSITORY;
    private final EmployeeRepository EMPLOYEE_REPOSITORY;

    @Override
    public List<IssueResponseDTO> getAll() {
        List<Issue> issues = (List<Issue>) ISSUE_REPOSITORY.findAll();
        return issues.stream().map(issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());
    }

    @Override
    public List<IssueResponseDTO> getAllWithoutCloses(String status) {
        List<Issue> issues = ISSUE_REPOSITORY.findByStatusNot(status);
        return issues.stream().map(issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());
    }

    @Override
    public List<IssueResponseDTO> getByStatus(String status) {
        List<Issue> issues = ISSUE_REPOSITORY.findByStatusContainsIgnoreCase(status);
        return issues.stream().map(issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());
    }

    @Override
    public Issue insert(IssueRequestDTO issueDto) {
        return ISSUE_REPOSITORY.save(IssueRequestDTO.toEntity(issueDto));
    }

    @Override
    public Issue getById(Integer id) {
        Issue issue = ISSUE_REPOSITORY.findById(id).orElse(null);
        return issue;
    }

    @Override
    public Issue update(Integer id, IssueRequestDTO issueDto) throws Exception {

        if(getById(id) == null) {
            throw new Exception("El id de reclamo ingresado no existe");
        }

        Issue issue = IssueRequestDTO.toEntity(issueDto);
        issue.setId(id);
        return ISSUE_REPOSITORY.save(issue);
    }

    @Override
    public void deleteById(Integer id) {
        ISSUE_REPOSITORY.deleteById(id);
    }
}
