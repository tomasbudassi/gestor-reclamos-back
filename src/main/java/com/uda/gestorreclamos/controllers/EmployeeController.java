package com.uda.gestorreclamos.controllers;

import com.uda.gestorreclamos.dtos.EmployeeLoginDTO;
import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/empleados")
public class EmployeeController {

    private final EmployeeService EMPLOYEE_SERVICE;

    @GetMapping("")
    public List<Employee> getAll() {
        return EMPLOYEE_SERVICE.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id) {
        return EMPLOYEE_SERVICE.getById(id);
    }

    @PostMapping("/login")
    public EmployeeLoginDTO login(@RequestBody EmployeeLoginDTO employeeDto) {
        return EMPLOYEE_SERVICE.login(employeeDto);
    }

}
