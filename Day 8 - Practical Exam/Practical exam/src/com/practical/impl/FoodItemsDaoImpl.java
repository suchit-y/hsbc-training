package com.practical.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.practical.dao.ProductDao;
import com.practical.entity.FoodItems;
import com.practical.entity.Product;
import com.practical.exceptions.FoodItemExistsException;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is food items an implmentaion of product DAO
 *
 */
public class FoodItemsDaoImpl implements ProductDao {
	private HashMap<Integer, Product> foodItemsMap = new HashMap<>();

	@Override
	public void register(int id, Object fi) {
		try {
			if (foodItemsMap.containsKey(id) == false) {
				foodItemsMap.put(id, (FoodItems) fi);
				System.out.println("Food item " + id + " registered successfully...");
			} else
				throw new FoodItemExistsException();

		} catch (FoodItemExistsException e) {
			// throw e;
		}
	}

	@Override
	public void display() {
		Set<Integer> idSet = foodItemsMap.keySet();

		Iterator<Integer> itr = idSet.iterator();

		while (itr.hasNext()) {
			int id = itr.next();
			System.out.println(id + " - " + foodItemsMap.get(id));
		}
	}

}
