<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "menu.jsp" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
	<form action="sendEmail" method="post">
		<pre>
			To:     <input type="text" name="to" value="${email}"/>
			Subject:<input type="text" name="sub""/>
			Compose:
				<textarea  name="emailBody" rows="40" cols="50">
				</textarea>
				<input type="submit" value="compose"/>
		</pre>
	</form>
</body>
</html>