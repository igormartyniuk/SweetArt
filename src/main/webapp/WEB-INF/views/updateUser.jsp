<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sweet Art</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
	<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
	<script src="https://use.fontawesome.com/6a4ab084c1.js"></script>
	<link rel="stylesheet" href="/css/addMenu.css" type="text/css">
</head>
<body>

	<div class="testbox">
		<h1>Registration</h1>

		<form action="/updateUser/${currentUser.id}" method="post">
			<label id="icon" for="name"><i class="icon-user"></i></label>
			<input type="text" name="name" id="name" value="${currentUser.name }" placeholder="Name" required/>
			<label id="icon" for="name"><i class="icon-envelope "></i></label>
			<input type="text" name="email" id="name"  value="${currentUser.email}" placeholder="Email" required/>
			<label id="icon" for="name"><i class="icon-shield"></i></label>
			<input type="password" name="password" id="name"  value="${currentUser.password}" placeholder="Password" required/>

			<button class="buttonSave">save user</button>
			<a style="text-decoration: none" href="/"><h1>HOME</h1></a>
		</form>
	</div>


</body>
</html>