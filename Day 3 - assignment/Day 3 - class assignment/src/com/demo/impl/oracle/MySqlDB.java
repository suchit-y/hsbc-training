package com.demo.impl.oracle;

import com.demo.interfaces.demo1.MyConnection;

public class MySqlDB implements MyConnection {
	@Override
	public String getConnectionInfo() {
		return "Connection successful.";
	}
	public String getDBDetails() {
		return "MySqlDB 8.0";
	}
}
