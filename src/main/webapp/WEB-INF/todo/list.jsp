<%--
  Created by IntelliJ IDEA.
  User: duck
  Date: 2024. 9. 23.
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>
<ul>
    <c:forEach items = "${dtoList}" var="dto">
        <li>${dto}</li>
    </c:forEach>
</ul>

</body>
</html>
