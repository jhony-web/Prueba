package com.example.SpringPrueba.contollers;


import com.example.SpringPrueba.domain.Product;
import com.example.SpringPrueba.service.ProductServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    ProductServiceImpl productosControl = new ProductServiceImpl();

    @GetMapping
    public ResponseEntity<?> getProducts(){
        List<Product> products = productosControl.getProducts();

        return ResponseEntity.ok(products);
    }


}
