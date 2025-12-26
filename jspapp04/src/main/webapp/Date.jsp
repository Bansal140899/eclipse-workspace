<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*"%>
    <%! 
 Date d = null;
String date =null;

%>

<%
 d= new Date();
date = d.toString();


%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">

<center><b><font size = "6" color = "red"><br><br>


Today Date :<%= date %>

</font></b></center>



</body>
</html>