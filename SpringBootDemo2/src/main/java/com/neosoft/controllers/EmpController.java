package com.neosoft.controllers;

import com.neosoft.entities.Employee;
import com.neosoft.services.EmpService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/e1")
public class EmpController {

    @Autowired
    private EmpService empService;

//   Read operation
    @GetMapping(value = "employee")
    public List<Employee> findAll(){
        return empService.findById();
    }

//    Get employee by Id
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return empService.findById(id);
    }

//    Save operation
    @PostMapping(value = "employee")
    public  Employee createEmployee(@RequestBody Employee employee){
        return empService.save(employee);
    }

//    Update operation
    @PostUpdate

//    Delete operation
    @DeleteMapping("/employee/{id}")
    public void  deleteEmployee(@PathVariable Integer id){
        empService.delete(id);
    }

}
