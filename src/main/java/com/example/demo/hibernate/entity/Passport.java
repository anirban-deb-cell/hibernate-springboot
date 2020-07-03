package com.example.demo.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private long id;
	private String number;

	@OneToOne(mappedBy = "passport")
	Student student;
	
	public Passport() {
	}
	
	public Passport(long id, String number) {
		this.id = id;
		this.number = number;
	}

	public Passport(String number) {
		this.number = number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}
	
}
