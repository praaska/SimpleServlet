package org.haritha.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("XML Servlet called!!");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String username=request.getParameter("userName");
	out.println("Hello from GET "+username);
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet called!!");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("userName");
		String fullname=request.getParameter("fullName");
		out.println("Hello from Post "+username +"We know your full name is "+fullname);
		String prof=request.getParameter("prof");
		out.println("You are a "+prof);
		//String location=request.getParameter("location");
		String[] location=request.getParameterValues("location");
		
		out.println("your are at "+location.length+" places");
		for(int i=0;i<location.length;i++){
			out.println(location[i]);
		}
		
		
		}


}
