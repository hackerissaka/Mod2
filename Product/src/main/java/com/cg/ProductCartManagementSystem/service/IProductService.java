package com.cg.ProductCartManagementSystem.service;

import java.util.List;

import com.cg.ProductCartManagementSystem.exception.ProductException;
import com.cg.ProductCartManagementSystem.model.Product;

public interface IProductService {

	Product createProduct(Product product) throws ProductException;
	Product updateProduct(Product product)throws ProductException;
	String deleteProduct(String code)throws ProductException;
	List<Product> viewProducts()throws ProductException;
	Product findProduct(String code)throws ProductException;
}
