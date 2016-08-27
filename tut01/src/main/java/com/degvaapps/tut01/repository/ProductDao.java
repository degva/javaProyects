package com.degvaapps.tut01.repository;

import java.util.List;

import com.degvaapps.tut01.domain.Product;

public interface ProductDao {
	public List<Product> getProductList();
	public void saveProduct(Product prod);
}
