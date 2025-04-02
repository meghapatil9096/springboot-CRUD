package com.example.controller;

import com.example.entities.Employee;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmpController implements EmpService {

    @Autowired
    private EmpService empService;


    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return empService.saveEmployee(employee);
    }
}
