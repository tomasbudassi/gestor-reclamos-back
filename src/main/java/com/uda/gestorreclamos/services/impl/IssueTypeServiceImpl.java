package com.uda.gestorreclamos.services.impl;

import com.uda.gestorreclamos.models.IssueType;
import com.uda.gestorreclamos.repositories.IssueTypeRepository;
import com.uda.gestorreclamos.services.IssueTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class IssueTypeServiceImpl implements IssueTypeService {

    private final IssueTypeRepository ISSUE_TYPE_REPOSITORY;

    @Override
    public List<IssueType> getAll() {
        return (List<IssueType>) ISSUE_TYPE_REPOSITORY.findAll();
    }

    @Override
    public IssueType getById(Integer id) {
        return ISSUE_TYPE_REPOSITORY.findById(id).orElse(null);
    }

    @Override
    public IssueType update(Integer id, IssueType issue) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
