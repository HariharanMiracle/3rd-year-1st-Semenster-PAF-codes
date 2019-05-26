<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "javax.sql.*" %>
    <%@ page import = "com.bawmvc.models.User" %>
	<%/*
		User user = new User();
		String loginMsg = "Please login to continue";
		
		if(request.getMethod().equalsIgnoreCase("post")){
			if(user.login(request.getParameter("txtUserName"), request.getParameter("txtPassword")).equals("SUCCESS")){
				request.getRequestDispatcher("/item.jsp").forward(request, response);
			}
			else{
				loginMsg = "Invalid credentials";
			}
		}*/
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript" src=Controller/jQuery.js></script>
<script type="text/javascript" src=Controller/controllerMain.js></script>
</head>
<body>
	<form id = "formLogin" action = "index.jsp" method = "post">
		UserName <input id = "txtUserName" name = "txtUserName" type = "text"> <br/>
		Password <input id = "txtPassword" name = "txtPassword" type = "password"> <br/>
		<input id = "btnLogin" name = "btnLogin" type = "button" value = "Login"> <br/>
		<div id = "divStsMsgLogin">
			<%// out.println(loginMsg); %>
		</div>
	</form>
</body>
</html>