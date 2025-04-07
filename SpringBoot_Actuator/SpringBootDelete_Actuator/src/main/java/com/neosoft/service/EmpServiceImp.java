package com.neosoft.service;

import com.neosoft.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImp implements EmpService {

    @Autowired
    private EmpRepository empRepository;

    @Override
    public void deleteEmployee(int id) {
        empRepository.deleteById(id);
    }
}
