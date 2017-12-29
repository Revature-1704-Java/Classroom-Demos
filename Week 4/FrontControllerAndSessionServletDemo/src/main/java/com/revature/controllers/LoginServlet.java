package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    HttpSession session = request.getSession();
    String username = request.getParameter("user");
    String password = request.getParameter("pass");

    if (username.equals("admin") && password.equals("admin")) {
      session.setAttribute("user", username);
      response.sendRedirect("WelcomeServlet");
    } else {
      response.sendRedirect("other.html");
    }
  }
}