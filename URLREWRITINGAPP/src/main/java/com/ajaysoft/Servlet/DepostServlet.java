package com.ajaysoft.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.ajaysoft.service.TransctionService;

/**
 * Servlet implementation class DepostServlet
 */
@WebServlet("/deposit")
public class DepostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			int depAmt =  Integer.parseInt(request.getParameter("depAmt"));
			String depName = request.getParameter("depName");
			
			HttpSession httpSession =  request.getSession(false);
			String accNo = (String)httpSession.getAttribute("accNo");
			String accName = (String)httpSession.getAttribute("accName");
			String accType = (String)httpSession.getAttribute("accType");
			String accBranch = (String)httpSession.getAttribute("accBranch")
;
			
			TransctionService txService = new TransctionService();
			int totalAmt  = txService.deposit(accNo, depAmt);
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red; align='center'>AJAY Banking Service </h2>");
			out.println("<h3 style = 'color:blue;' align='center'>Transction Details</h3>");
			out.println("<table border='1' align='center'>");
			out.println("<tr><td>Account Number</td><td>"+accNo+"</td></tr>");
			out.println("<tr><td>Account Name</td><td>"+accName+"</td></tr>");
			out.println("<tr><td>Account Type</td><td>"+accType+"</td></tr>");
			out.println("<tr><td>Account Branch</td><td>"+accBranch+"</td></tr>");
			out.println("<tr><td>Tranction Type</td><td>Deposit</td></tr>");
			out.println("<tr><td>Deposit Amout</td><td>"+depAmt+"</td></tr>");
			out.println("<tr><td>total Balnce</td><td>"+totalAmt+"</td></tr>");
			out.println("<tr><td>Account NUmber</td><td>SUCCESS</td></tr>");
			out.println("</table></body></html>");
			

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
