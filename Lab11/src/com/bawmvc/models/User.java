package com.bawmvc.models;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class User {
	public String login(String userN, String passW, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
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
					//response.sendRedirect("http://localhost:8081/Lab11/item.jsp");
					return "SUCCESS";
				}
			}
		}
		catch (Exception e) {
			System.out.println("Error in User.java line 30");
			e.printStackTrace();
			System.out.println("UN: " + userN + "PW: " + passW);
		}
		
		return "Invalid user credentials";
	}
}
