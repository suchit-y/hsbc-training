package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataToFileWithDOS {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("myData.dat", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);

		dos.writeInt(80);
		dos.writeUTF("Suchit");
		dos.writeUTF("Chennai");
		dos.writeDouble(10000);
		
		dos.close();
	}

}
