<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource 
    driver="com.mysql.cj.jdbc.Driver" 
    url="jdbc:mysql://127.0.0.1:3306/ajay"
    user="root" 
    password="root" />
    
    <sql:update var = "result">
    update emp7 set esal = esal+? where esal<=?;
    <sql:param value="1000"/>
    <sql:param value="5000"/>
    
    
    </sql:update>
