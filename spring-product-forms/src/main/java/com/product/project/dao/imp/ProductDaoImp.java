package com.product.project.dao.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.product.project.dao.*;
import com.product.project.model.*;

@Repository
public class ProductDaoImp extends JdbcDaoSupport implements ProductDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}


	public void insertProduct(Product hos) {
		String sql = "insert into product_details (prod_id,prod_name,prod_code,prod_type) values (?,?,?,?)";
		getJdbcTemplate().update(sql, new Object[]{
				hos.getprod_id(), hos.getprod_name(), hos.getprod_code(), hos.getprod_type()
		});
	}

	
	public List<Product> getAllProduct() {
		String sql = "SELECT * FROM product_details";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Product> result = new ArrayList<Product>();
		for(Map<String, Object> row:rows) {
			Product hos=new Product();
			hos.setprod_id((String)row.get("prod_id"));
			hos.setprod_name((String)row.get("prod_name"));
			hos.setprod_code((String)row.get("prod_code"));
			hos.setprod_type((String)row.get("prod_type"));
			
			result.add(hos);
		}
		return result;
	}

	
	public void deleteProduct(Product hos) {
		String sql = "DELETE FROM product_details Where prod_id = ?" ;
		getJdbcTemplate().update(sql, new Object[]{
				hos.getprod_id()
		});
		
	}

	
	public void updateProduct(Product hos) {
		getJdbcTemplate().update("update product_details " + " set prod_type = ? where prod_id = ?",
				new Object[] {hos.getprod_type(),hos.getprod_id()});
		
	}

	
	public List<Product> FindProductNameById(Product hos) {
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from product_details where prod_id = ?", new Object[]{hos.getprod_id()});
		List<Product> result = new ArrayList<Product>();
		for(Map<String, Object> row:rows) {
			Product hos1 = new Product();
			hos1.setprod_id((String)row.get("prod_id"));
			hos1.setprod_name((String)row.get("prod_name"));
			hos1.setprod_code((String)row.get("prod_code"));
			hos1.setprod_type((String)row.get("prod_type"));
			
			result.add(hos1);
		}
		return result;
	}
}	
