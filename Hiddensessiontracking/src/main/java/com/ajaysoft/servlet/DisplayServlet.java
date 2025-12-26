package com.ajaysoft.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		
		response.setContentType("text/html");
		
		
		PrintWriter out =  response.getWriter();
		
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		
		String Caddr = request.getParameter("caddr");
		String ctype=request.getParameter("ctype");
		String cemail =  request.getParameter("cemail");
		String cmobile= request.getParameter("cmobile");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'>AJAY SOFT solution</h2>");
		out.println("<h3 style='color:blue' align='center'> Customer Registartion Deatail</h3>");
	    out.println("<pre align='center'>");
	    out.println("Customer id  :"+cid);
	    out.println("Customer name  :"+cname);
	    out.println("Customer caddr  :"+Caddr);
	    out.println("Customer type  :"+ctype);
	    out.println("Customer email  :"+cemail);
	    out.println("Customer mobile  :"+cmobile);
	    out.println("</pre>");
	    out.println("</body></html>");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
