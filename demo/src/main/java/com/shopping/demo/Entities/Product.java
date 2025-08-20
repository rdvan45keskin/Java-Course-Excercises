package com.shopping.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="descrpition")
	private String descriptipn;
	
	@Column(name="stock")
	private int stock;
	
	public Product() {
		
	}
	
	public Product(Long id, String name, double price, String descriptipn, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.descriptipn = descriptipn;
		this.stock = stock;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescriptipn() {
		return descriptipn;
	}

	public void setDescriptipn(String descriptipn) {
		this.descriptipn = descriptipn;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
