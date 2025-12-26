package com.ajaysoft.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		
		PrintWriter out =  response.getWriter();
		
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'>AJAY SOFT solution</h2>");
		out.println("<h3 style='color:blue' align='center'> Customer Registartion fprm[cont....]</h3>");
		out.println("<form method='post' action='second'>");
		out.println("<pre>");
		out.println("custeomer addressss    : <input type='text' name='caddr'/>");
		out.println("custeomer typeeeeee    : <input type='text' name='ctype'/>");
		
		out.println("<input type='submit' value='Next'/>");
		out.println("<input type='hidden' name='cid' value='"+cid+"'/>");
		out.println("<input type='hidden' name='cname' value='"+cname+"'/>");
		out.println("</form></body></html>");
		
		
		
		
		
		
		
		
		
	}

}
