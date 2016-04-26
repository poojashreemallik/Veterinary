<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Veterinary Aid</title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
</head>

<frameset rows="15%,*,5%">
	<frame src="header.jsp" scrolling="no" noresize="noresize" name="head">
	
	
	<frameset cols="25%,*">
		<frame src="login.jsp" noresize="noresize" name="login">
		<frame src="home.jsp" noresize="noresize" name="body">

	</frameset>
	<frame src="footer.jsp" scrolling="no" noresize="noresize" name="foot">
</frameset>
</html>