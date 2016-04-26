<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<title>New Case</title>
</head>
<body>
<form action="createcase.html" method="post" >
<div align="justify">
	<h2>Create New Case</h2>


	<label>Description:</label>
	<br />
	<textarea rows="4" cols="20" name="description" />
	</textarea>
	<br />
	<br />
		<label>Symptoms:</label>
	<br />
	<textarea rows="4" cols="20" name="symptoms" />
	</textarea>
	<br />
	<br />
	
	<tr>
			<td>IMAGE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td><input type="file" name="image" id="image"/></td>
		</tr>

	
	<label>Status</label>
	 <select name="status">
	<option selected="Not Assigned">Not Assigned</option>
	<option value="assigned">Assigned</option>
	<option value="progress">Progress</option>
	<option value="finished">Finished</option>
	  </select>
	  <br/>
	  <br/> 
	<!--   
	<h2>Attachments</h2>
	<br />
	<label>Attachment ID:</label>
	<input type="text" name="name">
	<br /><br />
	
	
	<label>Select Image To Be Uploaded:</label>
	<form action="" method="post" enctype="multipart/form-data">
	<input type="file" name="userfile"><br>
	<input type="submit" name="uploadimg" Value="Upload Image">
	</form>
	<br>
		
	<label>Select Video To Be Uploaded:</label>
	<form action="" method="post" enctype="multipart/form-data">
	<input type="file" name="userfile"><br>
	<input type="submit" name="uploadvid" Value="Upload Video">
	</form>-->
	<br> 
	
	<input type="submit" value="Create">
	<!-- <a href="viewcases.jsp" target="body" class="button" style="background-color: #066270;">Submit</a> -->
</div>
</form>
</body>
</html>