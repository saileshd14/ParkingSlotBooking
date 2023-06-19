package com.example.demo.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
//	@PostMapping("/addProduct")
//	public Product addProduct(@RequestBody Product p)
//	{
//		return service.saveProduct(p);
//	}
//	@PostMapping("/addProducts")
//	public List<Product> addProduct(@RequestBody List<Product> p)
//	{
//		return service.saveProduct(p);
//	}
//	@GetMapping("/products")
//	public List<Product>  findAllProducts()
//	{
//		return service.getProduct();
//	}
//	
//	@GetMapping("/productById/{id}")
//	public Product  findProductById(@PathVariable int id)
//	{
//		return service.getProduct(id);
//	}
//	
//	@GetMapping("/productByName/{name}")
//	public Product  findProductByName(@PathVariable String name)
//	{
//		return service.getProduct(name);
//	}
//	
//	@PutMapping("/update")
//	public Product updateProduct(@RequestBody Product p)
//	{
//		return service.updateProduct(p);
//	}
//	@DeleteMapping("/delete/{id}")
//	public String deleteProduct(@PathVariable int id)
//	{
//		return service.deleteProduct(id);
//	}
}
