package com.demo.app;

import com.demo.app.dao.EmpDao;
import com.demo.app.dao.EmpDaoImpl;
import com.demo.app.service.EmpService;

public class EmpApp {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		EmpService es = new EmpService(dao);
		System.out.println(es.register(80, "Suchit"));
	}
}
