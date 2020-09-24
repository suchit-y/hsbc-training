package com.practical.service;

import java.util.Scanner;

import com.practical.dao.ProductDao;
import com.practical.entity.FoodItems;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a service class to invoke implementation class
 *
 */
public class ProductService {
	ProductDao dao;

	public ProductService(ProductDao dao) {
		this.dao = dao;
	}

	public void registerFoodItem(int id, FoodItems fi) {
		try {
			dao.register(id, fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void display() {
		try {
			dao.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
