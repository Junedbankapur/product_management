package project.product.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.product.management.entity.Product;
import project.product.management.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{
  
	private final ProductRepository repo;
	
	public ProductServiceImplementation(ProductRepository repo) {
		this.repo = repo;
	}
	@Override
	public String addProduct(Product prod) {
		repo.save(prod);
		return "Product added sucessfully!!!";
	}

	@Override
	public String updateProduct(Product prod) {
		repo.save(prod);
		return "Product updated sucessfully!!!";
	}

	@Override
	public String deleteProduct(Long prodId) {
		repo.deleteById(prodId);
		return "Product deleted sucessfully!!!";
	}

	@Override
	public Product viewProduct(Long prodId) {
		
		return repo.findById(prodId).get();
	}

	@Override
	public List<Product> viewAllProducts() {
		
		return repo.findAll();
	}

}
