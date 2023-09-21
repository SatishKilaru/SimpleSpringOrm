package com.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.models.Employee;

@Component
public class EmployeeDao {

	@PersistenceContext
	private EntityManager em;

	

	public List<Employee> findAll() {
		return em.createQuery("SELECT e FROM Employee e").getResultList();
	}

	public void persistEmployee(Employee emp) {
		// TODO Auto-generated method stub
		em.persist(emp);
		
	}

}
