package com.example.service;

import com.example.entities.Employee;
import com.example.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImp implements EmpService {

    @Autowired
    private EmpRepository empRepository;

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = empRepository.save(employee);
        return employee1;
    }
}
