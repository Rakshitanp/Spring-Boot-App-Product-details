package com.product.project.dao;

import java.util.List;

import com.product.project.model.Product;


	public interface ProductDao {
		void insertProduct(Product cus);
		List<Product> getAllProduct();
		void deleteProduct(Product hos);
		void updateProduct(Product hos);
		List<Product> FindProductNameById(Product hos);
	}
