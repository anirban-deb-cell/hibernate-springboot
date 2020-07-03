package com.example.demo.hibernate.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@OneToOne
	private Passport passport; // by default eager fetch
	
	@ManyToMany
	@JoinTable(name="STUDENT_COURSE",
		joinColumns=@JoinColumn(name="STUDENT_ID"),
		inverseJoinColumns = @JoinColumn(name="COURSE_ID")
			) // Joint tabel name
	
	private List<Course> courses;
	
	public Student() {
	}
	
	public Student(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passport=" + passport + ", courses=" + courses + "]";
	}
	
}
