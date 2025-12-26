<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="main.jsp" %>
<html>
<body>

<%
   int a = 10;
   int b = 0;
   int c = a / b; // ❌ This will throw ArithmeticException
%>
<p>Result is: <%= c %></p>
</body>
</html>
