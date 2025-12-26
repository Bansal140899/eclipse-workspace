package com.ajaysoft.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		HttpSession hs = request.getSession();
		
		hs.setAttribute("uname", uname);
		hs.setAttribute("upwd", upwd);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("form2.html");
		rd.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
