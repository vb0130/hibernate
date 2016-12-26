package com.example.ems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.ems.dao.EmployeeDao;
import com.example.ems.model.Employee;

@Controller
@RequestMapping("ui")
public class UICOntroller {
	
	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView indexPage()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping(value = "getEmployeeById", method = RequestMethod.GET)
	public ModelAndView getEmployeeById(@RequestParam("id") int id)
	{
		Employee emp = employeeDao.getEmployeeById(id);
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("empObject", emp);
		return mv;
	}
	
}
