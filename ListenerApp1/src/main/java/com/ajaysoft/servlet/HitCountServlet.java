package com.ajaysoft.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/hitcount")
public class HitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		int count = (Integer)context.getAttribute("count");
		response.getWriter().println("<center><h1>HitCount  : "+count+"</h1></center>");
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
