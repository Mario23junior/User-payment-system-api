package com.project.payment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_USER")
public class User {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	private Double houryPrice;
	
	public User() {
 	}
	
	public User(Long id, String name, String email, String password, Double houryPrice) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.houryPrice = houryPrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getHouryPrice() {
		return houryPrice;
	}
	public void setHouryPrice(Double houryPrice) {
		this.houryPrice = houryPrice;
	}
	
	
	
	
}
