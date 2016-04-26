<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function jumpto(login,body)
{
	parent.login.location.href=login;
	parent.body.location.href=body;
}
</script>

<li>
				<a href="viewcases.html" target="body" class="button" style="background-color: #066270; padding: 11px 90px;" >View Cases</a>
			</li>
			<br /> <br /> <br /> <br />
			
			<li>
				<a href="casebyid.html" target="login" class="button" style="background-color: #066270; padding: 11px 50px">Case Status</a>
			</li>
			<br /> <br /> <br /> <br />
			
			
			<li>
				<a href="login.html" onclick="jumpto(this.href,'home.jsp'); return false;">Logout</a>
			</li>
		</ul>



</body>
</html>