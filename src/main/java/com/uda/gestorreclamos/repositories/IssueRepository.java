package com.uda.gestorreclamos.repositories;

import com.uda.gestorreclamos.models.Issue;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Integer> {
    List<Issue> findByStatusNot(String status, Pageable pageable);

    List<Issue> findByStatusContainsIgnoreCase(String status, Pageable pageable);

    List<Issue> findByEmployeeId(Integer id);

    List<Issue> findAll(Pageable pageable);
}
