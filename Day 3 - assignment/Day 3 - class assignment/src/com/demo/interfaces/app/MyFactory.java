package com.demo.interfaces.app;

import com.demo.impl.oracle.MySqlDB;
import com.demo.impl.oracle.OracleDB;
import com.demo.interfaces.demo1.MyConnection;

public class MyFactory {
	public static MyConnection getConnection(String pickDB) {
		if (pickDB == "oracle")
			return new OracleDB();
		else if (pickDB == "mysql")
			return new MySqlDB();
		else
			return null;
	}
}
