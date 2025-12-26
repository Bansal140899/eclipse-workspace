package com.ajay.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			
			int eno = Integer.parseInt(request.getParameter("eno"));
			String ename = request.getParameter("ename");
			
			float esal = Float.parseFloat(request.getParameter("esal"));
			String eaddr = request.getParameter("eaddr");
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red; ' align='center'>Ajay software solution </h2>");
			out.println("<h3 style= 'color:blue;' align='center'>User registration details </h3>");
			out.println("<table border='1' align='center'>");
			
			out.println("<tr><td>Employee Number</td><td>"+eno+"</td></tr>");
			out.println("<tr><td>Employee Nname</td><td>"+ename+"</td></tr>");
			out.println("<tr><td>Employee salarry</td><td>"+esal+"</td></tr>");
			out.println("<tr><td>Employee address</td><td>"+eaddr+"</td></tr>");
			
			out.println("</table>");
			
			out.println("<h3 align='center'>");
			out.println("<a href= './index.html'>|Regestration form |</a>");
			out.println("</h3></body></html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
