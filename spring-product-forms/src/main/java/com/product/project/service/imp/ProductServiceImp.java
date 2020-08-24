package com.product.project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.project.dao.ProductDao;
import com.product.project.model.Product;
import com.product.project.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	ProductDao productDao;

	
	public void insertProduct(Product product) {
		productDao.insertProduct(product);
		
	}

	
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}

	
	public void deleteProduct(Product hos) {
		productDao.deleteProduct(hos);
		
	}

	
	public void updateProduct(Product hos) {
		productDao.updateProduct(hos);
		
	}

	
	public List<Product> FindProductNameById(Product hos) {
		return productDao.FindProductNameById(hos);
	}
	

}

