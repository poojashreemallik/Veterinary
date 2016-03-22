<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ><!-- html tag open -->
<head><!-- head tag open -->
<title>Department of Animal Husbandry &amp; Veterinary Services, Government of Karnataka</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta name="ROBOTS" content="index,follow,archive" />
<link href="resources/en-stylesheet.css" rel="stylesheet" type="text/css" />
<link href="resources/style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="resources/jquery_min.js"></script>
<script type="text/javascript" src="resources/fadeslideshow.js">
/***********************************************
* Ultimate Fade In Slideshow v2.0- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit Dynamic Drive at http://www.dynamicdrive.com/ for this script and 100s more
***********************************************/
</script>
<script type="text/javascript" src="resources/fadeslideshow_en-content.js"></script>
</head><!-- head tag close -->
<body><!-- body tag open -->
<div id="preload"><img src="resources/en-wait.gif" alt="" title="" /><img src="resources/seperator.gif" alt="" title="" /></div><!-- preloading image -->
<div align="center"><!-- align webpage center open -->
<div id="wrapper" class="textJustify"><!-- wrapper open -->
<div id="header"><!-- header open -->

<div class="tophead_right">
<a href="login.jsp" class="loginlinks">Sign In</a>
<a href="register.jsp" class="loginlinks">Register</a>   
</div>


<h1>RURAL E-VET </h1>
<div class="clear"></div><!-- Clear Floating divs -->
<div id="menu"><!-- menu open -->
	<ul>
		<li><a href="en-home.html" class="sep">Homes</a></li>
		<li><a href="en-intro.html" class="sep">Department</a>
			<ul>
				<li><a href="en-intro.html" class="top">Introduction</a></li>
				<li><a href="en-citizenscharter.html" class="top">Citizens' Charter</a></li>
				<li><a href="en-administration.html">Administration</a></li>
				<li><a href="en-breedingpolicy.html">Breeding Policy</a></li>
		   </ul>
		</li>
		<li><a href="en-vetservices.html" class="sep">Institutions</a>
			<ul>
				<li><a href="en-vetservices.html" class="top">Veterinary</a></li>
				<li><a href="en-training.html">Training Centre</a></li>
				<li><a href="en-farms.html">Breeding Farm</a></li>                
				<li><a href="en-semenstations.html">Frozen Semen Station</a></li>
				<li><a href="en-otherinstitutions.html">Others Institutions</a></li>
                </ul>
		</li>
		<li><a href="en-annualplan.html" class="sep">Programs</a>
			<ul>
				<li><a href="en-annualplan.html" class="top">Annual Plan</a></li>
				<li><a href="en-developmentactivity.html">Development Activity</a></li>
				<li><a href="en-schemesbenefits.html">Schemes &amp; Benefits</a></li>
				<li><a href="pdf/women development-physical handycapped.pdf">Women Development &amp; handicap</a></li> 
            </ul>
			</li>
		<li><a href="en-annualreport.html" class="sep">Reports</a>
			<ul>
				<li><a href="en-annualreport.html" class="top">Annual Report</a></li>
				<li><a href="en-mpicreport.html">MPIC</a></li>
				<li><a href="en-kdpreport.html">KDP</a></li>                
            </ul>
		</li>
		<li><a href="en-statistics.html" class="sep">Statistics</a></li>
		<li><a href="en-rtidoc.html" class="sep">Documents</a>
			<ul>
                <li><a href="en-rtidoc.html" class="top">RTI</a></li>
				<li><a href="en-legislationdoc.html">Acts/Legislations</a></li>
				<li><a href="en-notificationdoc.html">Notifications</a></li>                
            </ul>
		</li>
		<li><a href="en-contact.html" class="sep">Contact</a>
			<ul>
                <li><a href="en-contact.html" class="top">Head Office</a></li>
                <li><a href="en-contactdds.html">District Officers</a></li>
                <li><a href="en-contactfarms.html">Livestock Farms</a></li>
                <li><a href="en-contactothers.html">Sister Organizations</a></li>
            </ul>
		</li>
		<li><a href="kn-home.jsp">ಕನ್ನಡ‌</a></li>
	</ul>
</div><!-- menu close -->
<div class="clear"></div><!-- Clear Floating divs -->
<div id="fadeshow"></div>
</div><!-- header close -->

<br><br><br>

<div align="center">
	<form:form action="login.html" method="post" >
	<form:errors path="*"/>
	<br/><br/>	
	
		<form:label path="email">User ID</form:label>
		<form:input path="email"/>
		<br/>
		<form:label path="password">Password</form:label>
		<form:password path="password"/>
		<br/>
		
		<!-- UserName<input type="text" name="email" id="email"><br><br>
		Password<input type="text" name="password" id="password"> -->
		
		<input type="submit"/>
	</form:form>
	
	<%-- <form action="login.html" method="post">
		UserName<input type="text" name="email" id="email"><br><br>
		Password<input type="text" name="password" id="password">
		
		<input type="submit"/>
	</form>
	 --%>
</div>
</div><!-- wrapper close --> 
</div><!-- align webpage center close -->
</body><!-- body tag close -->
</html><!-- html tag close -->