package com.getandpost.controller;


import com.getandpost.model.Product;
import com.getandpost.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


    @GetMapping("/products{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById((long) id);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }


    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("products{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);

    }

}
