package com.example.ems.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static Connection _connection;

	static {
		try {
			Class.forName("org.postgresql.Driver");
			_connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/diwakar?currentSchema=public", "centro", "centro");
			if (_connection != null) {
				System.out.println("Database connection established succesfully!!");
			} else {
				System.out.println("Database connection failed!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return _connection;
	}

}
