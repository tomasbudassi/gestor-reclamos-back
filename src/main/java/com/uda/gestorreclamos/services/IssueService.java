package com.uda.gestorreclamos.services;

import com.uda.gestorreclamos.dtos.IssueRequestDTO;
import com.uda.gestorreclamos.dtos.IssueResponseDTO;
import com.uda.gestorreclamos.dtos.IssueUpdateRequestDTO;
import com.uda.gestorreclamos.models.Issue;

import java.util.List;

public interface IssueService {

    List<IssueResponseDTO> getAll();

    List<IssueResponseDTO> getAllWithoutCloses(String status);

    List<IssueResponseDTO> getByStatus(String status);

    List<IssueResponseDTO> getByEmployee(Integer id);

    Issue insert(IssueRequestDTO issue);

    Issue getById(Integer id);

    Issue update(Integer id, IssueUpdateRequestDTO issue) throws Exception;

    void deleteById(Integer id);

}
