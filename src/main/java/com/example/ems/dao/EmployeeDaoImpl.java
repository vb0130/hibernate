package com.example.ems.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.ems.common.SessionFactoryUtil;
import com.example.ems.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static Logger logger = Logger.getLogger(EmployeeDaoImpl.class);

	@Override
	public Employee createEmployee(Employee emp) {

		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		return emp;

	}

	@Override
	public Collection<Employee> getAllEmployees() {

		Collection<Employee> ls = new ArrayList<Employee>();
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Query q = session.createQuery("FROM Employee");
		return q.list();

	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		emp = (Employee) session.get(Employee.class, id);
		session.getTransaction().commit();
		session.close();
		return emp;

	}

	@Override
	public Employee updateEmployee(Employee e) {

		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(e);
		session.getTransaction().commit();
		session.close();
		// get the updated employee
		e = getEmployeeById(e.getId());
		return e;
	}

	@Override
	public Employee deleteEmplyee(int id) {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee emp = getEmployeeById(id);
		logger.info("deleteEmplyee() method is called and emp found is "+ emp + " for Id : "+ id);
		if (emp != null) {
			logger.info("Employee found with id " + id + "  is " + emp.toString());
			session.delete(emp);
		} else {
			logger.info("No such employee found with Id " + id);
			return null;
		}
		session.getTransaction().commit();
		session.close();

		Employee e = getEmployeeById(id);
		if (e == null)
			logger.info("Employee deleted successfully!! Id : "+ id);
		else
			logger.info("There is some problem while deleteing the employee record :Id : "+ id);
		return emp;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

}
