package com.getandpost.service;


import com.getandpost.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<Product>(List.of(
            new Product(1L, "Apple", 1000.0),
            new Product(2L, "Samsung", 10938.3),
            new Product(3L, "MacBook", 93874.3),
            new Product(4L, "Android", 1000.0),
            new Product(6L, "Asus", 1000.0)
    ));

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
