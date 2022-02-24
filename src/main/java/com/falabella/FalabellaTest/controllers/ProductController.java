package com.falabella.FalabellaTest.controllers;

import java.util.ArrayList;

import com.falabella.FalabellaTest.models.ProductModel;
import com.falabella.FalabellaTest.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<ProductModel> getProduct(){
        return productService.getProducts();
    }

    @PostMapping()
    public ProductModel saveProduct(@RequestBody ProductModel product){
        return this.productService.saveProduct(product);
    }
    
}
