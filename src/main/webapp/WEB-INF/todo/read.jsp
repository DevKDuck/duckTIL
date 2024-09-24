<%--
  Created by IntelliJ IDEA.
  User: duck
  Date: 2024. 9. 23.
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Todo Read</title>
</head>
<body>
    <div>
        <input type = "text" name = "tno" value ="${todoDTO.tno}" readonly>
    </div>
    <div>
        <input type = "text" name = "title" value ="${todoDTO.title}" readonly>
    </div>
    <div>
        <input type = "date" name = "dueDate" value ="${todoDTO.dueDate}">
    </div>
    <div>
        <input type = "checkbox" name = "finished" ${todoDTO.finished ? "checked": ""} readonly>
    </div>
    <div>
        <a href="/todo/modify?tno=${todoDTO.tno}">Modify/Remove</a>
        <a href="/todo/list">List</a>
    </div>
</body>
</html>
