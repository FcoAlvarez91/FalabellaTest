package com.falabella.FalabellaTest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.falabella.FalabellaTest.models.ProductModel;
import com.falabella.FalabellaTest.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/{id}")
    public Optional<ProductModel> getProductById(@PathVariable("id") Long id){
        return this.productService.getById(id);
    }

    @GetMapping("/query")
    public ArrayList<ProductModel> getProductBySku(@RequestParam("sku") String sku){
        return this.productService.getBySku(sku);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean deleted = this.productService.deleteProduct(id);
        if(deleted){
            return "Product with id " + id + " was succesfully deleted.";
        } else {
            return "Product with id " + id + " was unable to be deleted.";
        }
    }
    
}
