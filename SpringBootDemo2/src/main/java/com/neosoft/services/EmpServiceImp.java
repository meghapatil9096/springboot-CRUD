package com.neosoft.services;

import com.neosoft.entities.Employee;
import com.neosoft.repositories.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmpServiceImp implements EmpService{

    @Autowired
    private EmpRepository empRepository;

//   Read operation --> return list of employee
    @Override
    public List<Employee> findById() {
        return empRepository.findAll();
    }
//  Save operation ---> save new employee in database
    @Override
    public Employee save(Employee employee) {
        return empRepository.save(employee);
    }
//  update operation --> update exists employee data
    @Override
    public Employee update(Integer id, Employee employee) {
//        Employee employee1 = empRepository.findById(id).orElseThrow();
        return empRepository.findById(id).orElseThrow();
    }
// find by id
    @Override
    public Optional<Employee> findById(Integer id) {
        return empRepository.findById(id);
    }
//  Delete operation
    @Override
    public void delete(Integer id) {
        empRepository.deleteById(id);
    }
}
