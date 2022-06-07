package com.uda.gestorreclamos.repositories;

import com.uda.gestorreclamos.models.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Integer> {
    Page<Issue> findByStatusNot(String status, Pageable pageable);

    Page<Issue> findByStatusContainsIgnoreCase(String status, Pageable pageable);

    Page<Issue> findByEmployeeId(Integer id, Pageable pageable);

    Page<Issue> findAll(Pageable pageable);
}
