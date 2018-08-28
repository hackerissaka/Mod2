package com.cg.ProductCartManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.ProductCartManagementSystem.exception.ProductException;
import com.cg.ProductCartManagementSystem.model.Product;
import com.cg.ProductCartManagementSystem.service.IProductService;
import org.springframework.http.MediaType;

@RestController
//@CrossOrigin(origins= {"http://localhost:4200","http://10.102.50.17:4200","http://10.102.50.35:4200"})
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	//********************************************************************************************************************
	
	
	@RequestMapping(method=RequestMethod.GET, value= {"/sayHello"},produces="application/text")
	public ResponseEntity<String> getHelloMessage(){
		return new ResponseEntity<String>("Hello world",HttpStatus.OK);
	}

	
	//********************************************************************************************************************
	
	
	@RequestMapping(value="/acceptProductDetails", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Product> acceptProductDetails(@ModelAttribute Product product) throws ProductException{
		
		return new ResponseEntity<Product>(service.createProduct(product),HttpStatus.OK);
	}

	
	//********************************************************************************************************************
	
	
	@RequestMapping(value="/getProductById/{code}", method=RequestMethod.GET, 
			consumes=MediaType.ALL_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductById(@PathVariable(value="code")String code) throws ProductException{
		
		return new ResponseEntity<Product>(service.findProduct(code),HttpStatus.OK);
	}
	
	
	//********************************************************************************************************************
	
	
	@RequestMapping(value="/getAllProductDetails", method=RequestMethod.GET, 
			 produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> getAllProductDetails() throws ProductException{
		
		return new ResponseEntity<List>(service.viewProducts(),HttpStatus.OK);
	}
	
	//********************************************************************************************************************
	
	@RequestMapping(value="/updateProductDetails", method=RequestMethod.PUT, consumes= MediaType.ALL_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@ModelAttribute Product product) throws ProductException{
		return new ResponseEntity<Product>(service.updateProduct(product),HttpStatus.OK);
		
	}

	//********************************************************************************************************************
	
	/*
	 *  @RequestMapping(value="/updateProduct",method=RequestMethod.PUT)
		Product updateProduct(@RequestBody Product product) throws ProductException{
			try {
				return service.updateProduct(product);
			} catch (ProductException e) {
				throw new ProductException(e.getMessage());
			}
		} 
	 @RequestMapping(value="/updateProduct",method=RequestMethod.PUT)
	Product updateProduct(@RequestBody Product product) throws ProductException{
		try {
			return service.updateProduct(product);
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
	} 
	  @RequestMapping(value="/viewProducts",method=RequestMethod.GET)
	List<Product> viewProducts() throws ProductException{
		try {
			return service.viewProducts();
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
	}
	  
	  @RequestMapping(value="/findProduct",method=RequestMethod.GET, produces = "application/json")
	@ResponseBody Product findProduct(String id) throws ProductException{
		try {
			return service.findProduct(id);
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	@RequestMapping(value="/createProduct",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) throws ProductException{ 

		try {
			return service.createProduct(product);
		} catch (ProductException e) {
			e.printStackTrace();
			throw new ProductException(e.getMessage());
		}
	
	}*/
	
	
	@RequestMapping(value="/deleteProduct",method=RequestMethod.DELETE)
	String deleteProduct(String id) throws ProductException{
		try {
			return service.deleteProduct(id)+" has been deleted";
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
	}
	
	
	
	
}
