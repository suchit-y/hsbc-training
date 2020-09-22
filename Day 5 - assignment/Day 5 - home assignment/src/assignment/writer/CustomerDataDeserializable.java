package assignment.writer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import assignment.entity.Customer;

public class CustomerDataDeserializable {

	public static void main(String[] args) {
		Customer cust[] = new Customer[10];
		for (int i = 0; i < 5; i++) {
			cust[i] = new Customer(i + 1, "Customer " + (i + 1), "abcde12345");
		}

		FileOutputStream fw = null;
		ObjectOutputStream oos = null;

		try {
			fw = new FileOutputStream("CustomerData.ser");
			oos = new ObjectOutputStream(fw);

			for (int i = 0; i < 5; i++)
				oos.writeObject(cust[i]);
			System.out.println("Data Stored...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
