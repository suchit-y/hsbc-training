package project.demo.dao;

import project.demo.entity.Customer;

/**
 * 
 * @author Y. Suchit
 *
 */
public interface CustomerDao {
	public Customer find(int id);

	public String register(int id, Customer cust);

	public String remove(int id);

	public void display();
}
