<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>??????? ?????????</title>
</head>
<body>
<h1 style="text-align: center; color: #ce7e01">Cakes</h1>
	<p style="text-align: center"><a  style="color: #ce7e01; font-size: 25px; text-decoration: none;" href="/">HOME</a></p>
	
	<div style="text-align: center;">

		<form action="/updateCakes/${currentCake.id}" method="post">
			<input type="text" name="cakeType" value="${currentCake.cakeType }" placeholder="cakeType"> <br>
			<br> <input type="text" name="cakeName" value="${currentCake.cakeName }" placeholder="cakeName">
			<br> <br> <input type="text" name="weight" value="${currentCake.weight }" 
				placeholder="weight"> <br> <br>
			<br> <br>
			<button>update cake</button>
		</form>

	</div>
</body>
</html>