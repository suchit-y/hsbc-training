package com.demo.classes.empApp;

import com.demo.impl.employee.*;
import com.demo.interfaces.emp.EmpDao;

public class MyEmpFactory {
	public static EmpDao getConnection(String pickDB) {
		if (pickDB == "jdbc")
			return new EmpDaoMockJdbcImpl();
		else if (pickDB == "hibernate")
			return new EmpDaoMockHibernateImpl();
		else
			return null;
	}
}
