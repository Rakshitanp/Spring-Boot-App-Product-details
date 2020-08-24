package com.product.project.service;

import java.util.List;

import com.product.project.model.Product;

public interface ProductService {
	void insertProduct(Product hos);
	List<Product> getAllProduct();
	void deleteProduct(Product hos);
	void updateProduct(Product hos);
	List<Product> FindProductNameById(Product hos);
	
}
