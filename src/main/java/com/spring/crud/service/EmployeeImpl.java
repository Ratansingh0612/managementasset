package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.EmployeeRepo;

import com.spring.crud.entity.Employee;

@Service
public class EmployeeImpl implements EmployeeService {
	
	@Autowired private EmployeeRepo employeerepo;

	@Override
	public List<Employee> getAllEmployeeData() {
		
		return employeerepo.findAll();
	}

	@Override
	public Employee createEmployee(Employee employeedata) {
		
		return employeerepo.save(employeedata);
	}

	@Override
	public Employee getEmployeeByName(String employeename) {
		
		return employeerepo.findByName(employeename);
	}

	

	@Override
	public Employee save(Employee subName) {
		
		return employeerepo.save(subName);
	}

}
