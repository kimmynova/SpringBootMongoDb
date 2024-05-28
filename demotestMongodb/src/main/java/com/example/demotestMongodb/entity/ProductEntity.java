package com.example.demotestMongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "products")
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private String image;
    private String description;
    private Double price;

}
