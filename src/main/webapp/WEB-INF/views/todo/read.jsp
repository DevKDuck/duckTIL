<%--
  Created by IntelliJ IDEA.
  User: duck
  Date: 2024. 9. 23.
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>
<div class ="container-fluid">
    <div class="row">
        <div class="col">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Navbar</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Link</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Dropdown
                                </a>
                                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="#">Action</a></li>
                                    <li><a class="dropdown-item" href="#">Another action</a></li>
                                    <li><hr class="dropdown-divider"></li>
                                    <li><a class="dropdown-item" href="#">Something else here</a></li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled">Disabled</a>
                            </li>
                        </ul>
                        <form class="d-flex">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
        <div class="row content">
            <div class="col">
                <div class="card">
                    <div class="card-header">
                        Featured
                    </div>
                    <div class="card-body">
                       <div class="input-group mb-3">
                           <span class="input-group-text">TNO</span>
                           <input type="text" name="tno" class="form-control" value='<c:out value="${dto.tno}"></c:out>' readonly>
                       </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text">Title</span>
                            <input type="text" name="tno" class="form-control" value='<c:out value="${dto.title}"></c:out>' readonly>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text">DueDate</span>
                            <input type="date" name="tno" class="form-control" value='<c:out value="${dto.dueDate}"></c:out>' readonly>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text">Writer</span>
                            <input type="text" name="writer" class="form-control" value='<c:out value="${dto.writer}"></c:out>' readonly>
                        </div>
                        <div class="form-check">
                            <label class="form-check-label">
                                Finished &nbsp;
                            </label>
                            <input class="form-check-input" type="checkbox" name="finished" ${dto.finished?"checked":""}disabled>
                        </div>
                        <div class="my-4">
                            <div class="float-end">
                                <button type="button" class="btn btn-primary">Modify</button>
                                <button type="button" class="btn btn-secondary">List</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row content">
        <h1>Content</h1>
    </div>
    <div class="row footer">
        <div class="row fixed-bottom" style="z-index: -100">
            <footer class="py-1 my-1">
                <p class="text-center text-muted">Footer</p>
            </footer>
        </div>
    </div>
</div>


</body>
</html>




<%--<html>--%>
<%--<head>--%>
<%--    <title>Todo Read</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--    <div>--%>
<%--        <input type = "text" name = "tno" value ="${todoDTO.tno}" readonly>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <input type = "text" name = "title" value ="${todoDTO.title}" readonly>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <input type = "date" name = "dueDate" value ="${todoDTO.dueDate}">--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <input type = "checkbox" name = "finished" ${todoDTO.finished ? "checked": ""} readonly>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <a href="/todo/modify?tno=${todoDTO.tno}">Modify/Remove</a>--%>
<%--        <a href="/todo/list">List</a>--%>
<%--    </div>--%>
<%--</body>--%>
<%--</html>--%>
