<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>Search Case By ID</title>
</head>
<body>
<form action="SearchCaseServlet" method="post">
	<label>Enter Case Id</label>
	<br />
	<br />
	<input type="text" name="caseid">
	<br />
	<br />
<input type="submit" value="Search"/>
</form>
</body>
</html>