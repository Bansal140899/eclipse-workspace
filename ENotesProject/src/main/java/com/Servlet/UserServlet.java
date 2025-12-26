package com.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.UserDAO;
import com.User.UserDetails;
import com.db.DBConnect;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("fname");
		String email = request.getParameter("uemail");
		String upwd = request.getParameter("upwd");
		
		UserDetails us = new UserDetails();
		us.setName(name);
		us.setPassword(upwd);
		us.setEmail(email);
		
		
		
		UserDAO dao = new UserDAO(DBConnect.getConn());
		boolean f =dao.addUser(us);
//		PrintWriter out = response.getWriter();
		
		HttpSession session ;
		if(f) {
//			out.print("user Register Succesfully");
			session = request.getSession();
			session.setAttribute("reg-succes", "Registration Succesfully..");
			response.sendRedirect("register.jsp");
		}else {
//			out.print("data not insert succefully");
			session = request.getSession();
			session.setAttribute("failed-msg", "somethhing went wrong on server");
			response.sendRedirect("register.jsp");
		}
		
		
		doGet(request, response);
	}

}
