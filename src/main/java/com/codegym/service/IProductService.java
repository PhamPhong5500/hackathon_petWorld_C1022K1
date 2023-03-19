package com.codegym.service;

import com.codegym.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
    void deleteProduct(Long id);

    Product saveProduct(Product product);

}
