<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Details</title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="createclient.html" method="post">
<h2 align="center">Client Details</h2><hr/>
			
	<div align="center">

	<label>First Name :</label>
	<input type="text" name="fname" /><br/>
	<br />
	<br />
	<label>Last Name :</label>
	<input type="text" name="lname" /><br/>
	<br />
	<br />
	<label>Adhaar Number :</label>
	<input type="text" name="adhaarnumber" /><br/>
	<br />
	<br />
	<label>Phone :</label>
	<input type="text" name="phone" /><br/>
	<br />
	<br />
	<label>E-mail :</label>
	<input type="text" name="email" /><br/>
	<br />
	<br />
	<label>Address :</label>
	<textarea rows="2" cols="15" name="address"></textarea>
	<br />
	<br />
	
	<input type="submit" value="Submit">
</body>
</html>