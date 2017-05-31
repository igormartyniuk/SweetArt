<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="/css/test.css" type="text/css">
<title>Sweet Art</title>
</head>
<body>

	<h1 style="text-align: center; color: #ce7e01">Cakes</h1>
	<p style="text-align: center"><a  style="color: #ce7e01; font-size: 25px; text-decoration: none;" href="/">HOME</a></p>
	
	<div style="text-align: center;">

		<sf:form modelAttribute="cakes"  method="post">
			<sf:input path="cakeType" type="text" placeholder="cakeType"/>
			<br>
			<br>
			<sf:input path="cakeName" type="text" placeholder="cakeName"/>
			<br> <br>
			<sf:input path="weight" type="text"	placeholder="weight"/> <br> <br>
			<br> <br>
            <sf:checkboxes path="ingredient" items="${ingredients}" itemLabel="name" itemValue="id"/>
			<br> <br>
			<button>save cake</button>
		</sf:form>

	</div>
	
	<div style="display: inline-block">
		<ol>
		
		<div style="width: 150px; height: 20px; color:#ce7e01; border-bottom: 1px solid #ce7e01; border-right:1px solid #ce7e01;
		display: inline-block; text-align: center; margin-bottom: 5px">Cakes type </div>
		
		<div style="width: 150px; height: 20px; color:#ce7e01; border-bottom: 1px solid #ce7e01;
		border-bottom: 1px solid #ce7e01; border-left: 1px solid #ce7e01; border-right: 1px solid #ce7e01;
		display: inline-block; text-align: center; margin-bottom: 5px">Cakes name</div>
		
		<div style="width: 50px; height: 20px; color:#ce7e01; 
		border-bottom: 1px solid #ce7e01; border-left: 1px solid #ce7e01; border-right: 1px solid #ce7e01; 
		display: inline-block; text-align: center">Weight</div>
		
		<div style="width: 80px; height: 20px; color:#ce7e01; 
		border-bottom: 1px solid #ce7e01; border-left: 1px solid #ce7e01; border-right: 1px solid #ce7e01; 
		display: inline-block; text-align: center">UPDATE</div>
		
		<div style="width: 80px; height: 20px; color:#ce7e01; border-bottom: 1px solid #ce7e01;  border-left:1px solid #ce7e01;
		display: inline-block; text-align: center">REMOVE</div>
		
			<c:forEach var="cake" items="${cake}">
				<li>
					<div
						style="width: 150px; height: 20px;
						border: 1px solid black; 
						display: inline-block;
						text-align: center;">
						${cake.cakeType}
					</div> 
					
					<div
						style="width: 150px; height: 20px;
						border: 1px solid black; 
						display: inline-block;
						text-align: center;">
						${cake.cakeName}
					</div> 
					
					<div
						style="width: 50px; height: 20px; 
						border: 1px solid black; 
						display: inline-block;
						text-align: center;">
						${cake.weight}
					</div>
					
					<div
						style="width: 80px; height: 20px;
						border: 1px solid black; 
						display: inline-block;
						text-align: center;">	 
						 <a href="/updateCakes/${cake.id}">update</a>
					</div>
					
					<div
						style="width: 80px; height: 20px;
						border: 1px solid black; 
						display: inline-block;
						text-align: center;">	 
						 <a href="/deleteCakes/${cake.id}">delete</a>
					</div>
					
			</c:forEach>
		</ol>
	</div>

</body>
</html>