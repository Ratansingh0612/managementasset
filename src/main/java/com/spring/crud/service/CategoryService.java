package com.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.entity.Category;

@Service
public interface CategoryService {
	List<Category> getAllCategoryData();
	Category createCategory(Category categoryData);
	Category getCategoryById(int CateId);
	

}
