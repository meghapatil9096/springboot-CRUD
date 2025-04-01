package com.neosoft.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity     //Mapping to database
@Table(name = "student")  //Table name specification
@Data
@ToString
public class Student {
    @Id //for unique column in db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String marks;
}
