<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.time.*"%>
    
    <%!
    int hour;
    LocalTime lt;
    String wish_message ="";
    
    
    
    %>
    <%
    lt = LocalTime.now();
    hour = lt.getHour();
    
    if(hour<12){
    	wish_message = "Good Morining!";
    }else if(hour >17 && hour>=12){
    	wish_message = "Good Afternoon!";
    }else{
    	wish_message = "Good Evening!";
    }
    
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">

<marquee>
<h1 style = "color:blue;">
Hello User ,<%= wish_message %>

</h1>

</marquee>

</body>
</html>