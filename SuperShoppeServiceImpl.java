package com.capgemini.productdetails.service;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.capgemini.productdetails.bean.Product;
import com.capgemini.productdetails.bean.Supplier;
import com.capgemini.productdetails.dao.ISuperShoppeDAO;
import com.capgemini.productdetails.dao.SuperShoppeDAOImpl;

public class SuperShoppeServiceImpl implements ISuperShoppeService {
	ISuperShoppeDAO supershoppedao=new SuperShoppeDAOImpl();

	public boolean isProductIDValid(int productID) {
		String pid=String.valueOf(productID);
		Pattern idPattern=Pattern.compile("^[0-9]*$");
		Matcher match=idPattern.matcher(pid);
		if(match.matches()) {
			return true;
		}
		return false;
	}

	public boolean isproductNameValid(String name) {
		Pattern namePattern = Pattern.compile("^[A-Z]*$");
		Matcher match = namePattern.matcher(name);
		if (match.matches()) {
			return true;
		}
		return false;
	}

	public boolean isPriceValid(double price) {
		String pprice=String.valueOf(price);
		Pattern idPattern=Pattern.compile("^[0-9]*$");
		Matcher match=idPattern.matcher(pprice);
		if(match.matches()) {
			return true;
		}
		return false;
	}

	public boolean isQuantityValid(int quantity) {
		String pquantity=String.valueOf(quantity);
		Pattern idPattern=Pattern.compile("^[0-9]*$");
		Matcher match=idPattern.matcher(pquantity);
		if(match.matches()) {
			return true;
		}
		return false;
	}
@Override
	public int addProduct(Product product) {
		int productID= (int) (Math.random() * 1000);// gives huge numbers Method-1
		// Random random=new Random(1000); Gives less numbers Method-2 usually not
		// preferred
		product.setProductId(productID);
		return supershoppedao.addProduct(product);

	}


	@Override
	public int addSupplier(Supplier sup) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<Integer, Product> getAllProducts() {
		return supershoppedao.getAllProducts();
		
	}

	@Override
	public HashMap<Integer, Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
