package com.falabella.FalabellaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.falabella.FalabellaTest.models.ProductModel;
import com.falabella.FalabellaTest.repositories.ProductRepository;
import com.falabella.FalabellaTest.services.ProductService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class FalabellaTestApplicationTest {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ProductService service;

	@MockBean
	private ProductRepository repository;

	@Test
	public void getProductsTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new ProductModel(1L, "sku", "name", "brand", "size", 0L, "www.google.com", null), 
				new ProductModel(1L, "sku", "name", "brand", "size", 0L, "www.google.com", null)).collect(Collectors.toList()));
		assertEquals(2, service.getProducts().size());
	}

	@Test
	public void getByIdTest() {
		when(repository.findById(1L)).thenReturn(Optional.of(
			new ProductModel(1L, "sku", "name", "brand", "size", 0L, "www.google.com", null)));
		assertEquals(1, service.getById(1L).get().getId());
	}

	@Test
	public void getBySkuTest() {
		when(repository.findBySku("sku")).thenReturn(new ArrayList<ProductModel>(Stream.of(
			new ProductModel(1L, "sku", "name", "brand", "size", 0L, "www.google.com", null)).collect(Collectors.toList())));
		assertEquals(1, service.getBySku("sku").size());
	}
}
