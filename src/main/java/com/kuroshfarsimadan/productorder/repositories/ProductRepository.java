/**
 * 
 */
package com.kuroshfarsimadan.productorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuroshfarsimadan.productorder.models.Product;

/**
 * @author Kurosh Farsi Madan
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
