<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<c:forTokens var = "token" items="ajay software solution" delims=" ">

<h1><c:out value="${token}"/></h1>


</c:forTokens>