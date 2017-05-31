<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sweet Art</title>
    <link rel="stylesheet" href="/css/Menu.css">
    <link rel="stylesheet" href="/css/addMenu.css">
	<link rel="stylesheet" href="/css/ingredientTable.css" type="text/css">
    <script src="/js/ingredientTable.js"></script>
</head>
<body>

<h1 style="text-align: center; text-decoration: double; color: #ce7e01">SweetArt</h1>

<nav id="nav-1">
    <a class="link-1" href="/registration">sing up</a>
    <a class="link-1" href="/cakes">cakes</a>
    <a class="link-1" href="/orders">orders</a>
    <a class="link-1" href="/ingredient">ingredient</a>
</nav>
<br><br><br>
<div class="testbox1">
    <h1>Ingredient</h1>
    <form action="/ingredient" method="post">
    <label id="icon" for="name"><i class="icon-envelope"></i></label>
    <input type="text" name="ingredientName" id="name" placeholder="ingredient" required/>
    <label id="icon" for="name"><i class="icon-envelope"></i></label>
    <input type="text" name="ingredientWeight" id="name" placeholder="weight" required/>
    <label id="icon" for="name"><i class="icon-envelope"></i></label>
    <input type="text" name="ingredientPrice" id="name" placeholder="price" required/>

    <button class="buttonSave1">save</button>
    <a style="text-decoration: none" href="/"><h1>HOME</h1></a>
    </form>
</div>

	<div class="divsize" id="bodywrap">
		<div class="row">
			<div class="large-10 columns">
				<div class="scroll-window-wrapper">

					<div class="scroll-window">
						<table class="table table-striped table-hover user-list fixed-header">
							<thead>
							<th><div>Ingredient</div></th>
							<th><div>weight</div></th>
							<th><div>price</div></th>
							<th><div></div></th>
							</thead>
							<tbody>
                            <c:forEach var="ingredient" items="${ingredient}">
                                <tr>
                                    <td>${ingredient.name}</td>
                                    <td>${ingredient.weight}</td>
                                    <td>${ingredient.price}</td>
                                    <td class="text-right">
                                        <a class="button1 tiny" href="/updateIngredient/${ingredient.id}">update</a>
                                        <a class="button1 alert tiny" href="/deleteIngredient/${ingredient.id}">delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>