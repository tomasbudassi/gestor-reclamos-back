package com.uda.gestorreclamos.services.impl;

import com.uda.gestorreclamos.dtos.EmployeeLoginDTO;
import com.uda.gestorreclamos.models.Employee;
import com.uda.gestorreclamos.repositories.EmployeeRepository;
import com.uda.gestorreclamos.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository EMPLOYEE_REPOSITORY;

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

    @Override
    public EmployeeLoginDTO login(EmployeeLoginDTO employeeDto) {

        Employee employee = EMPLOYEE_REPOSITORY.findByUsernameAndPassword(
                employeeDto.getUsername(), getMd5(employeeDto.getPassword()));

        if(Objects.isNull(employee)) {
            throw new AccessControlException("Usuario o contraseña incorrecto");
        }
        return new EmployeeLoginDTO(generateToken(employee.getUsername()));
    }

    private String generateToken(String username) {
        return getMd5(username) + System.currentTimeMillis();
    }

    public String getMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
