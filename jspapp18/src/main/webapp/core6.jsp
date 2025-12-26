<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource 
    driver="com.mysql.cj.jdbc.Driver" 
    url="jdbc:mysql://127.0.0.1:3306/ajay"
    user="root" 
    password="root" />
    
    <sql:query var="result" sql ="select * from emp7"/>
    
    <html>
    
    <body>
    
      <table border="1">
      
      <tr>
      <c:forEach var = "column_name" items= "${result.columnNames}">
      <th><c:out value="${column_name}"/>
      </th>
      </c:forEach>
      </tr>
      
      <c:forEach var="row" items="${result.rowsByIndex}">
      <tr>
      <c:forEach var = "column" items="${row}">
        <td><c:out value="${column}"/></td>
      
      
      </c:forEach>
      </tr>
      
      
      
      </c:forEach>
      
      
      
      
      
      
      </table>
    
    
    
    
    </body>
    
    
    </html>
    