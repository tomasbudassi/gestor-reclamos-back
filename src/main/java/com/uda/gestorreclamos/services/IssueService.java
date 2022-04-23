package com.uda.gestorreclamos.services;

import java.util.List;

public interface IssueService<Issue> {
    List<Issue> getAll();

    Issue getById(Integer id);

    Issue update(Integer id, Issue issue);

    void deleteById(Integer id);
}
