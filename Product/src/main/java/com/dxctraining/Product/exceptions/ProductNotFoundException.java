package com.dxctraining.Product.exceptions;

public class ProductNotFoundException extends RuntimeException {

	public ProductNotFoundException(String msg){
		super(msg);
	}
}
