package com.practical.entity;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is an apparel entity class
 *
 */
public class Apparel extends Product {
	String size;
	String material;

	public Apparel() {
	}

	public Apparel(int itemId, String itemName, double unitPrice, int quantity, String size, String material) {
		super(itemId, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return super.toString() + " size: " + size + " material: " + material;
	}

}
