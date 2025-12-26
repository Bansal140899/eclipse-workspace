package com.example;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
public class Myservlet implements Servlet {

	public void init(ServletConfig config )throws ServletException {}
    public void destroy(){}
   

    public void service(ServletRequest request ,ServletResponse response) throws ServletException ,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1><center>hello</center></h1>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Animation</title>");
        
        // CSS for animation
        out.println("<style>");
        out.println("@keyframes bounce {");
        out.println("  0%, 100% { transform: translateY(0); }");
        out.println("  50% { transform: translateY(-30px); }");
        out.println("}");
        out.println(".animated {");
        out.println("  font-size: 50px;");
        out.println("  color: #ff4500;");
        out.println("  text-align: center;");
        out.println("  margin-top: 100px;");
        out.println("  animation: bounce 1s infinite;");
        out.println("}");
        out.println("</style>");

        out.println("</head>");
        out.println("<body>");
        
        // Animated Hello
        out.println("<div class='animated'>hello</div>");
        
        out.println("</body>");
        out.println("</html>");
    }
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}



}
