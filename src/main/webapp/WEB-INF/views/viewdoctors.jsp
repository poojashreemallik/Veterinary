<%-- <%@page import="org.ndt.model.Doctor"%> --%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>Case Assignment</title>
</head>
<body>
  
  <table border="5" align="center">

 <tr>
			<td>doc Id</td>
			<td>fname</td>
			<td>adhaarnumber</td>
			<td>Phone</td>
			<td>Specialization</td>
			
 </tr>
 
 <c:forEach items="${doctor}" var="doctor">
			<tr>
				<td><c:out value="${doctor.doc_id}"></c:out></td>
				<td><c:out value="${doctor.fname}"></c:out></td>
				<td><c:out value="${doctor.adhaarnumber}"></c:out></td>
				<td><c:out value="${doctor.phone}"></c:out></td>
				<td><c:out value="${doctor.specialization}"></c:out></td>
				<td><a href="viewdoctors.html">Assign</a></td>
			</tr>
 </c:forEach>


</body>
</html>