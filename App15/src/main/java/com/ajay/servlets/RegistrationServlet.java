package com.ajay.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.ajay.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			
			
			String uname = request.getParameter("uname");
			
			String upwd = request.getParameter("upwd");
			String uemail = request.getParameter("uemail");
			String umobile = request.getParameter("umobile");
			
			UserService us = new UserService();
			
			String status = us.registration(uname, upwd, uemail, umobile);
			out.println("<html>");
			out.println("<body bgcolor='lightblue'>");
			out.println("<center><br><br>");
			out.println("<font color ='red' size='7'>");
			if(status.equals("success")) {
				out.println("Regestration Success");
			}
			if(status.equals("failure")) {
				out.println("Registration FAILURE");
				
			}
			if(status.equals("existed")) {
				out.println("user existed already");
			}
			
			
			
			out.println("</center></font></body></html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
