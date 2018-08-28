package com.cg.ProductCartManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ProductCartManagementSystem.model.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, String> {

	/**
	 * Interface Name : IProductRepo;
	 * Class extend: JpaRepository;
	 * Number of Query: 1;
	 * Name of Query : selectProductById();
	 * Purpose: Data Access operation from ProductDatabase for Getting Details of specific Id Primary Key;
	 * 
	 * @author swetaRani_152936;
	 * Date of Creation : 08-aug-2018;
	 * 
	 * Last Date Of Modification : 08-aug-2018;
	 */
	@Query("SELECT p FROM Product p WHERE p.id=:id")
	public Product selectProductById(@Param("id") String id);
}
