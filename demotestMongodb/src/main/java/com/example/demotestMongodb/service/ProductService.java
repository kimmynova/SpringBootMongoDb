package com.example.demotestMongodb.service;

import com.example.demotestMongodb.entity.ProductEntity;
import com.example.demotestMongodb.mapper.ProductMapper;
import com.example.demotestMongodb.model.ProductRQ;
import com.example.demotestMongodb.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper Mapper;

    public ProductEntity createProduct(ProductRQ productRQ) {
        ProductEntity productEntity = Mapper.from(productRQ);
        productEntity = productRepository.save(productEntity);
        return productEntity;
    }

    public ProductEntity updateProduct(String id, ProductRQ productRQ) {
        ProductEntity productEntity = productRepository.findById(id).orElseThrow(() -> new RuntimeException("not id"));
        Mapper.updateProductFromRQ(productRQ, productEntity);
        productEntity = productRepository.save(productEntity);
        return productEntity;
    }

    public ProductEntity deleteProduct(String id) {
        ProductEntity productEntity = productRepository.findById(id).orElseThrow(() -> new RuntimeException("not id"));
        productRepository.delete(productEntity);
        return productEntity;

    }

    public List<ProductEntity> listProduct() {
        return productRepository.findAll();
    }
}
