package com.neosoft.service;

import com.neosoft.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudServiceImp implements StudService{

    @Autowired
    private StudRepository studRepository;

    @Override
    public void deleteStudent(int id) {
        studRepository.deleteById(id);

    }
}
