package com.neosoft.Repository;

import com.neosoft.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends JpaRepository<Student, Integer> {

//    to get data form table
    public Student findById(int id);

}
