<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="joinForm" method="post">
		<select name="selectedAuthor">
			<c:forEach items="${authors}" var="author">
				<option value="${author.id}">${author.name}
					${author.surname}</option>
			</c:forEach>
		</select> 
		<select name="selectedBook">
			<c:forEach items="${books}" var="book">
				<option value="${book.id_book}">${book.title}</option>
			</c:forEach>
		</select>
		<input type="submit">
	</form>
	
	<br>
	<form action="addBookToAuthor" method="post">
		<select name="selectedAuthor">
			<c:forEach items="${authors}" var="author">
				<option value="${author.id}">${author.name}
					${author.surname}</option>
			</c:forEach>
		</select>
		
		<input type="text" name="title">
	</form>

</body>
</html>