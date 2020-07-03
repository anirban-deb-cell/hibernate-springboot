package com.example.demo.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Select_course",query="Select c from Course c where id=:id")
public class Course {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
	private List<Review> reviews = new ArrayList<>();
	
	//@CreateTimeStamp
	//@UpdateTimeStamp
	
	@ManyToMany(mappedBy = "courses")
	private List<Student> students;
	
	public Course() {
	}
	
	public Course(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Course(String name) {
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

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReviews(Review review) {
		this.reviews.add(review);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", reviews=" + reviews + ", students=" + students + "]";
	}
	
	
}
