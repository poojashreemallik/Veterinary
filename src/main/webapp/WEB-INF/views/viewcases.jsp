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
	<table border="5" align="center">

 <tr>
			<td>Case ID</td>
			<td>Description</td>
			<td>Symptoms</td>
			<td>Status</td>	
			<!-- <td>Photo</td> -->	
					
 </tr>
 
 <c:forEach items="${cases}" var="cases" varStatus="loop">
			<tr>
				<td><c:out value="${cases.case_id}"></c:out></td>
				<td><c:out value="${cases.description}"></c:out></td>
				<td><c:out value="${cases.symptoms}"></c:out></td>
				<td><c:out value="${cases.status}"></c:out></td>
				<%-- <td><c:out value="${cases.image}"></c:out></td> --%>
				<td><img src="/evetclinic/imagedisplay?caseId=${cases.case_id}"/></td>
				<td><a href="createcase.html">Edit</a></td>
		        <td><a href="viewdoctors.html">Assign</a></td>
			</tr>
 </c:forEach>

</table>
	
</body>
</html>