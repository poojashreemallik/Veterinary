<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<h1>Spring MVC internationalization example</h1>

Language : <a href="?lang=en">English</a>|<a href="?lang=zh_KN">Kannada</a>

<h2>
welcome.springmvc : <spring:message code="welcome.springmvc" text="Spring MVC" />
</h2>

Current Locale : ${pageContext.response.locale}



<%-- <%=RequestContext.getLocale()%>

 --%>	<%-- <table>
        <tr>
            <c:forEach var = "listValue" items = "${list}">
            <td>
                <c:out value="${listValue.comment}"/>
            </td>
            </c:forEach>
        </tr>
	</table> --%>
	
	<p> ${msg } </p>
		<p> ${msg } </p>
			<p> ${msg } </p>
			
	
	<table border="1">
			<tr>
				<td>Symtoms</td>
			</tr>
			
			
			<c:forEach items="${list}" var="std">
			<tr>
				<td> ${std.comment}</td>
			</tr>	
			</c:forEach>
			
		</table>


</body>
</html>