package com.demo.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.demo.entity.Emp;

public class SetDemo {
	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList();

		empList.add(new Emp(80, "Suchit", "Pune", 25000));
		empList.add(new Emp(81, "Shantanu", "Pune", 25000));
		empList.add(new Emp(82, "Anmol", "Pune", 25000));
		empList.add(new Emp(83, "Ramani", "Hyderabad", 25000));
		empList.add(new Emp(84, "Satvik", "Pune", 25000));
		empList.add(new Emp(85, "Raghu", "Hyderabad", 25000));

		System.out.println(empList);

		// remove id:83
		Emp e = new Emp(83, "Ramani", "Hyderabad", 25000);

		/*
		 * for(Emp e : empList) replacement for iterator
		 */

		//System.out.println(empList.contains(e));

		Iterator<Emp> itr = empList.iterator();

		while (itr.hasNext()) {
			Emp e1 = itr.next();
			if (e1.getEmpId() == e.getEmpId()) {
				itr.remove();
				System.out.println(e1);
			}
		}
		System.out.println(empList);
	}
}
