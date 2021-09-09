package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.Asset;
import com.spring.crud.entity.Category;
import com.spring.crud.entity.Employee;

import com.spring.crud.service.AssetService;
import com.spring.crud.service.CategoryService;
import com.spring.crud.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	

	@Autowired private EmployeeService employeeservice;
	@Autowired private CategoryService categoryservice;
	@Autowired private AssetService assetservice;
	
	
	@GetMapping("/startEmployee")
	public String start() {
		return "everything is okk for subject";
		
	}
	
	
	@GetMapping("/allEmployee")
	List<Employee> getAllEmployee() {
		
		return employeeservice.getAllEmployeeData();
		
	}
	
	
	
	
	@PostMapping("/addEmployee")
 	Employee addEmployee(@RequestBody Employee emp) {
		return employeeservice.createEmployee(emp);
		
	}
	
	
	
	
	@GetMapping("/getByEmployeeName/{name}")
	Employee getById(@PathVariable ("name") String name) {
		Employee subjId=new Employee();
		subjId=employeeservice.getEmployeeByName(name);
		return subjId;
		
	}
	
	@PutMapping("/{employeeName}/categories/{categoryId}")
	Employee enrollStudentToSubject(@PathVariable ("employeeName") String EmployeeName, @PathVariable("categoryId") int categoryId) {
		Employee empName=employeeservice.getEmployeeByName(EmployeeName);
		Category catid=categoryservice.getCategoryById(categoryId);
	
		empName.enrolledcategorytoemployee(catid);
		return employeeservice.save(empName);
		
	}
	
	
	@PutMapping("/{employeeName}/asset/{assetid}")
	Employee enrollteacherToSubject(@PathVariable ("employeeName") String employeeName, @PathVariable("assetid") int assetid) {
		Employee empName=employeeservice.getEmployeeByName(employeeName);
		Asset assett=assetservice.getAssetById(assetid);
	
		empName.enrolledAssettoemployee(assett);
		return employeeservice.save(empName);
		
	}


}
