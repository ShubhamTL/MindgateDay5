package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
private PrintWriter out;
private String loginId;
private String password;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	out = response.getWriter();
	loginId = request.getParameter("textLoginId");
	password = request.getParameter("textPassword");
	if(loginId.equals("Admin")&& password.equals("12345")) {
		response.sendRedirect("success.html");
	}
	else {
		response.sendRedirect("failuer.html");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		out = response.getWriter();
		loginId = request.getParameter("textLoginId");
		password = request.getParameter("textPassword");
		if(loginId.equals("Admin")&& password.equals("12345")) {
			response.sendRedirect("success.html");
		}
		else {
			response.sendRedirect("failuer.html");
		}
	}

}
