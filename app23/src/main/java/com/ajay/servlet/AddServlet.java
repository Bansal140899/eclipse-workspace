package com.ajay.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ajay.studentdao.StudentDao;
import com.ajay.user.StudentServiceImp1;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
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
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String saddr = request.getParameter("saddr");
		
		StudentServiceImp1 std = new StudentServiceImp1();
		std.setSname(sname);
		std.setSid(sid);
		std.setSaddr(saddr);
		
		StudentDao stdservice = new StudentDao();
		
		stdservice.addd(std);
		
		try {
			ArrayList<StudentServiceImp1> srds = stdservice.getStudentDetails();
			
			out.println("<html><body><center><br><br>");
			out.println("<h2 style = 'color:red;'align='center'>ajay software solution</h2>");
			out.println("<h2 style = 'color:blue;'align='center'>student details</h2>");
			out.println("<table border = '1' bgcolor = 'pink'>");
			out.println("<tr><th>SID</th><th>SNAME</th><th>SADDAR</TH><tr>");
			
			
			for(StudentServiceImp1 s :srds) {
				
				out.println("<tr>");;
				out.println("<td>"+s.getSid()+"</td>");
				out.println("<td>"+s.getSname()+"</td>");
				out.println("<td>"+s.getSaddr()+"</td>");
				out.println("<tr>");
			}
			out.println("</table></center></body></html>");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Addform.html");
		requestDispatcher.include(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
