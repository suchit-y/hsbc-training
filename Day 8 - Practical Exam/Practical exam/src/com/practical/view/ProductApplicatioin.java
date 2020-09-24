package com.practical.view;

import java.util.Scanner;

import com.practical.dao.ProductDao;
import com.practical.entity.FoodItems;
import com.practical.impl.FoodItemsDaoImpl;
import com.practical.service.ProductFactoryMethod;
import com.practical.service.ProductService;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a user interaction interface
 *
 */
public class ProductApplicatioin {

	public static void main(String[] args) {

		ProductDao dao = ProductFactoryMethod.connectProduct("fooditems");
		ProductService ps = new ProductService(dao);

		ps.registerFoodItem(100, new FoodItems(100, "biscuit1", 38, 100, "30/08/2020", "30/09/2020", true));
		ps.registerFoodItem(101, new FoodItems(101, "biscuit2", 38, 100, "30/08/2020", "30/09/2020", true));

		ps.display();
	}

}
