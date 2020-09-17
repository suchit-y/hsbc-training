package com.demo.impl.oracle;

import com.demo.interfaces.demo1.MyConnection;

public class OracleDB implements MyConnection {
	@Override
	public String getConnectionInfo() {
		return "Connection successful.";
	}
	public String getDBDetails() {
		return "Oracle 7.0";
	}
}
