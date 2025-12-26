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
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		
		Cookie c1 = new Cookie("sid" ,sid);
        Cookie c2 = new Cookie("sname" ,sname);
        
        response.addCookie(c1);
        response.addCookie(c2);
        
        RequestDispatcher rd = request.getRequestDispatcher("form2.html");
        rd.forward(request, response);
		
		
		
		
		
		
	}

}
