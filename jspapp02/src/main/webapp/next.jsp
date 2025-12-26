<%@ page language="java" autoFlush="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page errorPage="text.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   // Ek large loop jo bohot saara output generate karega
   for(int i=0; i<10000; i++) {
       out.println("Line number: " + i + "<br>");
   }
%>
<p>Done!</p>
</body>
</html>