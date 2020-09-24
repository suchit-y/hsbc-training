package com.practical.dao;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a Product DAO class
 *
 */
public interface ProductDao {
	public void register(int id, Object fi);

	public void displaySortedQuantity(int limit);

	public void display();
}
