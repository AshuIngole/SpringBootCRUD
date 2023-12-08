package com.SpringBootCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {
	
	@Id	
	private String id;
	private String name;
	private String Price;
	private String Description;
	
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Subject(String id, String name, String price, String description) {
		
		this.id = id;
		this.name = name;
		Price = price;
		Description = description;
	}
	public Subject() {
		super();
		
	}
	

}
