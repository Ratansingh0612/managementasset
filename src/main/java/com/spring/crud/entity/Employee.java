package com.spring.crud.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	             name = "category_enrolled",
	             joinColumns=@JoinColumn(name = "category_id"),
	             inverseJoinColumns =@JoinColumn(name="employee_id")
	)
	private Set<Category> enrolledcategory=new HashSet<>();
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "Asset_id" ,referencedColumnName = "id" ) 
	
	private Asset asset;
	
	
	
	
	
	
	
	public Set<Category> getEnrolledcategory() {
		return enrolledcategory;
	}
	public void setEnrolledstudent(Set<Category> enrolledcategory) {
		this.enrolledcategory = enrolledcategory;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void enrolledcategorytoemployee(Category cate) {
		enrolledcategory.add(cate);
	}

	public Asset getasset() {       
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public void enrolledAssettoemployee(Asset asset) {
		this.asset= asset;
			
			
		}
	
	

}
