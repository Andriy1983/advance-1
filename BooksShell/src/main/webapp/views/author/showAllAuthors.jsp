<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="toAddAuthor">добавить автора</a>
		</p>
</security:authorize>

<table>
<tr><td>Фамилия</td><td>Имя</td><td>Действие</td></tr>
<c:forEach items="${authors}" var="author">
<tr>
	<td>${author.surname}</td>
	<td>${author.name}</td>
	<td>
		<security:authorize access="hasRole('ADMIN')">
			<a href = "modifyAuthor-${author.id}">Modfy</a>
			<a href="deleteAuthor-${author.id}">delete</a>
		</security:authorize>
		<a href="booksListOfAuthor-${author.id}">booksList</a>
	</td>
</tr>
</c:forEach>

</table>

</body>
</html>