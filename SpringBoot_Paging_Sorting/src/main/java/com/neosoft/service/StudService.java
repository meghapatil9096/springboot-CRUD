package com.neosoft.service;

import com.neosoft.entities.Student;

import java.util.List;

public interface StudService {

//    get operation for all employee
    public List<Student> getAllEmployees(int pageNo, int pageSize);
}
