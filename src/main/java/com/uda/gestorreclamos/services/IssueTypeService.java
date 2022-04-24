package com.uda.gestorreclamos.services;

import com.uda.gestorreclamos.models.IssueType;

import java.util.List;

public interface IssueTypeService {
    List<IssueType> getAll();

    IssueType getById(Integer id);

    IssueType update(Integer id, IssueType issue);

    void deleteById(Integer id);
}
