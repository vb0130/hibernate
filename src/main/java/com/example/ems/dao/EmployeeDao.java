package com.example.ems.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.example.ems.model.Employee;

/**
 * This class provides the APIs to get the data to and from the Employee Database
 * 
 * @author diwakar
 *
 */

public interface EmployeeDao {

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
	
	Employee getEmployeeById(int id);
	
	Employee updateEmployee(Employee e);
	
	Employee deleteEmplyee(int id);
	
	int deleteAll();
	
	

}
