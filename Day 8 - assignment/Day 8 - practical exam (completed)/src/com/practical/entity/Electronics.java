package com.practical.entity;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is an electronics entity class
 *
 */
public class Electronics extends Product {
	int warranty;

	public Electronics() {
	}

	public Electronics(int itemId, String itemName, double unitPrice, int quantity, int warranty) {
		super(itemId, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return super.toString() + " warranty: " + warranty;
	}

}
