package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class FrontController extends HttpServlet {
  protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    String requestUrl = request.getRequestURI().substring(request.getContextPath().length());

    //route to controller
    if(requestUrl.startsWith("/users")) {
      response.sendRedirect("HelloServlet");
    }

    response.getWriter().append(requestUrl);
  }
}