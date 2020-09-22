package com.demo.app;

import com.demo.io.data.ReadFromKeyboard;
import com.demo.app.dao.EmpDao;
import com.demo.app.dao.EmpDaoImpl;
import com.demo.app.service.EmpService;

public class EmpApp {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		EmpService es = new EmpService(dao);
		System.out.println(es.register(80, "Suchit", "Chennai", 10000));
		System.out.println(es.register(81, "Shantanu", "Hyderabad", 20000));
		System.out.println(es.register(82, "Damodar", "Hyderabad", 25000));
		System.out.println(es.register(83, "Snehita", "Chennai", 15000));
	}
}
