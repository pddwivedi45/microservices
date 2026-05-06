package com.spring.microservices.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		System.out.println("Product service is going to start...");
		SpringApplication.run(ProductServiceApplication.class, args);
		System.out.println("Product service started...");
	}

}
