<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<html>

<body>
<center>
<b><font size="7">

<c:catch var='e'>
<jsp:scriptlet>
	
	
	float f = 100/0;


</jsp:scriptlet>>

</c:catch>
<c:out value = "${e}"/>
</font>




</b>


</body>

</html>