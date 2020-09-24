package com.practical.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.practical.dao.ProductDao;
import com.practical.entity.Apparel;
import com.practical.entity.Product;
import com.practical.exceptions.ApparelExistsException;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is an apparel implmentaion of product DAO
 *
 */
public class ApparelDaoImpl implements ProductDao {
	private HashMap<Integer, Product> apparelMap = new HashMap<>();

	@Override
	public void register(int id, Object a) {
		try {
			if (apparelMap.containsKey(id) == false) {
				apparelMap.put(id, (Apparel) a);
				System.out.println("Apparel " + id + " registered successfully...");
			} else
				throw new ApparelExistsException();

		} catch (ApparelExistsException e) {
			// throw e;
		}
	}

	@Override
	public void display() {
		Set<Integer> idSet = apparelMap.keySet();

		Iterator<Integer> itr = idSet.iterator();

		while (itr.hasNext()) {
			int id = itr.next();
			System.out.println(id + " - " + apparelMap.get(id));
		}
	}

}
