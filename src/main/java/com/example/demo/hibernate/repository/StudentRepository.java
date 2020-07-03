package com.example.demo.hibernate.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.hibernate.entity.Passport;
import com.example.demo.hibernate.entity.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	EntityManager em;
	
	@Transactional
	public void insertSudentAndPassport() {
		Passport pass = new Passport("HAO987T");
		em.persist(pass);
		
		Student student = new Student("Aksa");
		student.setPassport(pass);
		em.persist(student);
	}
	
	@Transactional
	public Student getStudent(long id) {
		return em.find(Student.class, id);
	}
	

}
