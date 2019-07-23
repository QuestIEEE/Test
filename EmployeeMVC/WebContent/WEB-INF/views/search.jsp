<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<br>
<br>
<form action="search">
<input name="id" type="text" ></input>
<input type="submit" value="Search"></input>
</form>
${student}
</body>
</html>