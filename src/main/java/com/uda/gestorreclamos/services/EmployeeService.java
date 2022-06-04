package com.uda.gestorreclamos.services;

import com.uda.gestorreclamos.dtos.EmployeeLoginDTO;
import com.uda.gestorreclamos.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee getById(Integer id);

    Employee update(Integer id, Employee issue);

    void deleteById(Integer id);

    EmployeeLoginDTO login(EmployeeLoginDTO employeeDto);
}
