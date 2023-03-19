package com.codegym.service;

import com.codegym.entity.Product;
import com.codegym.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor
public class ProductService implements IProductService {
    private final IProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public Product findProductByName(String name){
      return   this.productRepository.findProductByName(name);
    }
}
