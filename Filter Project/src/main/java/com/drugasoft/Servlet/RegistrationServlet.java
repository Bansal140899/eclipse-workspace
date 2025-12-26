package com.drugasoft.Servlet;

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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			String uname = request.getParameter("uname");
			String upwd = request.getParameter("upwd");
			int uage  = Integer.parseInt(request.getParameter("uage"));
			String uemail = request.getParameter("uemail");
			String umobile = request.getParameter("umobile");
			
//			out.println("<html>");
//			out.println("<body>");
//			out.println("<h2 style= 'color:red;' align='center'>Ajay SoftwRE solution</h3>"); 
//			
//			out.println("<h3 style= 'color:blue;' align='center'>User registration details</h3>"); 
//			
//			out.println("<table = align='center'>");
//			out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
//			out.println("<tr><td>password</td><td>"+upwd+"</td></tr>");
//			out.println("<tr><td>User age</td><td>"+uage+"</td></tr>");
//			out.println("<tr><td>User email</td><td>"+uemail+"</td></tr>");
//			out.println("<tr><td>User mobile</td><td>"+umobile+"</td></tr>");
//			
//			out.println("</table></body></html>");
			
			out.println("<html>");
			out.println("<head>");
			out.println("<style>");
			out.println("body {"
			        + "font-family: 'Poppins', sans-serif;"
			        + "background: linear-gradient(135deg, #667eea, #764ba2);"
			        + "color: #fff;"
			        + "height: 100vh;"
			        + "margin: 0;"
			        + "display: flex;"
			        + "justify-content: center;"
			        + "align-items: center;"
			        + "animation: fadeInBg 2s ease-in;"
			        + "}");

			out.println("@keyframes fadeInBg {"
			        + "from {opacity: 0;}"
			        + "to {opacity: 1;}"
			        + "}");

			out.println("h2 {"
			        + "color: #ff4b5c;"
			        + "text-align: center;"
			        + "animation: glow 1.5s infinite alternate;"
			        + "font-size: 28px;"
			        + "}");

			out.println("@keyframes glow {"
			        + "from { text-shadow: 0 0 10px #ff4b5c, 0 0 20px #ff4b5c; }"
			        + "to { text-shadow: 0 0 25px #ff9999, 0 0 40px #ff4b5c; }"
			        + "}");

			out.println("h3 {"
			        + "color: #00e0ff;"
			        + "text-align: center;"
			        + "animation: bounce 1.5s ease infinite alternate;"
			        + "}");

			out.println("@keyframes bounce {"
			        + "from { transform: translateY(0px); }"
			        + "to { transform: translateY(-10px); }"
			        + "}");

			out.println("table {"
			        + "background: rgba(255,255,255,0.1);"
			        + "padding: 20px 40px;"
			        + "border-radius: 15px;"
			        + "box-shadow: 0 8px 20px rgba(0,0,0,0.3);"
			        + "backdrop-filter: blur(6px);"
			        + "margin: auto;"
			        + "animation: fadeInUp 1s ease;"
			        + "}");

			out.println("@keyframes fadeInUp {"
			        + "from { transform: translateY(50px); opacity: 0; }"
			        + "to { transform: translateY(0); opacity: 1; }"
			        + "}");

			out.println("td {"
			        + "padding: 10px 20px;"
			        + "font-size: 18px;"
			        + "}");

			out.println("td:first-child {"
			        + "color: #ffcc70;"
			        + "font-weight: bold;"
			        + "}");

			out.println("tr:hover {"
			        + "transform: scale(1.05);"
			        + "transition: all 0.3s ease;"
			        + "}");

			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>Ajay SoftwRE solution</h2>");
			out.println("<h3>User registration details</h3>");
			out.println("<table align='center'>");
			out.println("<tr><td>User Name</td><td>" + uname + "</td></tr>");
			out.println("<tr><td>Password</td><td>" + upwd + "</td></tr>");
			out.println("<tr><td>User age</td><td>" + uage + "</td></tr>");
			out.println("<tr><td>User email</td><td>" + uemail + "</td></tr>");
			out.println("<tr><td>User mobile</td><td>" + umobile + "</td></tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");

			
			
			
		}catch(Exception e) {
			e.printStackTrace();		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
