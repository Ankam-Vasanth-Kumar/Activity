package com.capgemini.productdetails.service;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.productdetails.bean.Product;
import com.capgemini.productdetails.bean.Supplier;

public interface ISuperShoppeService {
	public int addProduct(Product product);
	public int addSupplier(Supplier sup);
	public Map<Integer, Product> getAllProducts();
	public HashMap<Integer,Supplier> getAllSuppliers();


}
