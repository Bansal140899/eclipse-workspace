<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<body>
<b><font size="7">

<sql:setDataSource 
    driver="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://127.0.0.1:3306/ajay"
    user="root" 
    password="root" />

<sql:update var="result">
    INSERT INTO emp7(eid, ename, esal) VALUES (101, 'aaa', 5000)
</sql:update>

rowCount ------- <c:out value="${result}"/>

</font></b>
</body>
</html>
