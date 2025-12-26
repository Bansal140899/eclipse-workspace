package com.ajay.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class regservlet
 */
@WebServlet("/reg")
public class regservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String [] qual = request.getParameterValues("squal");
		String squal = "";
		for(String val : qual)
		{
			squal = squal + val +"<br>";
		}
		
		String sgender = request.getParameter("sgender");
		String [] course = request.getParameterValues("stech");
		String stech = "";
		for(String val : course) {
			stech = stech + val +"<br>";
		}
		
		String branch = request.getParameter("branch");
		String saddr = request.getParameter("saddr");
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red'; align='center'>AJay software Solution</h2>");
		out.println("<h3 style='color:blue'; align='center'>Student class regextration details</h3>");
		out.println("<table border ='1' align = 'center'>");
		out.println("<tr><th>student sid</th><td>"+sid+"</td></tr>");
		out.println("<tr><th>student sname</th><td>"+sname+"</td></tr>");
		out.println("<tr><th>student sgender</th><td>"+sgender+"</td></tr>");
		out.println("<tr><th>student qual</th><td>"+qual+"</td></tr>");
		out.println("<tr><th>student course</th><td>"+stech+"</td></tr>");
		out.println("<tr><th>student branch</th><td>"+branch+"</td></tr>");
		out.println("<tr><th>student saddr</th><td>"+saddr+"</td></tr>");
		
		out.println("</table>");
		out.println("<h3 align='center'>");
		out.println("<a href = './registartion.html'>|Course Registartion page |</a>");
		out.println("</h2></body></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
