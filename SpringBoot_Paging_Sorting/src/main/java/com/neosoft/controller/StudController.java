package com.neosoft.controller;

import com.neosoft.entities.Student;
import com.neosoft.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudController {

    @Autowired
    private StudService studService;

    @GetMapping("/get")
    public List<Student> getAllEmployees(@RequestParam(defaultValue = "0") int pageNo,@RequestParam(defaultValue = "5") int pageSize){
        return studService.getAllEmployees(pageNo,pageSize);
    }

}
