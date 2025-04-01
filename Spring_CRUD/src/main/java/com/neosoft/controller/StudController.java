package com.neosoft.controller;

import com.neosoft.entities.Student;
import com.neosoft.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudController implements StudService {

    @Autowired
    private StudService studService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studService.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable  int id) {
        Student student = studService.getStudent(id);
        return student;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        Student student1 = studService.updateStudent(student);
        return student1;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        studService.deleteStudent(id);
    }
}
