<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10.12.2024
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Witaj</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1 class="alert alert-danger">Brak produktu o wskazanym identyfikartorze: ${invalidProductId}</h1>
        </div>
    </div>
</section>
<section>
    <div class="container">
        <p>${url}</p>
        <p>${exception}</p>
    </div>
    <div class="container">
        <p>
            <a href="<spring:url value="/products" />" class="btn btn-primary" >
                <span class="glyphicon-hand-left glyphicon"></span> produkty
            </a>
        </p>
    </div>
</section>
</body>
</html>
