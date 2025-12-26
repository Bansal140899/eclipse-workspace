<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<html>

<body>
<b><font size ="7">

<c:set var = "a" value="0"/>

<c:forEach var ="index" begin="0" end ="10" step="1">

<h1>ajay software solution<c:out value="${index}"></c:out></h1>
</c:forEach>



</b>

<c:out value="array print"/>
<%


String[] str = {"AAA" ,"BBB" ,"CCC" ,"DDD" ,"EEE"};
request.setAttribute("str" ,str);
%>

<c:forEach var="s" items="${str}">
<c:out value="${s}"/><br>

</c:forEach>
</body>

</html>