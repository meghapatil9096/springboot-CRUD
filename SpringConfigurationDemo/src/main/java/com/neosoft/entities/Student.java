package com.neosoft.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "student")
@Data
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  int marks;

    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }
}
