package com.uda.gestorreclamos.services;

import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.models.Issue;

import java.util.List;

public interface IssueService {
    List<IssueResponseDTO> getAll();

    Issue getById(Integer id);

    Issue update(Integer id, Issue issue);

    void deleteById(Integer id);
}
