package com.example.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="EMPLOYEE_TBL")
public class Employee {

	@Column(name = "EMP_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "EMP_SEQ")
	private int id;
	
	@Column(name = "EMP_NAME")
	private String name;
	
	@Column(name = "SALARY")
	private int salary;
	
	@Column(name = "STATUS")
	private String empStatus;

	public Employee() {
	}

	public Employee(int id, String name, int salary, String empStatus) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.empStatus = empStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", empStatus=" + empStatus + "]";
	}

}
