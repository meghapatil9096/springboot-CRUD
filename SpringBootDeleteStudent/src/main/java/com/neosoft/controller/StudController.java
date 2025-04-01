package com.neosoft.controller;

import com.neosoft.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudController {

    @Autowired
    private StudService studService;

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        studService.deleteStudent(id);
    }
}
