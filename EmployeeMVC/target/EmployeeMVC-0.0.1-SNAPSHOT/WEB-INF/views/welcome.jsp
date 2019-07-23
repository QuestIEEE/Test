<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Greeting : ${greeting}
<a href="helloagain">show</a>
<form method="get" action="addstudent">
<input type="text" name="id" placeholder="ID"></input><br>
<input type="text" name="name" placeholder="NAME"></input><br>
<input type="text" name="age" placeholder="AGE"></input><br>
<input type="submit" value="AddStudent"></input>
</form>
</body>
</html>