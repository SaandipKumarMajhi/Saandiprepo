package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter writer= res.getWriter();
		
		Date d=new Date();
		
		writer.println("<h1 style ='color:red;text-align:center'>Date And Time Is :::"+d+"</h1>");
		writer.println("<h2 style='color:blue;text-align:center'>Welcome to Servlets</h2>");
		writer.close();
		
	}
	
	

}
