import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		ServletContext context = getServletConfig().getServletContext();
	
	    String logialname = context.getServletContextName();
	    
	    String a = context.getInitParameter("a");
	    String b = context.getInitParameter("b");
	    
	    Enumeration e = context.getInitParameterNames();
	    
	    context.setAttribute("c", "cat");
	    context.setAttribute("d" , "dog");
	    
	    pw.println("<html><body><h1><br>");
	    pw.println("logical name : "+ logialname );
	    pw.println("<br>");
	    pw.println("a for "+a);
	    pw.println("<br>");
	    pw.println("a for "+b);
	    pw.println("<br>");
	    
	    
//	    pw.println("a for "+c);
//	    pw.println("<br>");
//	    pw.println("a for "+d);
	    
	    
	    while(e.hasMoreElements()) {
	    	pw.println(e.nextElement() + "<br>");
	    	
	    }
	    pw.println("c for .. "+context.getAttribute("c"));
	    pw.println("<br>");
	    
	    pw.println("d for .. "+context.getAttribute("d"));
	    pw.println("<br>");
	    
	    e =  context.getAttributeNames();
	    
	    while(e.hasMoreElements())
	    {
	    	pw.println(e.nextElement() + "<br>");
	    }
	    pw.println("</h1></body></html>");
	    
	    
	    
	
	

}
}