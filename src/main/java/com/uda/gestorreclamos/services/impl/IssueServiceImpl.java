package com.uda.gestorreclamos.services.impl;

import com.uda.gestorreclamos.dtos.IssuePaginatedResponseDTO;
import com.uda.gestorreclamos.dtos.IssueRequestDTO;
import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.dtos.IssueUpdateRequestDTO;
import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.repositories.EmployeeRepository;
import com.uda.gestorreclamos.repositories.IssueRepository;
import com.uda.gestorreclamos.repositories.IssueTypeRepository;
import com.uda.gestorreclamos.services.IssueService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public IssuePaginatedResponseDTO getAll(int page, int size) {

        Pageable pageable = PageRequest.of(page,size);
        Page<Issue> issues = ISSUE_REPOSITORY.findAll(pageable);

        List<IssueResponseDTO> issuesResponseDto = issues.getContent().stream().map(
                issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());

        return new IssuePaginatedResponseDTO(issues.getTotalPages(), issuesResponseDto);
    }

    @Override
    public IssuePaginatedResponseDTO getAllWithoutCloses(String status, int page, int size) {

        Pageable pageable = PageRequest.of(page,size);
        Page<Issue> issues = ISSUE_REPOSITORY.findByStatusNot(status, pageable);

        List<IssueResponseDTO> issuesResponseDto = issues.getContent().stream().map(
                issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());

        return new IssuePaginatedResponseDTO(issues.getTotalPages(), issuesResponseDto);
    }

    @Override
    public IssuePaginatedResponseDTO getByStatus(String status, int page, int size) {

        Pageable pageable = PageRequest.of(page,size);
        Page<Issue> issues = ISSUE_REPOSITORY.findByStatusContainsIgnoreCase(status, pageable);

        List<IssueResponseDTO> issuesResponseDto = issues.getContent().stream().map(
                issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());

        return new IssuePaginatedResponseDTO(issues.getTotalPages(), issuesResponseDto);
    }

    @Override
    public IssuePaginatedResponseDTO getByEmployee(Integer id, int page, int size) {

        Pageable pageable = PageRequest.of(page,size);
        Page<Issue> issues = ISSUE_REPOSITORY.findByEmployeeId(id, pageable);

        List<IssueResponseDTO> issuesResponseDto = issues.getContent().stream().map(
                issue -> IssueResponseDTO.toDto(issue)).collect(Collectors.toList());

        return new IssuePaginatedResponseDTO(issues.getTotalPages(), issuesResponseDto);
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
    public Issue update(Integer id, IssueUpdateRequestDTO issueDto) throws Exception {
        Issue issue = getById(id);
        if(issue == null) {
            throw new Exception("El id de reclamo ingresado no existe");
        }

        issue = IssueUpdateRequestDTO.toEntity(issue, issueDto);
        issue.setId(id);
        return ISSUE_REPOSITORY.save(issue);
    }

    @Override
    public void deleteById(Integer id) {
        ISSUE_REPOSITORY.deleteById(id);
    }
}
