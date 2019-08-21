<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>main</title>
</head>
<body>
<h1>
	로그인 화면  
</h1>
<form action="login" method="post">
아이디:<input type="text" name="userid"><br>
비번:<input type="text" name="passwd"><br>
<input type=submit value="로그인">

</form>

</body>
</html>
