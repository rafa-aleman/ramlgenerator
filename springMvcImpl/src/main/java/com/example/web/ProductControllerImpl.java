package com.example.web;

import generated.com.gen.wow.ProductController;
import generated.com.gen.wow.model.CreateProductRequest;
import generated.com.gen.wow.model.UpdateProductByIdRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

/**
 * User: raleman
 * Date: 23/05/16
 * Time: 00:45
 */
@Component
public class ProductControllerImpl implements ProductController {

	@Override
	public ResponseEntity createProduct(@RequestBody CreateProductRequest createProductRequest) {
		Product product = new Product(1L, "product");
		return new ResponseEntity(product, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity getProducts(@RequestParam(required = false) String q) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "product1"));
		products.add(new Product(2L, "product2"));
		return new ResponseEntity(products, HttpStatus.OK);
	}

	@Override
	public ResponseEntity getProductById(@PathVariable Long productId) {
		return null;
	}

	@Override
	public ResponseEntity updateProductById(@PathVariable Long productId, @RequestBody UpdateProductByIdRequest updateProductByIdRequest) {
		return null;
	}

	@Override
	public ResponseEntity deleteProductById(@PathVariable Long productId) {
		return null;
	}
}

class Product {
	private Long id;
	private String name;

	public Product() {
	}

	public Product(Long id, String name) {
		this.id = id;
		this.name = name;
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
}
