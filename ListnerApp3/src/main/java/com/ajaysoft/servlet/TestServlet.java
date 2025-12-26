package com.ajaysoft.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("<h1> testServlet with servletcontextListners </h1>");
		ServletContext context = getServletContext();
		context.setAttribute("A", "AAA");
		context.setAttribute("B", "BBB");
		context.setAttribute("C", "CCC");
		context.setAttribute("B", "XXX");
		context.removeAttribute("c");
	}


}
