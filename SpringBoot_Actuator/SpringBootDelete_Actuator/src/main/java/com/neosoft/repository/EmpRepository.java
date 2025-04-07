package com.neosoft.repository;

import com.neosoft.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

    public void deleteById(int id);
}
