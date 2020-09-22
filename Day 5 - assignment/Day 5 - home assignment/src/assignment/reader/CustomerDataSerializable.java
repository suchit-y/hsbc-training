package assignment.reader;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import assignment.entity.Customer;

public class CustomerDataSerializable {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Customer cust = null;
		try {
			fis = new FileInputStream("CustomerData.ser");
			ois = new ObjectInputStream(fis);
			while (true) {
				cust = (Customer) ois.readObject();
				System.out.println(cust.toString());
			}
		} catch (EOFException e) {
			System.out.println("done...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (ois != null)
					ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
