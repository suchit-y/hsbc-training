package com.practical.exceptions;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the programs throws exception if food item exists
 *
 */
public class FoodItemExistsException extends RuntimeException {
	@Override
	public String toString() {
		return "FoodItemExistsException";
	}
}
