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

import com.spring.crud.entity.Category;
import com.spring.crud.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	

	@Autowired private CategoryService categoryservice;

	
	
	
	
	@GetMapping("/start")
	public String start() {
		return "everything is okk for category";
		
	}
	
	
	@GetMapping("/allcategory")
	List<Category> getAllCategory() {
		
		return categoryservice.getAllCategoryData();
		
	}
	
	
	
	
	@PostMapping("/addcategory")
 	Category addCategory(@RequestBody Category cat) {
		return categoryservice.createCategory(cat);
		
	}
	
	
	
	
	@GetMapping("/getByCategoryId/{id}")
	Category getById(@PathVariable ("id") int cateid) {
		Category categoryid=new Category();
		categoryid=categoryservice.getCategoryById(cateid);
		return categoryid;
		
	}
	
	
	
	

	
	
	
	
	

}
