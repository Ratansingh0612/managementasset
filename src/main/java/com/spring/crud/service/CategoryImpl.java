package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.CategoryRepo;

import com.spring.crud.entity.Category;

@Service
public class CategoryImpl implements CategoryService {
	
	@Autowired private CategoryRepo categoryrepo;

	@Override
	public List<Category> getAllCategoryData() {
	
		return categoryrepo.findAll();
	}

	@Override
	public Category createCategory(Category categorydata) {
		
		return categoryrepo.save(categorydata);
	}

	@Override
	public Category getCategoryById(int cateid) {
		
		return categoryrepo.findById(cateid).get();
	}

}
