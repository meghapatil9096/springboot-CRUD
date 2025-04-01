package com.neosoft.controller;

import com.neosoft.entities.Student;
import com.neosoft.services.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudController {

    @Autowired
    private StudService studService;

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        Student student1=studService.updateStudent(student);
        return student1;
    }


}
