package com.neosoft.repositories;

import com.neosoft.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

    public Employee findById(int id);

}
