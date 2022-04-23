package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.services.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmployeeController {
    private final EmployeeServiceImpl EMPLOYEE_SERVICE;

    EmployeeController(EmployeeServiceImpl employeeService) {
        this.EMPLOYEE_SERVICE = employeeService;
    }

    @GetMapping("")
    public List<Employee> getAll() {
        return EMPLOYEE_SERVICE.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id) {
        return EMPLOYEE_SERVICE.getById(id);
    }
}
