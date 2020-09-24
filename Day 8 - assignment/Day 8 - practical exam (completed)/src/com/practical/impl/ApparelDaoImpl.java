package com.practical.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
			throw e;
		}
	}

	@Override
	public void displaySortedQuantity(int limit) {
		try {
			List<Product> apparelList = new ArrayList<Product>(apparelMap.values());
			Collections.sort(apparelList, Collections.reverseOrder());

			Iterator<Product> itr = apparelList.iterator();
			while (limit > 0) {
				Product p = itr.next();
				System.out.println(p.toString());
				limit--;
			}
		} catch (Exception e) {
			throw e;
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
