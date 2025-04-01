package com.neosoft.controller;

import com.neosoft.entities.Student;
import com.neosoft.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudController {
    @Autowired
    private StudService studService;

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = studService.getStudent(id);
        return student;
    }
}
