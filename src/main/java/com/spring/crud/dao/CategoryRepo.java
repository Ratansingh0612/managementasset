package com.spring.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.Category;
import com.spring.crud.entity.Employee;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
