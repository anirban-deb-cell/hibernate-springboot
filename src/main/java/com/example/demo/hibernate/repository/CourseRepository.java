package com.example.demo.hibernate.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.hibernate.entity.Course;
import com.example.demo.hibernate.entity.Passport;
import com.example.demo.hibernate.entity.Review;
import com.example.demo.hibernate.entity.Student;

@Repository

public class CourseRepository {

	@Autowired
	EntityManager em;

	@Transactional
	public Course findById(long id) {
		return em.find(Course.class, id);
	}

	@Transactional
	public void delete(long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}
	
	@Transactional
	public void save(Course course) {

		if(course.getId()== 0) {
			em.persist(course);
		}else {
			em.merge(course);
		}

	}
	
	@Transactional
	public Course addReviews() {
		
		long a =4;
		
		Course coures = em.find(Course.class, a);
		return coures;
	}
	
	@Transactional
	public void payWithEntity(Course course) {
		
		em.persist(course);
		em.flush();
		course.setName("Node");
		
		Course coure2 = new Course("C++");
		em.persist(coure2);
		em.flush(); 
		
		em.detach(coure2); // Will not track any update, but have to be set for each entity
		em.clear(); // any change made after persist will not be tracked by entityManager
		
		coure2.setName("Python");
		

	}
	
	@Transactional
	public List<Course> getAllCourse(){
		 Query createNamedQuery = em.createNamedQuery("Select_course");
		 createNamedQuery.setParameter("id", 1L);
		 return createNamedQuery.getResultList();
	}
	
	@Transactional
	public Student getAll(long id){
		return em.find(Student.class,id);
	}
	
	@Transactional
	public Review getReview(long id){
		Review reiew =  em.find(Review.class,id);
		return reiew;
	}
	
	@Transactional
	public void addReview(long id) {
		
		Course course = em.find(Course.class, id);
		Review rev = new Review();
		rev.setDescription("Really Good course");
		
		course.addReviews(rev);
		
		rev.setCourse(course);
		
		em.persist(rev);
		
	}
	
	@Transactional
	public void insertStudentAndCourese() {
		Student student =new Student("Pritam");
		Course course = new Course("AIML");
		
		em.persist(student);
		em.persist(course);
		
		List<Course> cc = new ArrayList<Course>();
		cc.add(course);
		
		List<Student> ss = new ArrayList<>();
		ss.add(student);
		
		student.setCourses(cc);
		course.setStudents(ss);
		
	}
	
	@Transactional
	public void insertStudentForCourese() {
		Course course = em.find(Course.class, 61L);
		Student st = new Student("Pratap");
		em.persist(st);
		Passport pp = new Passport("BBG786T");
		em.persist(pp);
		st.setPassport(pp);
		List<Course> cc = new ArrayList<Course>();
		cc.add(course);
		st.setCourses(cc);
		
	}
	
}
