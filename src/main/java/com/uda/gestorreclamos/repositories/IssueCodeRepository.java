package com.uda.gestorreclamos.repositories;

import com.uda.gestorreclamos.models.IssueCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueCodeRepository extends CrudRepository<IssueCode, Integer> {
}
