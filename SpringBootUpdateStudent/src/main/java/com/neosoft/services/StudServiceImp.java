package com.neosoft.services;

import com.neosoft.entities.Student;
import com.neosoft.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudServiceImp implements StudService{

    @Autowired
    private StudRepository studRepository;

    @Override
    public Student updateStudent(Student student) {
        Student student1 = studRepository.save(student);
        return student1;
    }
}
