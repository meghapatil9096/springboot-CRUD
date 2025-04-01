package com.neosoft.repository;

import com.neosoft.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface StudRepository extends JpaRepository<Student, Integer> {

    public Student findById(int id);
}
