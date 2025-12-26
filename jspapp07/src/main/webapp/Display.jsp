
<%!
int eid;
String ename;
float esal;
String eaddr;


%>
<% 

try{
	eid = Integer.parseInt(request.getParameter("eid"));
	ename = request.getParameter("ename");
	esal = Float.parseFloat(request.getParameter("esal"));
	eaddr = request.getParameter("eaddr");

}catch(Exception e){
	e.printStackTrace();
}



%>


<jsp:useBean id="emp" class="com.ajaysoft.Beans.Employee" scope="session"/>

<jsp:setProperty name ="emp" property = "eid" value='<%=eid %>'/>
<jsp:setProperty name ="emp" property = "ename" value='<%=ename %>'/>

<jsp:setProperty name ="emp" property = "esal" value='<%=esal %>'/>
<jsp:setProperty name ="emp" property = "eaddr" value='<%=eaddr %>'/>


<html>

 <h1 style="color:grey;" align ="center">Ajay software solution</h1>
  <h2 style ="color:mehroon" align="center">Employee Registration deatial</h2>


  
     Employee Number :<jsp:getProperty name="emp" property ="eid"/><br>
     Employee Name  :<jsp:getProperty name="emp" property ="ename"/><br>
     Employee Salary  :<jsp:getProperty name="emp" property ="esal"/><br>
     Employee Address :<jsp:getProperty name="emp" property ="eaddr"/><br>
     
  
  
  
  
  
  

</html>

















