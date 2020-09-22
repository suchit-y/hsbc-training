package com.demo.io.ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.entity.Emp;

public class MyEmpSerializable {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Emp emp = null;
		for (int i = 0; i < 10; i++) {
			emp = new Emp(i + 1, "Employee " + (i + 1), "City " + i + 1, 10000);
			oos.writeObject(emp);
		}
		System.out.println("Emp Serialized...");

		fos.close();
		oos.close();
	}

}
