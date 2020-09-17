package com.demo.interfaces.app;

import com.demo.impl.oracle.OracleDB;
import com.demo.interfaces.demo1.MyConnection;

public class MyApp {

	public static void main(String[] args) {
		MyConnection con = MyFactory.getConnection("mysql");
		
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDBDetails());
	}

}
