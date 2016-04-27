<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>INDEX</h1>


	<form action="addAuthor" method="post">
		<input type="text" name="authorName"> <input type="text"
			name="authorSurname"> <input type="submit">
	</form>
	<br>
	<a href="showAllAuthors">showAllAuthors</a>
	<br>
	<img alt="" src='<c:url value="/resources/images/tom.jpg"></c:url>'>
	<br>
	<a href="authorsWithBook">authorWithBook</a>

<%-- 
	<form:form action="springForm" method="post"
		modelAttribute="springFormModelAtribute">
		<form:input path="name" />
		<form:input path="surname" />
		<input type="submit" />
	</form:form>
	
	--%>
</body>
</html>