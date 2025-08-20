package com.abc.deneme.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="adress")
	private String adress;
	
	public User() {
		
	}
	
	
	public User(Long id, String name, String email, String password, String adress) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.adress = adress;
	}
	
	
}
