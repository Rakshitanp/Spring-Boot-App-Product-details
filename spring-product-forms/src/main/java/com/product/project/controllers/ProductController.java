package com.product.project.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.product.project.model.Product;
import com.product.project.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addProduct", "hos", new Product());
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("hos") Product hos) {
		productService.insertProduct(hos);
		List<Product> products = productService.getAllProduct();
		ModelAndView model = new ModelAndView("getProduct");
		model.addObject("products", products);
		return model;
	}
	
	@RequestMapping("/getProduct")
	public ModelAndView getProducts() {
		List<Product> products = productService.getAllProduct();
		ModelAndView model = new ModelAndView("getProduct");
		model.addObject("products", products);
		return model;
	}
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView processDelete(@ModelAttribute("hos") Product hos) {
		productService.deleteProduct(hos);
		List<Product> products = productService.getAllProduct();
		ModelAndView model = new ModelAndView("deleteProduct");
		model.addObject("products", products);
		return model;
	}
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.GET)
	public ModelAndView processUpdate(@ModelAttribute("hos") Product hos) {
		productService.updateProduct(hos);
		List<Product> products = productService.getAllProduct();
		ModelAndView model = new ModelAndView("updateProduct");
		model.addObject("products", products);
		return model;
		
	}

	@RequestMapping(value="/findProduct",method = RequestMethod.GET)
	public ModelAndView FindDepartment(@ModelAttribute("hos") Product hos) {
		productService.FindProductNameById(hos);
		List<Product> products = productService.getAllProduct();
		ModelAndView model = new ModelAndView("findProduct");
		model.addObject("products", products);
		return model;
		}
	/*@RequestMapping(value = "/found", method = RequestMethod.GET)
	public ModelAndView find() {
		return new ModelAndView("found", "hos", new Product());
	}*/
	@RequestMapping(value="/found",method = RequestMethod.GET)
	public ModelAndView Found(@ModelAttribute("hos") Product hos) {
		List<Product> products = productService.FindProductNameById(hos);
		ModelAndView model = new ModelAndView("found");
		model.addObject("products", products);
		return model;
	}
		
		
}