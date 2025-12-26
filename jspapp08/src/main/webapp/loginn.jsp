<%! 

String uname;
String upwd;
String status = "";
%>

<% 

uname = request.getParameter("uname");
upwd = request.getParameter("upwd");

if(uname.equals("ajay") && upwd.equals("ajay")){
	status= "login success";
}else{
	status = "login failure";
%>




<jsp:forward page="statushome.jsp">
<jsp:param value='<%=status %>' name = "status"/>
</jsp:forward>