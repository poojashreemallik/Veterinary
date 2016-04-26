<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
<script type="text/javascript">
function jumpto(login,body)
{
	parent.login.location.href=login;
	parent.body.location.href=body;
}
</script>
</head>
<body>
<ul>
			<li>
				<a href="createclient.html" target="body" class="button" style="background-color: #066270; padding: 11px 75px">New Client</a>
			</li>
			<br /> <br /> <br /> <br />
			<li>
				<a href="viewcases.html" target="body" class="button" style="background-color: #066270; padding: 11px 80px;" >View Cases</a>
			</li>
			<br /> <br /> <br /> <br />
			<li>
				<a href="createdoctor.html" target="body" class="button" style="background-color: #066270; padding: 11px 80px; " >Add Doctor</a>
			</li>
			<br /> <br /> <br /> <br />
			
		    <li>
				<a href="viewdoctors.html" target="body" class="button" style="background-color: #066270; padding: 11px 75px " >View Doctors</a>
			</li> 
			<br /> <br /> <br /> <br />
			
			<li>
				<a href="casebyid.html" target="body" class="button" style="background-color: #066270; padding: 11px 80px">Search Case</a>
			</li>
			<br /> <br /> <br /> <br />
			
			<li>
				<a href="createcase.html" target="body" class="button" style="background-color: #066270; padding: 11px 90px">New Case</a>
			</li>
			<br /> <br /> <br /> <br />
			
			<li>
				<a href="login.html" class="button" style="background-color: #066270; padding: 11px 100px" onclick="jumpto(this.href,'home.html'); return false;">Logout</a>
			</li>
		</ul>

</body>
</html>