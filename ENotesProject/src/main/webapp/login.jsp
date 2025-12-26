<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
	<%@include file="All_Component/allcss.jsp"%>
	<%@include file="All_Component/navbar.jsp"%>
	<div class="container-fluid div-color">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="text-center text-white mt-4">

					<div class="card-header text-center text-white bg-custom">
						<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i>
						<h1>Login</h1>

					</div>



					<%
					String FailedMsg = (String) session.getAttribute("failed-msg");
					if (FailedMsg != null) {
					%>
					<div class="alert alert-success" role="alert"><%=FailedMsg%>Register<a
							href="register.jsp">click here</a>
					</div>
					<%
					session.removeAttribute("failed-msg");
					}
					%>
					
					<%
					String withoutLogin=(String)session.getAttribute("login-error");
					if(withoutLogin != null){
						%>
						<div class="alert alert-danger" role="alert"><%=withoutLogin%><a
							href="login.jsp">click here</a>
						
						<% 
						session.removeAttribute("login-error");
						
						
					}
					
					%>
					
					<%
					String lgmsg = (String)session.getAttribute("logut-msg");
					if(lgmsg != null){
						%>
						<div class="alert alert-succes" role="alert"><%=lgmsg%><a
							href="login.jsp">click here</a>
						
						<% 
						session.removeAttribute("logout-msg");
						
						
					}
					
					
					%>










				</div>
				<div class="card-body bgg-custom">
					<form action="loginServlet" method="post">

						<div class="form-group">
							<label> Enter Email</label> <input type="email"
								class="form-control" id="exampleInputEmail1" name="uemail"
								aria-describedby="emailHelp">
						</div>

						<div class="form-group">
							<label>Enter Password</label> <input type="password"
								class="form-control" id="exampleInputPassword1" name="upwd">
						</div>

						<button type="submit" class="btn btn-primary badge-pill btn-block">Login</button>
					</form>


				</div>
			</div>

		</div>

	</div>


	</div>

	<%@include file="All_Component/footer.jsp"%>
</body>
</html>