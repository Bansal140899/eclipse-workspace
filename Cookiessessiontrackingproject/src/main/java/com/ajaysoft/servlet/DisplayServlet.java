package com.ajaysoft.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
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
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		String semail = request.getParameter("semail");
		String smobile = request.getParameter("smobile");
		
		Cookie c5 = new Cookie("semail" ,semail);
        Cookie c6 = new Cookie("smobile" ,smobile);
        
        response.addCookie(c5);
        response.addCookie(c6);
        
        
        Cookie[] c = request.getCookies();
        
        
        
        String sid = c[0].getValue();
        String sname = c[1].getValue();
        String squal = c[2].getValue();
        String saddr = c[3].getValue();
        String email = c[4].getValue();
        String mobile = c[5].getValue();
        
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Student Details</title>");
        out.println("<script src='https://cdn.tailwindcss.com'></script>");
        out.println("<style>");
        out.println("@keyframes fadeInUp { from {opacity: 0; transform: translateY(20px);} to {opacity: 1; transform: translateY(0);} }");
        out.println(".animate { animation: fadeInUp 0.8s ease-out; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body class='min-h-screen flex items-center justify-center bg-gradient-to-br from-indigo-500 via-purple-500 to-pink-500 p-4'>");

        out.println("<div class='bg-white/20 backdrop-blur-md rounded-2xl shadow-2xl p-8 w-full max-w-md text-white animate'>");
        out.println("<h1 class='text-3xl font-bold mb-6 text-center'>🎓 Student Information</h1>");
        
        out.println("<div class='space-y-3 text-lg'>");
        out.println("<p><span class='font-semibold text-yellow-300'>Student ID:</span> " + sid + "</p>");
        out.println("<p><span class='font-semibold text-yellow-300'>Name:</span> " + sname + "</p>");
        out.println("<p><span class='font-semibold text-yellow-300'>Qualification:</span> " + squal + "</p>");
        out.println("<p><span class='font-semibold text-yellow-300'>Address:</span> " + saddr + "</p>");
        out.println("<p><span class='font-semibold text-yellow-300'>Email:</span> " + email + "</p>");
        out.println("<p><span class='font-semibold text-yellow-300'>Mobile:</span> " + mobile + "</p>");
        out.println("</div>");
        
        out.println("<div class='text-center mt-6'>");
        out.println("<a href='index.html' class='px-6 py-2 bg-indigo-600 hover:bg-indigo-800 transition-all rounded-lg shadow-lg'>Go Back</a>");
        out.println("</div>");
        
        out.println("</div>");

        // Subtle fade effect JS (optional)
        out.println("<script>");
        out.println("document.body.style.opacity = 0;");
        out.println("window.onload = () => { document.body.style.transition = 'opacity 0.6s'; document.body.style.opacity = 1; };");
        out.println("</script>");

        out.println("</body>");
        out.println("</html>");
        
        
        
        
        
        
		
	}

}
