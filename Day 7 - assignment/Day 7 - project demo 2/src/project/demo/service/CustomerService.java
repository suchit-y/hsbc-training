package project.demo.service;

import project.demo.dao.CustomerDao;
import project.demo.entity.Customer;

/**
 * 
 * @author Y. Suchit
 *
 */
public class CustomerService {
	CustomerDao dao;

	public CustomerService(CustomerDao dao) {
		this.dao = dao;
	}

	public void registerCustomer(int id, Customer std) {
		/**
		 * invokes register method of implementation class
		 */
		try {
			System.out.println(dao.register(id, std));
		} catch (Exception e) {
			System.out.println("Customer " + id + " Exists...");
		}
	}

	public void displayCustomerList() {
		/**
		 * invokes display method of implementatioin class
		 */
		dao.display();
	}

	public Customer findById(int id) {
		/**
		 * invokes find method of implementation class
		 */
		try {
			Customer std = dao.find(id);
			return std;
		} catch (Exception e) {
			System.out.println("Customer " + id + " not found...");
		}
		return null;
	}

	public void removeCustomer(int id) {
		/**
		 * invokes remove method of implementation class
		 */
		try {
			System.out.println(dao.remove(id));
		} catch (Exception e) {
			System.out.println("Customer " + id + " doesn't exist...");
		}
	}
}
