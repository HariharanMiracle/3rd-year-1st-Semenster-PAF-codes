package com.bawmvc.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
	public String login(String userN, String passW) {
		Connection con = null;
		Statement statement = null;
		ResultSet resultset;
		
		String userNameDB = "";
		String passwordDB = "";
		
		try {
			con = DBConnection.createConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery("select un, pw from user");
			while(resultset.next()) {
				userNameDB = resultset.getString("un");
				passwordDB = resultset.getString("pw");
				
				if(userN.equals(userNameDB) && passW.equals(passwordDB)) {
					return "SUCCESS";
				}
			}
		}
		catch (Exception e) {
			System.out.println("Error in User.java line 30");
			e.printStackTrace();
		}
		
		return "Invalid user credentials";
	}
}
