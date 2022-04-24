package com.uda.gestorreclamos.services.impl;

import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.repositories.EmployeeRepository;
import com.uda.gestorreclamos.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository EMPLOYEE_REPOSITORY;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.EMPLOYEE_REPOSITORY = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) EMPLOYEE_REPOSITORY.findAll();
    }

    @Override
    public Employee getById(Integer id) {
        return EMPLOYEE_REPOSITORY.findById(id).orElse(null);
    }

    @Override
    public Employee update(Integer id, Employee issue) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
