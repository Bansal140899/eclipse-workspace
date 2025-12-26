package com.drugasoft.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class testServlet
 */
@WebServlet("/test")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("<h1>testServlet with httpsession attributes</h1>");
		HttpSession hs = request.getSession();
		hs.setAttribute("a", "aaa");
		hs.setAttribute("b", "bbb");
		hs.setAttribute("c", "ccc");
		hs.setAttribute("b", "xxx");
		hs.removeAttribute("c");
		hs.invalidate(); 		
	}

}
