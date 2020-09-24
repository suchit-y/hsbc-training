package com.practical.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.practical.dao.ProductDao;
import com.practical.entity.Electronics;
import com.practical.entity.Product;
import com.practical.exceptions.ElectronicsExistsException;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is an electronics implmentaion of product DAO
 *
 */
public class ElectronicsDaoImpl implements ProductDao {
	private HashMap<Integer, Product> electronicsMap = new HashMap<>();

	@Override
	public void register(int id, Object e) {
		try {
			if (electronicsMap.containsKey(id) == false) {
				electronicsMap.put(id, (Electronics) e);
				System.out.println("Apparel " + id + " registered successfully...");
			} else
				throw new ElectronicsExistsException();

		} catch (ElectronicsExistsException ex) {
			// throw e;
		}
	}

	@Override
	public void display() {
		Set<Integer> idSet = electronicsMap.keySet();

		Iterator<Integer> itr = idSet.iterator();

		while (itr.hasNext()) {
			int id = itr.next();
			System.out.println(id + " - " + electronicsMap.get(id));
		}
	}

}
