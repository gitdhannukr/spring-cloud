package com.ust.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.Product;
import com.ust.pms.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("product")
//@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class ProductController {

	@Autowired
	ProductService productService;

	// @RequestMapping(method = RequestMethod.POST )
	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		System.out.println("Saving product recieved : "+product);
		productService.saveProduct(product);
		return "Saving Product";
	}

	// @RequestMapping(method = RequestMethod.DELETE)
	@DeleteMapping(path = "/{productId}")
	public String deleteProduct(@PathVariable("productId") Integer productId) {
		productService.deleteProduct(productId);
		return "Deleting Product";
	}

	// @RequestMapping(method = RequestMethod.PUT)
	@PutMapping
	public String updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
		return "Update Product";
	}

	// @RequestMapping(method = RequestMethod.GET )
	@GetMapping
	public List<Product> getProducts() {
		System.out.println("Get products");
		return productService.getProducts();
	}

	@GetMapping(path = "/{productId}")
	public Product getProduct(@PathVariable("productId") Integer productId) {
		System.out.println("Get product for product id " + productId);
		return productService.getProduct(productId);
	}
	
	@GetMapping(path="filterProductByPrice/{lowerRange}/{upperRange}")
	@ApiOperation(value="find product by giving lower and upper range bound",notes="hey you van product on price for example:1900-3000",response=Product.class)
	public List<Product> filterProductByPrice(@PathVariable("lowerRange")int lowerRange,@PathVariable("upperRange")int upperRange) {
		
		System.out.println("Get products name between"+lowerRange+"and"+upperRange);
		return productService.filterProductByPrice(lowerRange,upperRange);
	}

}
