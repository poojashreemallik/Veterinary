<%-- <%@page import="org.ndt.model.Case"%> --%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>View Case</title>
</head>
<body>
<form action="createcase.html" method="post">
<h2 align="center">Client Details</h2><hr/>
			
	<div align="center">
<br />
		<label>Prescribe:</label>
	<br />
	<textarea rows="4" cols="20" name="symptoms" />
	</textarea>
	<br />
	
	<input type="submit" value="Submit">
	
	

</body>
</html>