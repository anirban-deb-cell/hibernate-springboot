package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import com.example.demo.entity.Person;

import org.springframework.stereotype.Repository;

//@Repository
//@Transactional
public class PersonJPADAO {


	@PersistenceContext
	EntityManager entiryManager;


	//Using CreateNamedQuery 
	public List<Person> findAll(){
		TypedQuery<Person> persons= entiryManager.createNamedQuery("find_all_name",Person.class);
		return persons.getResultList();
	}

	//Using Find
	public Person findByIdByFind(int id){
		return entiryManager.find(com.example.demo.entity.Person.class, id);
	}

	
	public Person insert(Person person) {
		return entiryManager.merge(person);
	}

	public Person update(Person person) {
		return entiryManager.merge(person);
	}

	public void delete(int id) {
		Person person = findByIdByFind(id);
		entiryManager.remove(person);
	}

}
