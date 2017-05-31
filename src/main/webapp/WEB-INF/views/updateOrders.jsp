<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>??????? ?????????</title>
</head>
<body>
	<h1 style="text-align: center; color: #ce7e01">Update order</h1>
	<p style="text-align: center">
		<a style="color: #ce7e01; font-size: 25px; text-decoration: none;" href="/">HOME</a>
	</p>

	<div style="text-align: center;">

		<form action="/updateOrders/${currentOrder.id}" method="post">
			<select name="orderType" style="width: 172px;">
				<c:forEach var="cake" items="${cakes}">
					<option>${cake.cakeType }</option>
				</c:forEach>
			</select> 
			<br>
			<br> 
			<select name="orderName" style="width: 172px;">
				<c:forEach var="cake" items="${cakes}">
					<option>${cake.cakeName }</option>
				</c:forEach>
			</select> 
			<br> 
			<br> 
			<input type="text" name="numbers" value="${currentOrder.number}"
				placeholder="numbers"> <br> <br> 
			<input type="date" name="orderDate" value="${currentOrder.date}" style="width: 170px;"> <br> <br>
 
			<button>update order</button>
		</form>

	</div>

</body>
</html>