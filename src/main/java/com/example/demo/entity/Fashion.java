package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fashion {
@Id
private int id;
private String name;
private int price;
private String details;
public Fashion() {
	super();
	// TODO Auto-generated constructor stub
}
public Fashion(int id, String name, int price, String details) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.details = details;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}


}
