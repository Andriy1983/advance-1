<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<security:authorize access="isAuthenticated()">sdfsdf</security:authorize>
	<br>
	<a href="tologin">login</a>
	<br>
	<a href="addAuthor">add author</a>
	<br>
	<a href="showAllAuthors">show All Authors</a>
	<br>
	<a href="addBook">add Book</a>
	<br>
	<a href="showAllBooks">show All Books</a>
	<a href="join">join</a>
	<br>
	<a href="authorWithBooks">author With Books</a>
	
	
	<br>
	<%--<form action="oblojka?_csrf={{csrfToken}}" method="post" enctype="multipart/form-data">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
		<input type="text" name="title">
		<input type="file" name="img">
		<input type="submit">

	</form> --%>
	
	<form:form action="oblojka" modelAttribute="image" method="post" enctype="multipart/form-data">
		<form:input path="title"/>
		<form:input path="file" type="file" />
		<input type="submit">
	</form:form>
	<br>
	<a href="showOblojka">oblojka</a>
</body>
</html>