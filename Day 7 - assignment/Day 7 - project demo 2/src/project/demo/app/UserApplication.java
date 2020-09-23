package project.demo.app;

import project.demo.dao.CustomerDao;
import project.demo.entity.Customer;
import project.demo.impl.CustomerDaoImpl;
import project.demo.service.CustomerFactoryMethod;
import project.demo.service.CustomerService;

/**
 * 
 * @author Y. Suchit
 *
 */
public class UserApplication {

	public static void main(String[] args) {
		CustomerDao dao = CustomerFactoryMethod.connectDb("customer");
		CustomerService cs = new CustomerService(dao);

		cs.registerCustomer(400, new Customer(400, "Suchit", "7445124585", "address123"));
		cs.registerCustomer(401, new Customer(401, "Sagar", "7589652458", "address123"));
		cs.registerCustomer(401, new Customer(401, "Sanjay", "7425636698", "address123"));
		cs.registerCustomer(402, new Customer(402, "Shantanu", "7441214574", "address123"));

		cs.displayCustomerList();

		Customer c = cs.findById(401);

		cs.removeCustomer(401);

		cs.displayCustomerList();
	}

}
