<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
theText:${uploadDTO.theText}<br>
theFile:<a href="fileDown?fileDown=${uploadDTO.theFile.originalFilename}">${uploadDTO.theFile.originalFilename}</a><br>
</body>
</html>