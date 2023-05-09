package com.example.JPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class pharMod {

	@Id
private int id;
private String name;
private int dose;
private int cost;
private String doseform;
private String expdate;
private String ordate;
private int quantity;

public String getDoseform() {
	return doseform;
}
public void setDoseform(String doseform) {
	this.doseform = doseform;
}
public String getExpdate() {
	return expdate;
}
public void setExpdate(String expdate) {
	this.expdate = expdate;
}
public String getOrdate() {
	return ordate;
}
public void setOrdate(String ordate) {
	this.ordate = ordate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
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
public int getDose() {
	return dose;
}
public void setDose(int dose) {
	this.dose = dose;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
	
}
