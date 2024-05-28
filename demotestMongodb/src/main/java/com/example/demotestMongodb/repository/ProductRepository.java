package com.example.demotestMongodb.repository;

import com.example.demotestMongodb.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
