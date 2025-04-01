package com.neosoft.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity  //Mapping to database Table ,  Support for relationship
@Table(name = "student")  // Table name specification, unique constraint, Schema Specification
@Data
@ToString
public class Student {

    @Id // primary key , unique value save only
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;
    private int marks;
}
