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
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn(name = "employee_id" ,referencedColumnName = "id" )
	  Set<Employee> enrollemployee=new HashSet<>();
	 
	
	
	
	
	

	
	public Set<Employee> getEnrollemployee() {
		return enrollemployee;
	}

	public void setEnrollsubject(Set<Employee> enrollemployee) {
		this.enrollemployee = enrollemployee;
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

	private String purchaseDate;








	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}




}
