package com.RiWA.DCBus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Item
 */
@WebServlet("/Item")
public class Item extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Item() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		com.bawmvc.models.Item item  = new com.bawmvc.models.Item();
		response.getWriter().append(item.getItems());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		com.bawmvc.models.Item item  = new com.bawmvc.models.Item();
		response.getWriter().append(
		item.saveAnItem(request.getParameter("txtItemName"), request.getParameter("txtItemDesc")));
	}
	
	//UPDATE
/*	protected void doPut(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
	Map paras = getParasMap(request);
	Item item = new Item();
	response.getWriter().append(item.updateItem(paras.get("hidItemID").toString
	(), paras.get("txtItemName").toString(),paras.get("txtItemDesc").toString()));
	}
	//DELETE
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
	Map paras = getParasMap(request);
	Item item = new Item();
	response.getWriter().append(item.deleteItem(paras.get("itemID").toString()));
	}

	private static Map getParasMap(HttpServletRequest request)
	{
	Map<String, String> map = new HashMap<String, String>();
	try
	{
	Scanner scanner = new Scanner(request.getInputStream(), "UTF-8");
	String queryString = scanner.hasNext() ?
	scanner.useDelimiter("\\A").next() : "";
	scanner.close();
	String[] params = queryString.split("&");
	for (String param : params)
	{
	String [] p=param.split("=");
	map.put(p[0], p[1]);
	}
	}
	catch(Exception e) {}
	return map;
	}*/
}
