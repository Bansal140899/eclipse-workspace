package com.ajaysoft.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ajaysoft.beans.Student;
import com.ajaysoft.service.StudentService;

/**
 * Servlet implementation class EditFormSerlet
 */
@WebServlet("/edit")
public class EditFormSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditFormSerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");;
		
		StudentService stdService = new StudentService();
		Student std = stdService.getStudent(sid);
		
		if(std == null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style = 'color:red;' align='center'>Ajay software SOLUTION</h2>");
			out.println("<h3  style = 'color:blue;' align='center'>Student update form</h3>");
			out.println("<h1  style = 'color:red;' align='center'> student not existed<h1>");
			out.println("<h3 align='center' >");
			out.println("<a href='./updateform.html'>|student update form |</a>");
			out.println("</h3></body></html>");
			
		}else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style = 'color:red;' align='center'>Ajay software SOLUTION</h2>");
			out.println("<h3  style = 'color:blue;' align='center'>Student update form</h3>");
			out.println("<form method = 'post' action = './update'");
			out.println("<table align = 'center'>");
			out.println("<tr><td>Student is</td><td> "+std.getSid()+"</td></tr>)");
			out.println("<input type = 'hidden' name = 'sid' value='"+sid+"'/>");
			out.println("<tr><td>Student name</td><td><input type = 'text' name='sname' value='"+std.getSname()+"'/>");
			out.println("<tr><td>Student saddr</td><td><input type = 'text' name='saddr' value='"+std.getSaddr()+"'/>");
			out.println("<tr><td><input type = 'submit' value='update'/></td><tr>");
			out.println("</table></body></html>");
		}
		
	}

}
