package com.neosoft.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "library")
@Data
@ToString
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String book_name;
    private  int price;

}
