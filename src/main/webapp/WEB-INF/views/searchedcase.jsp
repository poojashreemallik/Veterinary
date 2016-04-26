<%-- <%@page import="org.ndt.model.Case"%>
<%@page import="java.util.List"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>Searched case</title>
</head>
<body>

	<p align="center">
  <form action="casebyid.html" method="post">
	<label>case_id<input type="text" name="case_id"/></label><br><br>
	<input type="submit" value="search"/>
 </form>
  
  <hr>
  
  <table border="5" align="center">

 <tr>
			<td>case_id</td>
			<td>description</td>
			<td>symptoms</td>
			<td>status</td>
		
			
 </tr>
 
 <c:forEach items="${caselist}" var="caselist">
			<tr>
				<td><c:out value="${caselist.case_id}"></c:out></td>
				<td><c:out value="${caselist.description}"></c:out></td>
				<td><c:out value="${caselist.symptoms}"></c:out></td>
				<td><c:out value="${caselist.status}"></c:out></td>
				
			</tr>
 </c:forEach>
	
	
</body>
</html>