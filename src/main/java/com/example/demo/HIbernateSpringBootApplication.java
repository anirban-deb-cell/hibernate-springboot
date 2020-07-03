package com.example.demo;


import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hibernate.entity.Course;
import com.example.demo.hibernate.repository.CourseRepository;
import com.example.demo.hibernate.repository.StudentRepository;

@SpringBootApplication
public class HIbernateSpringBootApplication implements CommandLineRunner{

	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	org.jboss.logging.Logger logger = LoggerFactory.logger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(HIbernateSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * courseRepository.save(new Course("Angular")); courseRepository.save(new
		 * Course(2, "Phycology"));
		 */
		/*
		 * courseRepository.payWithEntity(new Course("Java"));
		 * System.out.println("All course : ==> "+courseRepository.getAllCourse().
		 * toString()); System.out.println("Student :"+courseRepository.getAll(1001));
		 * studentRepository.insertSudentAndPassport();
		 * System.out.println(studentRepository.getStudent(1001));
		 */
		
		courseRepository.insertStudentForCourese();
		
	}

}
