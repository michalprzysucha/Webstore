<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24.11.2024
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Produkty</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Produkty</h1>
                    <p>Wszystkie produkty dostępne w naszym sklepie</p>
                </div>
            </div>
        </section>
    <section class="container">
        <div class="row">
            <c:forEach items="${products}" var="product">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <img src="<c:url value="/resources/images/${product.productId}.png" />" alt="image" style="width: 100%" />
                        <div class="caption">
                            <h3>${product.name}</h3>
                            <p>${product.description}</p>
                            <p>${product.unitPrice}PLN</p>
                            <p>Liczba sztuk w magazynie: ${product.unitsInStock}</p>
                            <p>
                                <a href=" <spring:url value="/products/product?id=${product.productId}" />"
                                   class="btn btn-primary">
                                    <span class="glyphicon-info-sign glyphicon"></span> Sczegóły
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
    </body>
</html>
