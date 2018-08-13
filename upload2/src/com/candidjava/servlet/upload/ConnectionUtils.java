package com.candidjava.servlet.upload;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	/*public static void main(String[] args) {
		getmyConnection();
	}*/
	static Connection getmyConnection() {

		// Class.forName("");
		// DriverManager.getConnection(arg0, arg1, arg2)();

		Connection con = null;
		String driverName = "org.h2.Driver";
		String urlstring = "jdbc:h2:tcp://localhost/~/test";
		String username = "sa";
		String password = "mahi";
		try {
			Class.forName(driverName);
			try {
				con = DriverManager.getConnection(urlstring, username, password);
			} catch (SQLException ex) {
				// log an exception. fro example:
				System.out.println("Failed to create the database connection.");
			}
		} catch (ClassNotFoundException ex) {
			// log an exception. for example:
			System.out.println("Driver not found.");
		}
		return con;
	}
}
