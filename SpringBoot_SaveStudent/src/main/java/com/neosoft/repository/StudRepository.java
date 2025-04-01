package com.neosoft.repository;

import com.neosoft.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends JpaRepository<Student, Integer> {

}
