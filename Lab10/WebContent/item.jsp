<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.bawmvc.models.Item" %>
    <%@ page import = "java.sql.*" %>
    <%
    	Item item = new Item();
    	String itemGrid = "";
    	String rudFeedback = "";
    	
    	if(request.getParameter("hidMode") != null && request.getParameter("hidMode").equalsIgnoreCase("save")){
    		rudFeedback = item.saveAnItem(request.getParameter("txtItemName"), request.getParameter("txtItemDesc"));
    	}
    	itemGrid = item.getItems();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src=Controller/jQuery.js></script>
<script type="text/javascript" src=Controller/controllerMain.js></script>
</head>
<body>
	<form id = "formItems" action = "item.jsp" method = "post">
		<input id = "hidMode" name = "hidMode" type = "hidden" value = "save">
		<input id = "hidID" name = "hidID" type = "hidden" value = "0">
		Item Name: <input id = "txtItemName" name = "txtItemName" type = "text"> <br/>
		Item Description <input id = "txtItemDesc" name = "txtItemDesc" type = "text"> <br/>
		<input id = "btnSave" name = "btnSave" type = "button" value = "Save"> <br/>
		<div id = "divStsMsgItem">
			<% out.println(rudFeedback); %>
		</div>
		<% out.println(itemGrid); %>
	</form><br/>
</body>
</html>