package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
  protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    HttpSession session = request.getSession(false);
    
    String username = (String) session.getAttribute("user");
    if (username == null) {
      response.sendRedirect("index.html");
    }
    response.getWriter().append(username);
  }
}