<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>

<!-- <script language="" src="resources/js/common.js"></script>
<script src="resources/js/kannada.js"></script> -->

<SCRIPT language=JavaScript src="http://www.higopi.com/script/ucedit/common.js"></SCRIPT>
<SCRIPT language=JavaScript src="http://www.higopi.com/script/ucedit/kannada.js"></SCRIPT>

</head>
<body>
	
	<form action="test.html" method="post">
	<textarea name="comment" charset="utf-8" onKeyDown="toggleKBMode(event)" onKeyPress="javascript:convertThis(event)"></textarea>
	<input type="submit">
	
	</form>
	
	<input type=radio name=keybrd value=roman onclick="toggleKBMode(event,this)" checked>
	Phonetic <br>
	<!-- <input type=radio name=keybrd value=typewriter onclick="toggleKBMode(event,this)">
	Kannada Inscript Typewriter<br>
	
	<input type=checkbox onclick="showMap(this)"> Show Keymap<br>
	
	<input type=checkbox onclick="showHelp(this)" checked="true"> Online Keymap Help<br> -->
	
</body>
</html>