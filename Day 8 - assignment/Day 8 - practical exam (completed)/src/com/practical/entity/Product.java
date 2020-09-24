package com.practical.entity;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a Product entity class
 *
 */
public class Product implements Comparable<Product> {
	int itemId;
	String itemName;
	double unitPrice;
	int quantity;

	// SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	// date2 = dateFormat.parse(date);
	public Product() {
	}

	public Product(int itemId, String itemName, double unitPrice, int quantity) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Id: " + itemId + " itemName: " + itemName + " unitPrice: " + unitPrice + " quantity: " + quantity;
	}

	@Override
	public int compareTo(Product o) {
		return this.quantity - o.quantity;
	}

}
