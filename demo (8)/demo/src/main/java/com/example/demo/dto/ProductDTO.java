package com.example.demo.dto;

public class ProductDTO {
	
	private int productId;
	
	private String productName;
	
	private int productQty;
	
	private int productPrice;
	
	private int productMRP;
	
	private int productTax;
	
	
	
	
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId=productId;
	}
	
	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty=productQty;
	}
	
	
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice=productPrice;
	}
	
	
	public int getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(int productMRP) {
		this.productMRP=productMRP;
	}
	
	public int getProductTax() {
		return productTax;
	}
	public void setProductTax(int productTax) {
		this.productTax=productTax;
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productMRP=" + productMRP + ", productTax=" + productTax + "]";
	}
	
	
}
