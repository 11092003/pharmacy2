package com.example.JPA.Model;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class pharmacy1 {



	@Id
	private int id;
	private String name;
	private int cost;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cost")
	private List<additionalmod> addmod;
	
	public List<additionalmod> getAddmod() {
		return addmod;
	}
	public void setAddmod(List<additionalmod> addmod) {
		this.addmod = addmod;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
