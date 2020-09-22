package com.demo.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.demo.entity.Emp;

public class ReadWriteEmpData {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("f:\\fileDemo\\emp.txt");
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				String[] cols = line.split(",");
				int id = Integer.parseInt(cols[0]);
				double salary = Double.parseDouble(cols[3]);
				Emp e = new Emp(id, cols[1], cols[2], salary);
				System.out.println(e.toString());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
