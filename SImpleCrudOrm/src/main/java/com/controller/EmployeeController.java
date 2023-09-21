package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.models.Employee;
import com.services.EmployeeService;




@Controller
public class EmployeeController {
	
	EmployeeService dg;
	

	@Autowired
	EmployeeController(EmployeeService dg) {
		this.dg = dg;
	}
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String empList1(Model model) {
         return "add";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String empList(Model model) {
		System.out.println("controller");
		ArrayList<Employee> lem = (ArrayList<Employee>) dg.listAll();
		model.addAttribute("EmployeeList", lem);
		return "Emplist";
	}
	
	
	@RequestMapping(value = "/addemployee", method = RequestMethod.GET)
	public String empList(Model model,Employee employee) {

		dg.add(employee);
		ArrayList<Employee> lem = (ArrayList<Employee>) dg.listAll();
		model.addAttribute("EmployeeList", lem);
		return "Emplist";
	}
}