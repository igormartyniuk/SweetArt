<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sweet Art</title>
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
	<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
	<script src="https://use.fontawesome.com/6a4ab084c1.js"></script>
	<link rel="stylesheet" href="/css/addMenu.css" type="text/css">
	<link rel="stylesheet" href="/css/Menu.css" type="text/css">
	<script !src="/js/indexMenu.js"></script>

</head>
<body>
<nav id="nav-1">
	<a class="link-1" href="/registration">sing up</a>
	<a class="link-1" href="/cakes">cakes</a>
	<a class="link-1" href="/orders">orders</a>
	<a class="link-1" href="/ingredient">ingredient</a>
</nav>

<div class="testbox">
	<h1>Ingredient</h1>
	<form action="/updateIngredient/${currentIngredient.id }" method="post">
		<label id="icon" for="name"><i class="icon-envelope"></i></label>
		<input type="text" name="ingredientName" value="${currentIngredient.name }" id="name" placeholder="ingredient" required/>
		<label id="icon" for="name"><i class="icon-envelope"></i></label>
		<input type="text" name="ingredientWeight" value="${currentIngredient.weight}" id="name" placeholder="weight" required/>
		<label id="icon" for="name"><i class="icon-envelope"></i></label>
		<input type="text" name="ingredientPrice" value="${currentIngredient.price}" id="name" placeholder="price" required/>

		<button class="buttonSave1">save</button>
		<a style="text-decoration: none" href="/"><h1>HOME</h1></a>
	</form>
</div>

</body>
</html>