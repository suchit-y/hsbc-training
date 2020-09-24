package com.practical.service;

import com.practical.dao.ProductDao;
import com.practical.impl.ApparelDaoImpl;
import com.practical.impl.ElectronicsDaoImpl;
import com.practical.impl.FoodItemsDaoImpl;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a factory method to create appropriate product DAO implementation
 *
 */
public class ProductFactoryMethod {

	public static ProductDao connectProduct(String str) {
		if (str == "fooditems")
			return new FoodItemsDaoImpl();
		else if (str == "apparel")
			return new ApparelDaoImpl();
		else if (str == "electronics")
			return new ElectronicsDaoImpl();
		else
			return null;
	}
}
