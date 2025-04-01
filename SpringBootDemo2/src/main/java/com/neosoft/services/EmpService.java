package com.neosoft.services;

import com.neosoft.entities.Employee;

import java.util.List;

public interface EmpService {

    List<Employee> findById();

    Employee save(Employee employee);

    Employee update(Integer id, Employee employee);

    Employee findById(Integer id);

    void delete(Integer id);

}
