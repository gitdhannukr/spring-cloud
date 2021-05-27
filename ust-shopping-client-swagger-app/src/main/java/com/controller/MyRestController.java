package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.client.codegen.rest.api.ProductControllerApi;
import com.swagger.client.codegen.rest.model.Product;

@RestController
@RequestMapping("/hello")
public class MyRestController {
	
	@Autowired
	ProductControllerApi productControllerApi;
	
	@GetMapping
	public Product getProduct(@RequestParam(name="productId")String productId)
	{
		int pId=Integer.parseInt(productId);
		Product product=productControllerApi.getProductUsingGET(pId);
		return product;
	}
}
