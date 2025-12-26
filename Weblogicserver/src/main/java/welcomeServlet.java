import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class welcomeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException ,IOException{
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.print("<h2>welcome to weblogic server </h2>");
		out.println("</body></html>");  
		
	}

}
