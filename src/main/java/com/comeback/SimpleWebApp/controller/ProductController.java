package com.comeback.SimpleWebApp.controller;

import com.comeback.SimpleWebApp.model.Product;
import com.comeback.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//Controller layer : This is the controller layer which handles the incoming requests.
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
       service.addProduct(prod);
    }

    @PutMapping("/products/{prodId}")
    public void UpdateProduct(@RequestBody Product prod){
//        System.out.println(prod);
        service.UpdateProduct(prod);
//        System.out.println(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void DeleteProduct(@PathVariable int prodId){
//        System.out.println(prod);
        service.DeleteProduct(prodId);
//        System.out.println(prod);
    }
}
