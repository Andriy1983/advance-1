<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		
		<form action="findBooksByTitle">
			<input type="text" name="title">
			<input type="submit">
		</form>
		<p>
			<a href="toAddBook">добавить книгу</a>
		</p>
	

	<table>
		<tr> <td>Название</td><td>Краткое описание</td><td>Год издания</td><td>Авторы</td>	<security:authorize access="hasRole('ADMIN')"><td>Действия</td></security:authorize></tr>
		<c:forEach items="${AllBooks}" var="book">
			<tr>
				<td>${book.title}</td>
				<td>${book.description}</td>
				<td>${book.year}</td>
				<td>
					<c:forEach items="${book.authors}" var="author">
						${author} <br>
					</c:forEach>
				</td>
				<security:authorize access="hasRole('ADMIN')">
					<td><a href = "modifyBook-${book.id}">Модифицировать книгу</a> <a href = "deleteBook-${book.id}">Удалить книгу</a></td>
				</security:authorize>
			</tr> 
		</c:forEach>
		
	</table>
</body>
</html>