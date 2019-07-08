package com.capgemini.productdetails.bean;

public class Supplier {
	private int supplierId;
	private String name ;
	private String mobileNo;
	private String address;
	public Supplier() {
		super();
	}
	public Supplier(int supplierId, String name, String mobileNo, String address) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + ", mobileNo=" + mobileNo + ", address="
				+ address + "]";
	}
	
}
