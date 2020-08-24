package com.product.project.model;

public class Product {
	private String prod_id;
	private String prod_name;
	private String prod_code;
	private String prod_type;
	private String sql;
	
	public String getprod_id() {
		return prod_id;
	}
	public void setprod_id(String PNO) {
		prod_id=PNO;
	}
	public String getprod_name() {
		return prod_name;
	}
	public void setprod_name(String pname) {
		prod_name=pname;
	}
	public String getprod_code() {
		return prod_code;
	}
	public void setprod_code(String prodc) {
		prod_code=prodc;
	}
	public String getprod_type() {
		return prod_type;
	}
	public void setprod_type(String prodt) {
		prod_type=prodt;
	}
	
	@Override
	public String toString() {
		return "product_details [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_code=" + prod_code + ", prod_type=" + prod_type + "]";
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
}
