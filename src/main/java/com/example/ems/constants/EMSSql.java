package com.example.ems.constants;

public interface EMSSql {
	
	String INSERT_EMPLOYEE = "insert into Employee values (?,?,?,?)";
	String GET_ALL_EMPLOYEES = "select * from Employee";
	String GET_BY_ID = "select * from Employee where ID = ?";

}
