package com.falabella.FalabellaTest.repositories;

import com.falabella.FalabellaTest.models.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {
    
}
