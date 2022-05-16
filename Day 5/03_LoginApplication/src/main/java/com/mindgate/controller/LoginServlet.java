package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private PrintWriter out;
	private String loginId;
	private String password;
	private String loginId1="shubham.labde@mindgate.in";
	private String password1 = "123456";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		out= response.getWriter();
//		loginId = request.getParameter("textLoginId");
//		password = request.getParameter("textPassword");
//		if(loginId.equals(loginId1) && password.equals(password1)) {
//			out.println("Login Successfully");
//		}
//		else
//			out.println(" wrong Password or Login Id");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out= response.getWriter();
		loginId = request.getParameter("textLoginId");
		password = request.getParameter("textPassword");
		if(loginId.equals(loginId1) && password.equals(password1)) {
			out.println("Login Successfully");
		}
		else
			out.println(" wrong Password or Login Id");
	}

}
