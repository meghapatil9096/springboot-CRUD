package com.example.controller;

import com.example.entities.Employee;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpService empService;

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        Employee employee1 = empService.updateEmployee(employee);
        return employee1;
    }
}
