package com.ajaysoft.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // TODO Auto-generated method stub
    	response.getWriter().append("Served at: ").append(request.getContextPath()); 
    	doPost(request, response); }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");
        String uqual = request.getParameter("uqual");
        String uemail = request.getParameter("uemail"); // ✅ fixed spelling
        String umobile = request.getParameter("umobile");

        // ✅ Null check before equals
        if (uqual != null && uqual.equalsIgnoreCase("Btech")) {
            out.println("<html>");
            out.println("<body>");
            out.println("<h2 style='color:red' align ='center'>Ajay Software Consultancy Service</h2>");
            out.println("<h3 style='color:blue' align ='center'>User Registration Details</h3>");
            out.println("<table align='center' border='1' bgcolor='lightpink'>");
            out.println("<tr><td>User Name</td><td>" + uname + "</td></tr>");
            out.println("<tr><td>User Qualification</td><td>" + uqual + "</td></tr>");
            out.println("<tr><td>User Email</td><td>" + uemail + "</td></tr>");
            out.println("<tr><td>User Mobile</td><td>" + umobile + "</td></tr>");
            out.println("</table><br>");
            out.println("<h3 align='center'>");
            out.println("<a href='./regform.html'>| User REGISTRATION PAGE |</a>");
            out.println("</h3>");
            out.println("</body></html>");
        } else {
            response.sendError(412, "Your qualification is not sufficient for this recruitment drive.");
        }
    }
}
