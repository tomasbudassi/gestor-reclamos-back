package com.uda.gestorreclamos.repositories;

import com.uda.gestorreclamos.models.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Integer> {

}
