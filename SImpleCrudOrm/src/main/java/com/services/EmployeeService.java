package com.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.models.Employee;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeDao dd;

	@Transactional
	public void add(Employee emp) {
		dd.persistEmployee(emp);
	}
	
	@Transactional
	public void addAll(Collection<Employee> empList) {
		for (Employee emp : empList) {
			dd.persistEmployee(emp);
		}
	}

	@Transactional(readOnly = true)
	public List<Employee> listAll() {
		return dd.findAll();

	}

}