package com.example.demo.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
	@Autowired
	private ProductRepository repository;
//
//	public Product saveProduct(Product p)
//	{
//		return repository.save(p);
//		
//	}
//	public List<Product> saveProduct(List<Product> p)
//	{
//		return repository.saveAll(p);
//		
//	}
//	public List<Product> getProduct()
//	{
//		return repository.findAll();
//		
//	}
//	public Product getProduct(int id)
//	{
//		return repository.findById(id).orElse(null);
//		
//	}
//	
//	public Product getProduct(String name)
//	{
//		return repository.findByName(name);
//		
//	}
//	
//	public String deleteProduct(int id)
//	{
//		repository.deleteById(id);
//		return "Product Removed :" + id;
//	}
//	
//	public Product updateProduct(Product p)
//	{
//		Product existingProduct =  repository.findById(p.getId()).orElse(null);
//		existingProduct.setName(p.getName());
//		existingProduct.setQuantity(p.getQuantity());
//		existingProduct.setPrice(p.getPrice());
//		return repository.save(existingProduct);
//		
//	}
}
