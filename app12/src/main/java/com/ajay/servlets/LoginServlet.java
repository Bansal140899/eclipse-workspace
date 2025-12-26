package com.ajay.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		
		out.println("<html>");
		out.println("<body  bgcolor = 'lightblue'>");
		out.println("<h2 style = 'color:red' align = center>");
		if(uname.equals("druga") && upwd.equals("druga")) {
			out.println("user login success");
		}else {
			out.println("user login failure");
		}
	
		out.println("</h2>");
		
		out.println("<br><br>");
		out.println("<h3 style = 'align='center'>");
		out.println("<a href='./LOGINfrom.html'>|login page |</a>");
		out.println("<//body></html>");
	
	}

}
