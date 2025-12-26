package com.ajaysoft.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String accType =  request.getParameter("accType");
		String accBranch = request.getParameter("accBranch")
;
		
		HttpSession httpSession =  request.getSession();

		httpSession.setAttribute("accType", accType);
		httpSession.setAttribute("accBranch", accBranch);
		
		

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Ajay Banking Service</title>");
		out.println("<script src='https://cdn.tailwindcss.com'></script>");
		out.println("<style>");
		out.println("@keyframes fadeInUp { from {opacity:0; transform:translateY(30px);} to {opacity:1; transform:translateY(0);} }");
		out.println(".animate { animation: fadeInUp 0.8s ease-out; }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body class='min-h-screen flex items-center justify-center bg-gradient-to-br from-indigo-500 via-purple-600 to-pink-500 p-4'>");

		out.println("<div class='bg-white/20 backdrop-blur-lg rounded-2xl shadow-2xl p-8 w-full max-w-md text-white animate'>");
		out.println("<h2 class='text-3xl font-bold text-center mb-3 text-yellow-300'>Ajay Banking Service</h2>");
		out.println("<h3 class='text-xl font-semibold text-center mb-6 text-blue-200'>Deposit Form</h3>");

		out.println("<form method='post' action='" + response.encodeURL("./deposit") + "' class='space-y-4'>");
		out.println("<div>");
		out.println("<label class='block text-sm mb-1 font-semibold text-white'>Account Type</label>");
		out.println("<input type='text' name='depAmt' placeholder='Enter Deposit Amout' class='w-full p-2 rounded-lg border border-white/30 bg-white/10 text-white focus:outline-none focus:ring-2 focus:ring-yellow-300'/>");
		out.println("</div>");

		out.println("<div>");
		out.println("<label class='block text-sm mb-1 font-semibold text-white'>Account Branch</label>");
		out.println("<input type='text' name='depNamet' placeholder='Enter deppostier Name' class='w-full p-2 rounded-lg border border-white/30 bg-white/10 text-white focus:outline-none focus:ring-2 focus:ring-yellow-300'/>");
		out.println("</div>");

		out.println("<div class='text-center mt-6'>");
		out.println("<input type='submit' value='Next' class='px-6 py-2 bg-yellow-400 hover:bg-yellow-500 text-gray-900 font-bold rounded-lg shadow-lg transition-all cursor-pointer'/>");
		out.println("</div>");
		out.println("</form>");

		out.println("</div>");

		out.println("<script>");
		out.println("document.body.style.opacity = 0;");
		out.println("window.onload = () => { document.body.style.transition = 'opacity 0.6s'; document.body.style.opacity = 1; };");
		out.println("</script>");

		out.println("</body>");
		out.println("</html>");

		
		
		
		
		
	}

}
