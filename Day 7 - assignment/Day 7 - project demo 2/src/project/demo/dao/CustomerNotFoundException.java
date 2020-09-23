package project.demo.dao;
/**
 * 
 * @author Y. Suchit
 *
 */
public class CustomerNotFoundException extends RuntimeException {
	@Override
	public String toString() {
		return "CustomerExistsException";
	}
}
