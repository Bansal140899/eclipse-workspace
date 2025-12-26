package com.ajay.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ajay.beans.Student;
import com.ajay.factory.StudentServieFactory;
import com.ajay.service.StudentService;


@WebServlet("/controller/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doPost(request, response);
		doProcess(request ,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doProcess(request ,response);
//		doGet(request, response);
	}

	
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String request_urI = request.getRequestURI();
		System.out.println(request_urI);
		RequestDispatcher requestDispatcher=  null;
		if(request_urI.endsWith("addform")) {
			requestDispatcher = request.getRequestDispatcher("/addform.html");
			requestDispatcher.forward(request, response);
		}
		if(request_urI.endsWith("searchform")) {
			requestDispatcher = request.getRequestDispatcher("/searchform.html");
			requestDispatcher.forward(request, response);
		}
		if(request_urI.endsWith("updateform")) {
			requestDispatcher = request.getRequestDispatcher("/updateform.html");
			requestDispatcher.forward(request, response);
		}
		if(request_urI.endsWith("deleteform")) {
			requestDispatcher = request.getRequestDispatcher("/deleteform.html");
			requestDispatcher.forward(request, response);
		}
		if(request_urI.endsWith("add")) {
			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			String saddr = request.getParameter("saddr");
			
			Student student = new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);
			
			StudentService studentService = StudentServieFactory.getStudentService(); 
			String status = studentService.addStudent(student);
			System.out.println(status);
			System.out.println(status.equals("success"));
			
			if(status.equals("existed")) {
				requestDispatcher = request.getRequestDispatcher("/existed.html");
				requestDispatcher.forward(request, response);
			}
			
			if(status.equals("success")) {
				requestDispatcher = request.getRequestDispatcher("/success.html");
				requestDispatcher.forward(request, response);
		
			
			}
			if(status.equals("failure")) {
				requestDispatcher = request.getRequestDispatcher("/failure.html");
				requestDispatcher.forward(request, response);
			}
			
			
			
		}
		
		if(request_urI.endsWith("search")) {
			
			String sid = request.getParameter("sid");
			StudentService studentService = StudentServieFactory.getStudentService();
			Student student = studentService.searchStudent(sid);
			if(student == null) {
				requestDispatcher = request.getRequestDispatcher("/notexisted.html");
				requestDispatcher.forward(request, response);
			}else {
				response.setContentType("text/html");
				PrintWriter out =  response.getWriter();
				out.println("<html>");
				out.println("<body bgcolor='lightblue'>");
				out.println("<br><br><br>");
				out.println("<table align = 'center' border='1'>");
				out.println("<table align ='center' border = '1'>");
				out.println("<tr><td>Student id</td><td>"+student.getSid()+"</td></tr>");
				out.println("<tr><td>Student name</td><td>"+student.getSname()+"</td></tr>");
				out.println("<tr><td>Student address</td><td>"+student.getSaddr()+"</td></tr>");
				out.println("</table></body></html>");
			}
			
		}
		
		if(request_urI.endsWith("edit")) {
			String sid = request.getParameter("sid");
			StudentService studentService = StudentServieFactory.getStudentService();
			Student student = studentService.searchStudent(sid);
			if(student == null) {
				requestDispatcher = request.getRequestDispatcher("/notexisted.html");
				requestDispatcher.forward(request, response);
			}else {
				response.setContentType("text/html");
				PrintWriter out =  response.getWriter();
				  out.println("<html>");
			        out.println("<body bgcolor='lightblue'>");
			        out.println("<br><br><br>");
			        out.println("<h2 align='center'>Update Student Details</h2>");
			        out.println("<form method='post' action='update'>");
			        out.println("<table align='center' border='1' cellpadding='10'>");
			        
			        out.println("<tr><td>Student ID</td>");
			        out.println("<td><input type='hidden' name='sid' value='" + student.getSid() + "' readonly></td></tr>");
			        
			        out.println("<tr><td>Student Name</td>");
			        out.println("<td><input type='text' name='sname' value='" + student.getSname() + "'></td></tr>");
			        
			        out.println("<tr><td>Student Address</td>");
			        out.println("<td><input type='text' name='saddr' value='" + student.getSaddr() + "'></td></tr>");
			        
			        out.println("<tr><td colspan='2' align='center'>");
			        out.println("<input type='submit' value='Update'>");
			        out.println("</td></tr>");
			        
			        out.println("</table>");
			        out.println("</form>");
			        out.println("</body>");
			        out.println("</html>");
			}
			
		}
		
		if(request_urI.endsWith("update")) {
			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			String saddr = request.getParameter("saddr");
			
			Student student = new Student();
			
			
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);
			
			StudentService studentService = StudentServieFactory.getStudentService(); 
			String status = studentService.updateStudent(student);
			
			if(status.equals("success")) {
				requestDispatcher = request.getRequestDispatcher("/success.html");
				requestDispatcher.forward(request, response);
		
			
			}
			else {
				requestDispatcher = request.getRequestDispatcher("/failure.html");
				requestDispatcher.forward(request, response);
			}
		}
		
		if(request_urI.endsWith("delete")) {
			String sid = request.getParameter("sid");
			StudentService studentService = StudentServieFactory.getStudentService();
			Student student = studentService.searchStudent(sid);
			if(student == null) {
				requestDispatcher = request.getRequestDispatcher("/notexisted.html");
				requestDispatcher.forward(request, response);
			}else {

				
				
				
				student.setSid(sid);
				
				
				String status = studentService.deleteStudent(sid);
				
				if(status.equals("success")) {
					requestDispatcher = request.getRequestDispatcher("/success.html");
					requestDispatcher.forward(request, response);
			
				
				}
				else {
					requestDispatcher = request.getRequestDispatcher("/failure.html");
					requestDispatcher.forward(request, response);
				}
				
			}
			
		}
	}

}
