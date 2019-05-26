package com.bawmvc.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost/pafLab";
		String username = "root";
		String password = "";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (Exception e) {
				System.out.println("Error in DBConnection.java: line 18");
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Printing connection object " +con);
		}
		catch(Exception e) {
			System.out.println("Error in DBConnection.java: line 25");
			e.printStackTrace();
		}
		return con;
	}
}
