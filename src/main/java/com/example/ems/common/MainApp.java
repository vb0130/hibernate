package com.example.ems.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.ems.model.Employee;

public class MainApp {
	
	public static void main(String[] args) {
		
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		
       Session session = sf.openSession();
       
       session.beginTransaction();
       
       
       Employee emp = new Employee(1, "Peter", 5000, "Y");
       
       session.save(emp);
       
       session.getTransaction().commit();
       
       session.close();
       
       System.out.println("Data inserted!!!");
       
		
		
		
	}

}
