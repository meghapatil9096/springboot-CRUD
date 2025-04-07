package com.neosoft.controller;

import com.neosoft.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmpController {
    @Autowired
    private EmpService empService;

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id){
        empService.deleteEmployee(id);
    }
}
