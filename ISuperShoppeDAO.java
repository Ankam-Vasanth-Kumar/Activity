package com.capgemini.productdetails.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.productdetails.bean.Product;

public interface ISuperShoppeDAO {
	Map<Integer, Product>productList=new HashMap<>();

	int addProduct(Product product);

	Product getProduct(int productId);
public Map<Integer, Product> getAllProducts();

}
