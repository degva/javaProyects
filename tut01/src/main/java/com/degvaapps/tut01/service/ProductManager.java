package com.degvaapps.tut01.service;

import java.io.Serializable;
import java.util.List;

import com.degvaapps.tut01.domain.Product;

public interface ProductManager extends Serializable {
	public void increasePrice(int percentage);
	public List<Product> getProducts();

}
