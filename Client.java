package com.capgemini.productdetails.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.capgemini.productdetails.bean.Product;
import com.capgemini.productdetails.exception.ProductDetails;
import com.capgemini.productdetails.service.SuperShoppeServiceImpl;



public class Client {
static	SuperShoppeServiceImpl service=new  SuperShoppeServiceImpl();
static Scanner scanner = new Scanner(System.in);
static void addProduct() {
	System.out.println("Enter product id ");
	int productID = scanner.nextInt();
	
	System.out.println("Enter product name");
	String name = scanner.next();
	System.out.println("Enter product price");
	scanner.nextLine();
	double price = scanner.nextInt();
	System.out.println("enter quantity");
	int quantity=scanner.nextInt();
	if (!service.isProductIDValid(productID)) {
		try {
			throw new ProductDetails("product id should be in numbers only");
		} catch (ProductDetails e) {
			System.err.println(e.getMessage());
		}
	} else {
 Product product= new Product(productID,name,price,quantity);
		int custId = service.addProduct(product);
		System.out.println("Product Registered successfully and your id is:" + custId);
		System.out.println("Namaskar Application m apka swagat hai");
	}
}  
public static void main(String[] args) {

	/*
	 * CustomerServiceImpl service = new CustomerServiceImpl(); Scanner scanner =
	 * new Scanner(System.in);
	 */
	String option = null;
	do {
		System.out.println("1.Add Product\n2.kuch nahi\n5.display\n0.exitl");
		int choice = scanner.nextInt();
		switch (choice) {
		case 0:
			System.exit(0);
		case 1: {
			addProduct();
		}
			break;
		case 5: {
			List<String> keyList = new ArrayList<String>(productList.keySet());
			System.out.println(al);
		}
			break;

		default:
			System.out.println("Enter 1 to 5 only");
			break;
		}
		System.out.println("Press y to continue");
		option = scanner.next();
	} while (option.equalsIgnoreCase("y"));

	scanner.close();

}


}
