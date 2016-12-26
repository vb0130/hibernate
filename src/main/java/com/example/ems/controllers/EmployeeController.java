package com.example.ems.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.model.Employee;
import com.example.ems.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    //GET -> Try to get the employeeds -> read (R)
	//POST -> Try to create -> Create(C)
	//DETELTE -> Delete (D)
	//PUT -> Update (U)
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.POST)  // /employees type : POST
	public Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("Request received for creation of employee " + emp.toString());
		return employeeService.createEmployee(emp);

	}

	@RequestMapping(method = RequestMethod.GET)  // /employees type : GET
	public Collection<Employee> getAllEmployees() {
		System.out.println("Request received to get all the employees");
		return employeeService.getAllEmployees();
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")  // /employees/3    type : GET
	public Employee getEmployeeById(@PathVariable("id") int id) {
		System.out.println("Request received to get all the employees");
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT)  // /employees    type : PUT with JOSN Employee data
	public Employee updateEmployeeById(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)  // /employees    type :DELETE =>  DELETE all the employees 
	public Employee deleteEmployeeById(@PathVariable("id") int id) {
		return null;
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")  // /employees    type :DELETE =>  DELETE all the employees 
	public Employee updateEmployeeById(@PathVariable("id") int id) {
		return employeeService.deleteEmplyee(id);
	}
	

	@RequestMapping(method = RequestMethod.GET, value="filter")  // /employees?status=Y type : GET  
	public Collection<Employee> getAllEmployees(@RequestParam("status") String status) {
		//filter method
		//employeeService.getEmployess(String status)// status Y: N
		return null;
	}
	
	
	
}
