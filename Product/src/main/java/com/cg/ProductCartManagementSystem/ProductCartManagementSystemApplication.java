package com.cg.ProductCartManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.cg.ProductCartManagementSystem.model")
@ComponentScan("com.cg.ProductCartManagementSystem")
@EnableJpaRepositories("com.cg.ProductCartManagementSystem.dao")
@SpringBootApplication
public class ProductCartManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCartManagementSystemApplication.class, args);
	}
}
