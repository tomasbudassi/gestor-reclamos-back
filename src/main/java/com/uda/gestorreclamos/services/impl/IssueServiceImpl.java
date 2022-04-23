package com.uda.gestorreclamos.services.impl;

import com.uda.gestorreclamos.models.Issue;
import com.uda.gestorreclamos.repositories.EmployeeRepository;
import com.uda.gestorreclamos.repositories.IssueRepository;
import com.uda.gestorreclamos.repositories.IssueTypeRepository;
import com.uda.gestorreclamos.services.IssueService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository ISSUE_REPOSITORY;
    private final IssueTypeRepository ISSUE_TYPE_REPOSITORY;
    private final EmployeeRepository EMPLOYEE_REPOSITORY;

    public IssueServiceImpl(IssueRepository issueRepository,
                            IssueTypeRepository issueTypeRepository,
                            EmployeeRepository employeeRepository) {
        this.ISSUE_REPOSITORY = issueRepository;
        this.ISSUE_TYPE_REPOSITORY = issueTypeRepository;
        this.EMPLOYEE_REPOSITORY = employeeRepository;
    }

    @Override
    public List<Issue> getAll() {
        return (List<Issue>) ISSUE_REPOSITORY.findAll();
    }

    @Override
    public Issue getById(Integer id) {
        Issue issue = ISSUE_REPOSITORY.findById(id)
                .orElse(null);

        return issue;
    }

    @Override
    public Object update(Integer id, Object o) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
