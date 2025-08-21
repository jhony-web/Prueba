package com.example.SpringPrueba.service;

import com.example.SpringPrueba.domain.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl {

    List<Product> products = new ArrayList<>(Arrays.asList(
          new Product(1,"Laptop", 1500.0,10),
            new Product(2,"Smartphone", 900.0,25),
            new Product(3,"Tablet", 1110.2,15),
            new Product(4,"Smartwatch", 400.6,30)
    ));

    public List<Product> getProducts(){
        return products;
    }

}
