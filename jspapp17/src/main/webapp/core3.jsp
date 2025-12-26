<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<html>

<body>
<b><font size ="7">

<c:set var = "a" value="152"/>
<c:choose>

	<c:when test="${a==5}">
	<h1><c:out value="five"></c:out></h1>
	</c:when>
   <c:when test="${a==10}">
	<h1><c:out value="ten"></c:out></h1>
	</c:when>
   <c:when test="${a==15}">
	<h1><c:out value="fifteen"></c:out></h1>
	</c:when>
   <c:when test="${a==20}">
	<h1><c:out value="twenty"></c:out></h1>
	</c:when>
	
	<c:otherwise>
	bhoomm............
	</c:otherwise>
   







</c:choose>





</font></b>
</body>

</html>