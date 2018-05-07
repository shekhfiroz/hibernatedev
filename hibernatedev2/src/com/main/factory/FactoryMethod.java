package com.main.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FactoryMethod {
	static String driver_name = null;
	static String url = null;
	static String user_name = null;
	static String password = null;

	/* creation getconnection method with Connection type and we made it static */
	public static Connection getConnection() throws Exception {
		Properties props = new Properties();
		props.load(FactoryMethod.class.getClassLoader().getResourceAsStream("com.main.cfg/db.properties"));
		driver_name = props.getProperty("driver_name");
		url = props.getProperty("url");
		user_name = props.getProperty("user_name");
		password = props.getProperty("password");

		Class.forName(driver_name);
		Connection con = DriverManager.getConnection(url, user_name, password);

		return con;

	}
}
