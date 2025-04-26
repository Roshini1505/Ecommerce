package com.example.demo.entity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Table(name = "product")
//@Data
public class ProductEntity {
	
	@Id
	@UuidGenerator
	
	@Column(name ="Product_Id")
	private int productId;
	
	@Column(name ="Product_Name")
	private String productName;
	
	@Column(name ="Product_Qty")
	private int productQty;
	
	@Column(name ="Product_Price")
	private int productPrice;
	
	@Column(name ="Product_MRP")
	private int productMRP;
	
	@Column(name = "Product_Tax")
	private int productTax;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductMRP() {
		return productMRP;
	}

	public void setProductMRP(int productMRP) {
		this.productMRP = productMRP;
	}

	public int getProductTax() {
		return productTax;
	}

	public void setProductTax(int productTax) {
		this.productTax = productTax;
	}

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productMRP=" + productMRP + ", productTax=" + productTax + "]";
	}
	
	
	
	
}
