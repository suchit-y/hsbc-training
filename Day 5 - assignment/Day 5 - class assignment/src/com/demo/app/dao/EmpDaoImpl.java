package com.demo.app.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.demo.entity.Emp;
import com.demo.exception.EmployeeExistsException;

public class EmpDaoImpl implements EmpDao {

	@Override
	public String save(Emp emp) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String message = "";
		boolean employeeExists = false;
		try {
			fr = new FileReader("EmplyeeDetails.csv");
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.contains("" + emp.getEmpId())) {
					throw new EmployeeExistsException();
				}
			}
			if (employeeExists == false) {
				fw = new FileWriter("EmplyeeDetails.csv", true);
				bw = new BufferedWriter(fw);

				bw.write(emp.getEmpId() + "," + emp.getEmpName() + "," + emp.getCity() + "," + emp.getSalary());
				bw.newLine();
				message = "Employee saved...";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				System.out.println("Streams could not be closed : " + e);
			}

		}

		return message + " " + emp;
	}

}
