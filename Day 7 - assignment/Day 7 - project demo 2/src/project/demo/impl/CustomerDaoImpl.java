package project.demo.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import project.demo.dao.CustomerDao;
import project.demo.dao.CustomerExistsException;
import project.demo.dao.CustomerNotFoundException;
import project.demo.entity.Customer;

/**
 * 
 * @author Y. Suchit
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	/**
	 * Map for storing customer details(Database)
	 */
	private HashMap<Integer, Customer> custMap = new HashMap<>();

	@Override
	public Customer find(int id) {
		/**
		 * finds the customer by id if exists else throws exception
		 */
		try {
			if (this.custMap.containsKey(id))
				return this.custMap.get(id);
			else
				throw new CustomerNotFoundException();
		} catch (CustomerNotFoundException e) {
			throw e;
		}
	}

	@Override
	public String register(int id, Customer std) {
		/**
		 * registers the customer with details and throws exception if customer already
		 * exists
		 */
		try {
			if (custMap.containsKey(id) == false) {
				custMap.put(id, std);
				return "Customer " + id + " registered successfully...";
			} else
				throw new CustomerExistsException();

		} catch (CustomerExistsException e) {
			throw e;
		}
	}

	@Override
	public String remove(int id) {
		/**
		 * removes the customer by id throws exception if customer doesn't exist
		 */
		try {
			custMap.remove(id);
			return "Customer " + id + " removed...";
		} catch (CustomerNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void display() {
		/**
		 * displays the details of the customers
		 */

		Set<Integer> idSet = custMap.keySet();

		Iterator<Integer> itr = idSet.iterator();

		while (itr.hasNext()) {
			int id = itr.next();
			System.out.println(id + " - " + custMap.get(id));
		}
	}
}
