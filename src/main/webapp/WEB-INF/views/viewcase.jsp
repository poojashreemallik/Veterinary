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

 <tr align="center">
			<td align="center">Case ID</td>
			<td align="center">Description</td>
			<td align="center">Symptoms</td>
			<td align="center">Status</td>	
			<td align="center">Photo</td>	
			<td colspan="2" align="center">Action</td>					
 </tr>
 
 <c:forEach items="${cases}" var="cases" varStatus="loop">
 <form action="addprescription.html" method="post">
			<tr>
			
				<td><c:out value="${cases.case_id}"></c:out></td>
				<td><c:out value="${cases.description}"></c:out></td>
				<td><c:out value="${cases.symptoms}"></c:out></td>
				<td><c:out value="${cases.status}"></c:out></td>
				
				<td><img src="/evetclinic/imagedisplay?caseId=${cases.case_id}" width="150px" height="150px"/></td>
				
				<td><textarea rows="4" cols="20" name="prescription"></textarea></td>
				<td><input type="hidden" name="case_id" value="${cases.case_id}"/></td>
				<td><input type="submit" name="prescribe" id="prescribe" value="Prescribe"/><br><br>
				<input type="button" name="clear" id="clear" value="Clear"/></td>
				
			</tr>
  </form>
 </c:forEach>

</table>

</body>
</html>