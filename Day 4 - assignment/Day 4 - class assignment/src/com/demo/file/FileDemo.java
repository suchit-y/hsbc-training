package com.demo.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {

//		File dir = new File("f:\\fileDemo");
//		if (dir.isDirectory())
//			System.out.println("It is a directory.");
//		else
//			System.out.println("It is not a directory.");

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			File file = new File("f:\\fileDemo\\demo.txt");
			fis = new FileInputStream(file);
			fos = new FileOutputStream("f:\\fileDemo\\demo_copy.txt");

			int data = 0;

			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
				fos.write(data);
			}
			System.out.println();
			System.out.println("File copied successfully...");
		} catch (FileNotFoundException e) {
			System.out.println("File not found : " + e);
		} finally {
			try {
				if (fis != null)
					fis.close();
				else if (fos != null)
					fos.close();
			} catch (IOException e) {
				System.out.println("Streams could not be closed : " + e);
			}

		}
	}
}
