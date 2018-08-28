package com.cg.ProductCartManagementSystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ProductCartManagementSystem.dao.IProductRepo;
import com.cg.ProductCartManagementSystem.exception.ProductException;
import com.cg.ProductCartManagementSystem.model.Product;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	
	@Autowired
	private IProductRepo productRepo;
	@Override
	public Product createProduct(Product product) throws ProductException {
		
		if(validateProduct(product))
		productRepo.save(product);
		return product;
	}

	private boolean validateProduct(Product product)throws ProductException{
		
		if(product==null) {
			throw new ProductException("Product does not exist");
		}
		/*if(product.getPrice()<=0) {
			throw new ProductException("Price must be more than zero");
		}*/
		if(product.getName().isEmpty()) {
			throw new ProductException("Name cannot be empty");
		}
		if(!product.getName().matches("[A-Z][A-Za-z]{2,}")) {
			throw new ProductException("Name must be start with Capital Letter and should be more than 2 characters");
		}
		if(product.getmodel().isEmpty()) {
			throw new ProductException("Description is expected");
		}
		return true;
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {
		Product product1= productRepo.selectProductById(product.getCode());
		product1.setD(product.getD());
		product1.setName(product.getName());
		product1.setmodel(product.getmodel());
		product1.setPrice(product.getPrice());
		product1.setdate(product.getdate());
		return productRepo.save(product1);
	}

	@Override
	public String deleteProduct(String code) throws ProductException {
		
		productRepo.deleteById(code);
		
		return code;
	}

	@Override
	public List<Product> viewProducts() throws ProductException {
	
		return productRepo.findAll();
	}

	@Override
	public Product findProduct(String code) throws ProductException {
		
		return productRepo.getOne(code);
		
	}
}
