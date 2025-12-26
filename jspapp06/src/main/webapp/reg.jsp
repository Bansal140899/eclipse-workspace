<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%! 
    int eid;
    String ename;
    float esal;
    String eaddr;
%>

<%
try {
    eid = Integer.parseInt(request.getParameter("eno"));
    ename = request.getParameter("ename");
    esal = Float.parseFloat(request.getParameter("esal"));
    eaddr = request.getParameter("eaddr");
    
    
    
    session.setAttribute("eno" ,eid);
    session.setAttribute("ename" ,ename);
    session.setAttribute("esal" ,esal);
    
    session.setAttribute("eaddr" ,eaddr);
    
    RequestDispatcher rd = application.getRequestDispatcher("/regg.jsp");
    rd.forward(request ,response);
} catch(Exception e) {
    e.printStackTrace();
}
%>


