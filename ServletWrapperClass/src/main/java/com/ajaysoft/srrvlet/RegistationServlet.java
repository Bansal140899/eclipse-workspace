package com.ajaysoft.srrvlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistationServlet
 */
@WebServlet("/reg")
public class RegistationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String uemail = request.getParameter("uname");
		String uaddr = request.getParameter("uaddr");
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("body {");
		out.println("  background-color: #f0f8ff;");
		out.println("  animation: fadeInBody 1.5s ease-in;");
		out.println("}");
		out.println("@keyframes fadeInBody {");
		out.println("  from {opacity: 0;}");
		out.println("  to {opacity: 1;}");
		out.println("}");
		out.println("table {");
		out.println("  border-collapse: collapse;");
		out.println("  animation: slideIn 1.2s ease-in-out;");
		out.println("  box-shadow: 0px 0px 20px rgba(0,0,0,0.3);");
		out.println("  transform: scale(0.95);");
		out.println("}");
		out.println("@keyframes slideIn {");
		out.println("  0% {transform: translateY(-30px); opacity: 0;}");
		out.println("  100% {transform: translateY(0); opacity: 1;}");
		out.println("}");
		out.println("h2, h3 {");
		out.println("  animation: zoomIn 1s ease-in;");
		out.println("}");
		out.println("@keyframes zoomIn {");
		out.println("  0% {transform: scale(0.5); opacity: 0;}");
		out.println("  100% {transform: scale(1); opacity: 1;}");
		out.println("}");
		out.println("td {");
		out.println("  padding: 10px 20px;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'>Ajay Software Service</h2>");
		out.println("<h3 style='color:blue;' align='center'>User Registration Details</h3>");
		out.println("<table border='1' align='center'>");
		out.println("<tr><td>User Name</td><td>" + uname + "</td></tr>");
		out.println("<tr><td>User Email</td><td>" + uemail + "</td></tr>");
		out.println("<tr><td>User Address</td><td>" + uaddr + "</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

		
		
		
		
		
		
	}

}
