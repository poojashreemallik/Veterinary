<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>Create New Account</title>

</head>
<body>
	<form:form action="createdoctor.html" method="post">
		<h2 align="left">New Doctor Account</h2>
		<hr />

		<div align="justify">

			<form:label path="fname">First Name :</form:label> <form:input path="fname"/><br />
			<br /> <br /> <form:label path="lname">Last Name :</form:label> <form:input path="lname" /><br /> <br /> <br /> 
			<form:label path="gender">Gender :</form:label> <form:input path="gender"/> 
				
			<br /> <br /> <br />
			 <form:label path="dob">Date Of Birth:</form:label>
			  <form:input path="dob"/> <br /> <br /> <br /> 
			  
			  <form:label path="adhaarnumber">Adhaar	No:</form:label> 
			  <input type="text" name="adhaar" /><br /> <br /> <br />
			   
			  <form:label path="phone">Phone	:</form:label> 
			  <input type="text" name="phone" /><br /> <br /> <br /> 
			  
			  <form:label path="address">Address:</form:label><br />
			<form:input path="address"/>	<br /> <br /> <br /> 
			
			<form:label path="specialization">Specialization :</form:label><br />
			<form:input path="specialization"/>
			
		
					
				<br /> <br /> 
				<form:label path="user.username">UserName :</form:label> 
				<form:input path="user.username" /> <br /> <br /> <br /> <form:label path="user.password">Password:</form:label> <form:input path="user.password"/><br>			


			<input type="submit" value="Create">
	</form:form>
</body>
</html>