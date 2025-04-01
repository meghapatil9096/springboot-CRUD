package com.neosoft.Service;

import com.neosoft.Repository.StudRepository;
import com.neosoft.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudServiceImp implements StudService{

    @Autowired
    private StudRepository studRepository;

    @Override
    public Student getStudent(int id) {
        Student student = studRepository.findById(id);
        return student;
    }
}
