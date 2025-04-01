package com.neosoft.service;

import com.neosoft.entities.Student;

public interface StudService {

    public Student saveStudent(Student student);

    public Student getStudent(int id);

    public Student updateStudent(Student student);

    public  void deleteStudent(int id);
}
