package com.uda.gestorreclamos.repositories;

import com.uda.gestorreclamos.models.IssueType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueTypeRepository extends CrudRepository<IssueType, Integer> {
}
