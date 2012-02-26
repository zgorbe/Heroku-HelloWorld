package com.epam.heroku;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class HelloWorld extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		LOGGER.info("GET for /hello");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/hello.jsp");
		rd.forward(request, response);
	}
}
