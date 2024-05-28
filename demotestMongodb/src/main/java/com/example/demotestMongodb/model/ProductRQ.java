package com.example.demotestMongodb.model;

import lombok.Data;

@Data
public class ProductRQ {

    private String name;
    private String image;
    private String description;
    private Double price;

}
