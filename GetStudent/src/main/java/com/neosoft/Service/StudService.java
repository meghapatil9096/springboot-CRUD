package com.neosoft.Service;

import com.neosoft.entities.Student;
import jakarta.persistence.Id;

public interface StudService {

//    to get data from table
    public Student getStudent(int id);
}
