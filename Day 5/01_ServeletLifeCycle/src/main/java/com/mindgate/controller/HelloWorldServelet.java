package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServelet")
public class HelloWorldServelet extends HttpServlet {
       
    public HelloWorldServelet() {
        super();
        System.out.println("HelloWorldServelet object create");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() method called");
	}

	public void destroy() {
		System.out.println("destroy() method called");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() method called");
	}

}
