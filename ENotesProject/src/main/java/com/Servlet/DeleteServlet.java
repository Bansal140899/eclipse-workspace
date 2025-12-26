package com.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.PostDao;
import com.db.DBConnect;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer noteid = Integer.parseInt(request.getParameter("note_id"));
		
		PostDao dao = new PostDao(DBConnect.getConn());
		
		boolean f = dao.DeleteNotes(noteid);
		
		HttpSession session = null;
		if(f) {
			 session = request.getSession();
			session.setAttribute("updatemsg", "Notes delete succesfully..");
			response.sendRedirect("showNotes.jsp");
		}else {
			session= request.getSession();
			session.setAttribute("wrongmsg", "something went wrong on server");
			response.sendRedirect("showNotes.jsp");
			
		
		}
	}

}
