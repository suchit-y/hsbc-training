package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.entity.Emp;

public class MyEmpDeserializable {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				Object obj = ois.readObject();
				//System.out.println(obj.getClass().getName());

				Emp emp = (Emp) obj;

				System.out.println(emp.toString());
			}
		} catch (EOFException e) {
			System.out.println("Done...");
		}

		System.out.println("Emp Deserialized...");

		fis.close();
		ois.close();
	}

}
