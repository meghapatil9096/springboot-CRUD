package com.neosoft.controller;

import com.neosoft.entities.Student;
import com.neosoft.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudController {

    @Autowired
    private StudService studService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
       Student student1 = studService.saveStudent(student);
       return student1;
    }

}
