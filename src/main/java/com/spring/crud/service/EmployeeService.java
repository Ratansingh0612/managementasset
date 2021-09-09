package com.spring.crud.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.crud.entity.Employee;

@Service
public interface EmployeeService {
	List<Employee> getAllEmployeeData();
	Employee createEmployee(Employee employeedata);
	Employee getEmployeeByName(String Name);
	Employee save(Employee subName);
	

}
