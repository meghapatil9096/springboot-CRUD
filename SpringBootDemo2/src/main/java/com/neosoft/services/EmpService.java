package com.neosoft.services;

import com.neosoft.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmpService {

    List<Employee> findById();

    Employee save(Employee employee);

    Employee update(Integer id, Employee employee);

    Optional<Employee> findById(Integer id);

    void delete(Integer id);

}
