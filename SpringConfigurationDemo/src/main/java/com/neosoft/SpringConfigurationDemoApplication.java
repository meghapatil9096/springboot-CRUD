package com.neosoft;

import com.neosoft.entities.Student;
import com.neosoft.resources.ConfigureFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringConfigurationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationDemoApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureFile.class);

		Student student =(Student) context.getBean("stdId1");
		student.display();
	}
}
