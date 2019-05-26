<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.bawmvc.models.Item" %>
    <%@ page import = "java.sql.*" %>
    <%
	    Item item = new Item();
	    String itemsGrid = item.getItems();
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
		<input type="button" id="btnSave" name="btnSave" value="Save">
		<input type="button" id="btnRefresh" name="btnRefresh" value="Refresh">
		<input type="button" id="btnLogout" name="btnLogout" value="Logout">
		<div id="divStsMsgItem"></div>
		<div id="divItemsTable"><% out.println(itemsGrid); %></div>
	</form><br/>
</body>
</html>