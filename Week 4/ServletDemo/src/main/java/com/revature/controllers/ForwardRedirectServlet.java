package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardRedirectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Forward
		//RequestDispatcher rd = request.getRequestDispatcher("other.html");
		//rd.forward(request, response);
		/*Forward
		 * URL does not change
		 * Switch is done server side
		 * Keeps original request/response
		 */
		
		//Redirect
		/*
		 * URL does change
		 * Switch is done client side
		 * Client reloads as new URL with fresh request/response
		 * New request is sent from client
		 */
		response.sendRedirect("other.html");
	}
}
