package com.practical.service;

import com.practical.dao.ProductDao;
import com.practical.impl.ApparelDaoImpl;
import com.practical.impl.ElectronicsDaoImpl;
import com.practical.impl.FoodItemsDaoImpl;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a factory method to create appropriate product DAO
 *          implementation
 *
 */
public class ProductFactoryMethod {

	public static ProductDao connectProduct(String str) {
		if (str.equals("food items"))
			return new FoodItemsDaoImpl();
		else if (str.equals("apparel"))
			return new ApparelDaoImpl();
		else if (str.equals("electronics"))
			return new ElectronicsDaoImpl();
		else
			return null;
	}
}
