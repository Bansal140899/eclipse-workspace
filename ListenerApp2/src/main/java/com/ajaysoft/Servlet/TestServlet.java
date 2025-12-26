package com.ajaysoft.Servlet;

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
	    4
		
		
		
		
		
		
		response.getWriter().println("<h1>TestSrvlet with attribute life cycle</h1>");
		request.setAttribute("A", "AAA");
		request.setAttribute("B", "BBB");
		request.setAttribute("C", "CCC");
		request.setAttribute("B", "XXX");
		
		request.removeAttribute("c");
	}

}
