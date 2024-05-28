package com.example.demotestMongodb.controller;

import com.example.demotestMongodb.entity.ProductEntity;
import com.example.demotestMongodb.model.ProductRQ;
import com.example.demotestMongodb.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductEntity product(@RequestBody ProductRQ request) {
        return productService.createProduct(request);
    }

    @PutMapping("/{id}")
    public ProductEntity updateProduct(@PathVariable String id, @RequestBody ProductRQ request) {
        return productService.updateProduct(id, request);
    }

    @DeleteMapping("/{id}")
    public ProductEntity deleteProduct(@PathVariable String id) {
        return productService.deleteProduct(id);
    }

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        List<ProductEntity> products = productService.listProduct();
        return ResponseEntity.ok().body(products);
    }
}

