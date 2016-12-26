package com.example.ems.service;

import java.util.Collection;

import com.example.ems.model.Employee;
/**
 * Service class for employee operations
 * 
 * 
 * @author diwakar
 *
 */
public interface EmployeeService {

	/**
	 * 
	 * To create the employee
	 * @param Employee
	 * @return Employee
	 * 
	 */
	Employee createEmployee(Employee emp);
	
	/**
	 * 
	 * To get all the employee from the database
	 * 
	 * @return Collection<Employee>
	 * 
	 */
	Collection<Employee> getAllEmployees();
	
	/**
	 * 
	 * To get all the employee from the database by empId
	 * 
	 * @param Integer
	 * @return Employee
	 * 
	 */
	Employee getEmployee(int id);
	
	/**
	 * 
	 * To get all the employees by empName from the database
	 * 
	 * @param String
	 * @return Collection<Employee>
	 * 
	 */
	Collection<Employee> getAllEmployees(String name);
	
	
	/**
	 * 
	 * To get all the employees sorted by name from the database
	 * 
	 * @param String
	 * @return Collection<Employee>
	 * 
	 */
	Collection<Employee> getAllEmployeesSortedByName();
	
	/**
	 * 
	 * To get all the employees sorted by name from the database
	 * 
	 * 
	 * @param Integer
	 * @return Collection<Employee>
	 * 
	 */
	Collection<Employee> getAllEmployeesSortedById();
	
	
	Employee updateEmployee(Employee e);
	
	Employee deleteEmplyee(int id);
	
	
	
	
}
