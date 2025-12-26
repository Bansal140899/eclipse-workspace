package com.ajaysoft.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String squal = request.getParameter("sqaul");
		String saddr = request.getParameter("saddr");
		
		Cookie c3 = new Cookie("squal" ,squal);
        Cookie c4 = new Cookie("saddr" ,saddr);
        
        response.addCookie(c3);
        response.addCookie(c4);
        
        RequestDispatcher rd = request.getRequestDispatcher("form3.html");
        rd.forward(request, response);
		
	}

}
