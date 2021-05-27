package com.ust.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pms.model.Product;
import com.ust.pms.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void saveProduct(Product product) {
		//This will save the product in databases
		productRepository.save(product);
	}
	
	
	public List<Product> getProducts(){
			return (List<Product>) productRepository.findAll();
	}
	
	public Product getProduct(Integer productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product.get();
	}
	
	public void deleteProduct(Integer productId) {
		productRepository.deleteById(productId);
	}

	public void updateProduct(Product product) {
		//saveOrUpdate
		productRepository.save(product);
	}


	public List<Product> filterProductByPrice(int lowerRange, int upperRange) {
		// TODO Auto-generated method stub
		return null;
	}
}
