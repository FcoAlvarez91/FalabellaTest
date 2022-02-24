package com.falabella.FalabellaTest.repositories;

import java.util.ArrayList;

import com.falabella.FalabellaTest.models.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {
    public abstract ArrayList<ProductModel> findBySku(String sku);
}
