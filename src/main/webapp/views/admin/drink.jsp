<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div class="container">

    <div class="panel">
        <sf:form modelAttribute="drink" method="post">
            <div style="display: flex; justify-content: space-around ">

                <div class="form-group">
                    <label class="sr-only" for="exampleInputEmail3">Email address</label>
                    <sf:input path="drinkName" type="text" class="form-control" id="exampleInputEmail3"
                              placeholder="drink name"/>
                </div>
                <div class="form-group">
                    <label class="sr-only" for="exampleInputEmail3">Email address</label>
                    <sf:textarea path="recipe" type="text" class="form-control" id="exampleInputEmail3"
                              placeholder="recipe"/>
                </div>
                <div class="form-group">
                    <label class="sr-only" for="exampleInputEmail3">Email address</label>
                    <select multiple name="ingredientsIds" type="text" class="form-control" id="exampleInputEmail3">
                        <c:forEach var="country" items="${ingredients}">
                            <option value="${country.id}">${country.ingredientName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <button class="btn btn-default">save ingredient</button>
                </div>
            </div>
        </sf:form>
        <table class="table table-hover">
            <thead>
            <tr>
                <th>name</th>
                <th>recipe</th>
                <th>ingredients</th>
                <th>delete</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="drink" items="${drinks}">
                <tr>
                    <td>
                            ${drink.drinkName}
                    </td>
                    <td>
                            ${drink.recipe}
                    </td>
                    <td>
                        <c:forEach items="${drink.ingredients}" var="country">
                            ${country.ingredientName} <br>
                        </c:forEach>
                    </td>

                    <td>
                        <a href="deleteDrink/${drink.id}">delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
</html>