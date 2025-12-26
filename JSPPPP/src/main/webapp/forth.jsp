<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='red' text='yellow'>
<table border='20'>

<% for(int i=1; i<=100; i++){ %>
<tr>
<td>5</td>
<td>x</td>
<td><%= i %></td>
<td>=</td>
<td><%= 5*i %></td>
</tr>
<% } %>


</table>

</body>
</html>