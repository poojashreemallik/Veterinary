<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>Login</title>
 <link rel="stylesheet" href="/js/ui/1.11.4/themes/smoothness/jquery-ui.css">
 </head>
<body id="size">
<form action="login.html" method="post">
	<h3 align="center">User Login</h3><br/>
	<p align="center">
		<label>User Name :</label>
		<input type="text"  name="username" /><br />
		<br /> <label>Password :</label> <br/>
		<input type="password" name="password" /><br /><br /><br/>
			
 	<input type="submit" value="SUBMIT" ><br /><br/>
 	
	<a href=createdoctor.html target="body">Click Here</a>, To Create New Account
	</form>
</body>
</html>