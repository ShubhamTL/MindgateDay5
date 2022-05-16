package com.mindgate.collector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServelet")
public class AcceptDetailsServelet extends HttpServlet {
	private PrintWriter printWriter;
	private double number1;
    private  double number2;
    private double result;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter = response.getWriter();
		number1 = Double.valueOf(request.getParameter("textNumber1"));
		number2 =Double.parseDouble(request.getParameter("textNumber2"));
		
		result= number1+ number2;
		
		printWriter.println("Addition of "+ number1 + " and "+ number2 + " = " + result);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter = response.getWriter();
		number1 = Double.valueOf(request.getParameter("textNumber1"));
		number2 =Double.parseDouble(request.getParameter("textNumber2"));
		
		result= number1+ number2;
		
		printWriter.println("Addition of "+ number1 + " and "+ number2 + " = " + result);
	}

}
