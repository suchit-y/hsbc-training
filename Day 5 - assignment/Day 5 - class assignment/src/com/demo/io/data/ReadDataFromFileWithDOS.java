package com.demo.io.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFileWithDOS {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("myData.dat");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			while (true) {
				int id = dis.readInt();
				String name = dis.readUTF();
				String city = dis.readUTF();
				double salary = dis.readDouble();
				System.out.println(id + " " + name + " " + city + " " + salary);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (EOFException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
