package com.practical.entity;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a food items entity class
 *
 */
public class FoodItems extends Product {
	String dateOfManufacture;
	String dateOfExpiry;
	boolean vegetarian;

	public FoodItems() {
	}

	public FoodItems(int itemId, String itemName, double unitPrice, int quantity, String dateOfManufacture,
			String dateOfExpiry, boolean vegetarian) {
		super(itemId, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return super.toString() + " dateOfManufacture: " + dateOfManufacture + " dateOfExpiry: " + dateOfExpiry
				+ " vegetarian: " + vegetarian;
	}

}
