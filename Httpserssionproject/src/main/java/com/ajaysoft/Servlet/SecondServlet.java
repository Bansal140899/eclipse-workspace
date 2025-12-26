package com.ajaysoft.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uprof = request.getParameter("uprof");
		String uaddr = request.getParameter("uaddr");
		HttpSession hs = request.getSession();
		
		hs.setAttribute("uprof", uprof);
		hs.setAttribute("uaddr", uaddr);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
		
	}

}
