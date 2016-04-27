<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${prosba }</h2>
	<form action="joinForm" method="post">



		<select name="selectedAuthor">
			<c:forEach var="author" items="${authors}">
				<option value="${author.id }">
					${author.name }
					${author.surname }
				</option>
			</c:forEach>
		</select> <select name="selectedBook">
			<c:forEach var="book" items="${books }">
				<option value="${book.id_book}">
					${book.title}
				</option>
			</c:forEach>
		</select>

	<input type="submit">
	</form>


</body>
</html>