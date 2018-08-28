package com.cg.ProductCartManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Product {

	private String d;
	@Id
	private String code;
	private String name;
     private String model;
    private String price;
	private String date;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", model=" + model
				+ ", date=" + date + ", d=" + d + "]";
	}
	public Product(String code, String name, String price, String model, String date, String d) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.model = model;
		this.date = date;
		this.d = d;
	}
	public Product() {
		super();
		
	}
	
	
	
}
