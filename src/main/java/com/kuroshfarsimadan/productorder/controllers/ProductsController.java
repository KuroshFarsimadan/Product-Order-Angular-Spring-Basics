/**
 * 
 */
package com.kuroshfarsimadan.productorder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kuroshfarsimadan.productorder.models.*;
import com.kuroshfarsimadan.productorder.repositories.ProductRepository;

/**
 * @author Kurosh Farsi Madan
 *
 */
/* Rest Controller */
@RestController
@RequestMapping("api/v1/products")
public class ProductsController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> listProducts() {
		// Here note that we get all as we know the size of the DB Product table
		// Later we need to implement filter, pagination and so on
		return productRepository.findAll();		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void createProduct(@RequestBody Product product) {
		productRepository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") long id) {
		return productRepository.getById(id);
	}	

}
