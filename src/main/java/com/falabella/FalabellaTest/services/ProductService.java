package com.falabella.FalabellaTest.services;

import java.util.ArrayList;

import com.falabella.FalabellaTest.models.ProductModel;
import com.falabella.FalabellaTest.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    
    public ArrayList<ProductModel> getProducts(){
        return (ArrayList<ProductModel>)productRepository.findAll();
    }

    public ProductModel saveProduct(ProductModel product){
        return productRepository.save(product);
    }
}
