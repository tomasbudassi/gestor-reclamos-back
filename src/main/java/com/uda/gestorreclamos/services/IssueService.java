package com.uda.gestorreclamos.services;

import com.uda.gestorreclamos.dtos.IssuePaginatedResponseDTO;
import com.uda.gestorreclamos.dtos.IssueRequestDTO;
import com.uda.gestorreclamos.dtos.IssueUpdateRequestDTO;
import com.uda.gestorreclamos.models.Issue;

public interface IssueService {

    IssuePaginatedResponseDTO getAll(int page, int size);

    IssuePaginatedResponseDTO getAllWithoutCloses(String status, int page, int size);

    IssuePaginatedResponseDTO getByStatus(String status, int page, int size);

    IssuePaginatedResponseDTO getByEmployee(Integer id, int page, int size);

    Issue insert(IssueRequestDTO issue);

    Issue getById(Integer id);

    Issue update(Integer id, IssueUpdateRequestDTO issue) throws Exception;

    void deleteById(Integer id);

}
