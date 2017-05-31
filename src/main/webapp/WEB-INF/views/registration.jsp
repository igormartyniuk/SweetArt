<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>

	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
			 pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sweet Art</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
	<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
	<script src="https://use.fontawesome.com/6a4ab084c1.js"></script>
	<link rel="stylesheet" href="/css/addMenu.css" type="text/css">
	<link rel="stylesheet" href="/css/Menu.css" type="text/css">
	<link rel="stylesheet" href="/css/ingredientTable.css" type="text/css">
	<script src="/js/ingredientTable.js"></script>

</head>
<body>

<nav id="nav-1">
	<a class="link-1" href="/registration">HOME</a>
	<a class="link-1" href="/cakes">CAKES</a>
	<a class="link-1" href="/orders">ORDERS</a>
	<a class="link-1" href="/ingredient">INGREDIENTS</a>
	<a class="link-101" href="/registration">SING UP</a>
</nav>

<div class="testbox">

	<h1>Registration</h1>

	<sf:form modelAttribute="user" action="/saveUser" method="post">
		<p style="text-align: center; color: red; width: 180px">${usernameException}</p>
		<br>
		<label id="icon" for="name"><i class="icon-user"></i></label>
		<sf:input path="name" type="text" id="name" placeholder="Name" />
		<p style="text-align: center; color: red; width: 180px">${emailException}</p>
		<br>
		<label id="icon" for="name"><i class="icon-envelope"></i></label>
		<sf:input path="email" type="text" id="name" placeholder="Email"/>
		<p style="text-align: center; color: red; width: 180px">${passwordException}</p>
		<br>
		<label id="icon" for="name"><i class="icon-shield"></i></label>
		<sf:input path="password" type="password" id="name" placeholder="Password"/>

		<button class="buttonSave">save user</button>
		<a style="text-decoration: none" href="/"><h1>HOME</h1></a>
	</sf:form>
</div>

	<div class="divsize" id="bodywrap">
	<div class="row">
		<div class="large-10 columns">
			<div class="scroll-window-wrapper">

				<div class="scroll-window">
					<table class="table table-striped table-hover user-list fixed-header">
						<thead>
						<th><div>Name</div></th>
						<th><div>Email</div></th>
						<th><div>Password</div></th>
						<th><div></div></th>
						</thead>
						<tbody>
						<c:forEach var="u" items="${users}">
							<tr>
								<td>${u.name}</td>
								<td>${u.email}</td>
								<td>${u.password}</td>
								<td class="text-right">
									<a class="button1 tiny" href="/updateUser/${u.id}}">update</a>
									<a class="button1 alert tiny" href="/deleteUser/${u.id}">delete</a>
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

</div>


</body>
</html>