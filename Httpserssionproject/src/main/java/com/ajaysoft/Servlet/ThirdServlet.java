package com.ajaysoft.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String email = request.getParameter("uemail");
		String mobile= request.getParameter("umobile");
		
		HttpSession hs = request.getSession();
		
		
		hs.setAttribute("uemail" ,email);
		hs.setAttribute("umobile", mobile);
		
		
		String uname = (String)hs.getAttribute("uname");
		String upwd = (String)hs.getAttribute("upwd");
		String uprof = (String)hs.getAttribute("prof");
		String uaddr = (String)hs.getAttribute("uaddr");
		String emil = (String)hs.getAttribute("uemail");
		String umobile = (String)hs.getAttribute("umobile");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>User Details</title>");
		out.println("<style>");
		out.println("body { font-family: 'Poppins', sans-serif; background: linear-gradient(135deg, #74ABE2, #5563DE); color: white; text-align: center; padding: 50px; }");
		out.println(".card { background: rgba(255,255,255,0.1); padding: 30px; border-radius: 20px; display: inline-block; box-shadow: 0 8px 20px rgba(0,0,0,0.2); animation: fadeIn 1s ease-in-out; }");
		out.println("h2 { margin-bottom: 20px; }");
		out.println("p { font-size: 18px; margin: 10px 0; animation: slideUp 0.8s ease forwards; }");
		out.println("@keyframes fadeIn { from {opacity: 0;} to {opacity: 1;} }");
		out.println("@keyframes slideUp { from {transform: translateY(30px); opacity: 0;} to {transform: translateY(0); opacity: 1;} }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='card'>");
		out.println("<h2>🎉 User Information Summary 🎉</h2>");
		out.println("<p><strong>Name:</strong> " + uname + "</p>");
		out.println("<p><strong>Password:</strong> " + upwd + "</p>");
		out.println("<p><strong>Profession:</strong> " + uprof + "</p>");
		out.println("<p><strong>Address:</strong> " + uaddr + "</p>");
		out.println("<p><strong>Email:</strong> " + emil + "</p>");
		out.println("<p><strong>Mobile:</strong> " + umobile + "</p>");
		out.println("<br><a href='index.html' style='color:white; background:#222; padding:10px 20px; border-radius:10px; text-decoration:none; transition:0.3s;'>Go Back</a>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}	
		
		
		
		
	

}
