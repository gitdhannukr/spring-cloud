package com.ust.pms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.Product;

@Service
public class ProductService {

	private List<Product> products = new ArrayList<> (
			Arrays.asList(new Product(1, "Mouse", 100, 399),
			new Product(2, "Laptop", 15070, 299), 
			new Product(3, "Mobile", 13400, 1992),
			new Product(4, "Toys", 1020, 199), 
			new Product(5, "Shoes", 1002, 1992),
			new Product(6, "Pendrive", 1002, 1992)
	));
	
	public void saveProduct(Product product) {
		products.add(product);
	}
	
	
	public List<Product> getProducts(){
			return products;
	}
	
	public Product getProduct(Integer productId) {
		//It will search the products array and return the product
		return products.stream().filter(kk -> kk.getProductId() == (productId)).findFirst().get();
	}


	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}


	public List<Product> filterProductByPrice(int lowerRange, int upperRange) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
