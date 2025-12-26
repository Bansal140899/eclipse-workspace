<%@ taglib uri="/WEB-INF/nested.tld" prefix="mytags" %>
<mytags:if condition='<%= 10>20 %>'>
<mytags:true>
<h1>condition is true</h1>
</mytags:true>

<mytags:false>
<h1>condition is false</h1>
</mytags:false>
</mytags:if>