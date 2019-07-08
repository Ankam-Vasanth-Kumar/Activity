package com.capgemini.productdetails.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.productdetails.bean.Product;

public class SuperShoppeDAOImpl implements ISuperShoppeDAO {


	@Override
	public int addProduct(Product product) {
		Product p=productList.put(product.getProductId(), product);
		return product.getProductId();
	}
	@Override
	public Product getProduct(int productId) {
		return  productList.get(productId);
	}
	@Override
	public Map<Integer,Product>getAllProducts(){
		return productList;
	}

}
