package com.neosoft.service;

import com.neosoft.entities.Student;
import com.neosoft.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service    //business logic
public class StudServiceImp implements StudService{

    @Autowired
    private StudRepository studRepository;

    @Override
    public List<Student> getAllEmployees(int pageNo, int pageSize) {

        PageRequest pageRequest = PageRequest.of(pageNo,pageSize, Sort.by("id").ascending());

        Page pageResult = studRepository.findAll(pageRequest);

        if (pageResult.hasContent()){
            return pageResult.getContent();
        }
        else {
            return new ArrayList<>();
        }
    }
}
