package project.demo.service;

import project.demo.dao.CustomerDao;
import project.demo.impl.CustomerDaoImpl;

/**
 * 
 * @author Y. Suchit
 *
 */
public class CustomerFactoryMethod {
	/**
	 * 
	 * @param name of Database to connect
	 * @return instance of implementation class
	 */
	public static CustomerDao connectDb(String str) {
		if (str == "customer")
			return new CustomerDaoImpl();
		return null;
	}
}
