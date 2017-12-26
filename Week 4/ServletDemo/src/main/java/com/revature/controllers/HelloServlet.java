package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Account;

public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String fcolor = this.getInitParameter("favColor");
		
		//System.out.println(fname + " " + lname);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<p>Your name is: ");
		out.println(fname + " " + lname + "</p>");
		out.println("</br><p>Your favorite color: " + fcolor + "</p>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Enumeration<String> headers = request.getHeaderNames();
		//while (headers.hasMoreElements()) {
		//	String header = headers.nextElement();
		//	System.out.println(header + " " + request.getHeader(header));
		//}
		
		String json = request.getReader().lines().reduce((acc,line) -> {
			return acc += line + "\n";
		}).get();
		
		ObjectMapper mapper = new ObjectMapper();
		Account acc = mapper.readValue(json, Account.class);
		System.out.println(acc);
	}

}
