<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<html>

<body>
<center>
<b><font size="7">

<c:set var="a" value="AAA" scope = "request" />
<br>
<c:out value = "core tag libray" />
<br>
<br>
<c:remove var = "a" scope = "request"/>
<c:out value = '${a}' />
</font>




</b>


</body>

</html>