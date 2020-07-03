package com.example.demo.hibernate.repository;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.HIbernateSpringBootApplication;

@SpringBootTest(classes=HIbernateSpringBootApplication.class)
public class CourseRepository {

	
	
	@Test
	public void context() {
		System.out.println("In Runner");
	}
	
}
