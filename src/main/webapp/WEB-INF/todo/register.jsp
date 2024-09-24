<%--
  Created by IntelliJ IDEA.
  User: duck
  Date: 2024. 9. 23.
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/todo/register" method="post">
      <div>
          <input type = "text" name="title" placeholder="INSERT TITLE">
          <input type = "date" name="dueDate">
      </div>
      <button type="reset"> 리셋</button>
      <button type="submit"> 등록 </button>
  </form>
</body>
</html>
