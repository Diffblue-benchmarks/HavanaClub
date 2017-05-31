<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>


    <link rel="stylesheet" href="/bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap/bootstrap.css">
    <link rel="stylesheet" href="/css/header.css">
    <script src="/js/header.js"></script>
</head>
<body>
<div>


    <header class="header" role="banner">
        <nav>
            <ul>
                <li class="active"><a href="/">Home</a>
                </li>
                <li><a href="/signUp">sign up</a>
                </li>
                <li><a href="/drink">drinks</a>
                </li>
                <li><a href="/ingredient">ingredients</a>
                </li>
                <li><a href="/country">countries</a>
                </li>
                <li><a href="/try">try</a>
                </li>
            </ul>
        </nav>
    </header>
    <br>
    <br>
    <br>
    <br>

    <div class="container">

        <table class="table table-hover">
            <thead>
            <tr>
                <th>drink name</th>
                <th>ingredients</th>
                <th>
                    <li>
                        <div class="form-group; col-lg-10">
                            <label class="sr-only" for="search">Email address</label>
                            <input type="text" class="form-control" id="search"
                                   placeholder="search"/>
                        </div>
                    </li>
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="drink" items="${drinks}">
                <tr>
                    <td>
                            ${drink.drinkName}
                    </td>
                    <td>
                        <c:forEach items="${drink.ingredients}" var="ingredient">
                            ${ingredient.ingredientName} <br>
                        </c:forEach>
                    </td>
                    <td>
                        <a href="recipe/${drink.id}">recipe</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>