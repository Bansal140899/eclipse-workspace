<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<body>
<b><font size="7">

<sql:setDataSource 
    driver="com.mysql.cj.jdbc.Driver" 
    url="jdbc:mysql://127.0.0.1:3306/ajay"
    user="root" 
    password="root" />

<sql:update var="result">
  CREATE TABLE IF NOT EXISTS emp7(
    eid INT(19),
    ename VARCHAR(10),
    esal INT(7)
  )
</sql:update>

rowCount ------- <c:out value="${result}"/>

</font></b>
</body>
</html>
