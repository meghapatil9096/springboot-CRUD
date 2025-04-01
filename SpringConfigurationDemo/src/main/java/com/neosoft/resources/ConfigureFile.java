package com.neosoft.resources;

import com.neosoft.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureFile {

    @Bean
    public Student stdId1(){
        Student std = new Student();
        std.setId(4);
        std.setName("kumud");
        std.setMarks(45);
        return  std;
    }
}
