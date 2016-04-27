<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<a href="toLoging">to login page</a>
	<br>
	<a href="addAuthor">add author</a>
	<br>
	<a href="showAllAuthors">show All Authors</a>
	<br>
	<a href="addBook">add Book</a>
	<br>
	<a href="showAllBooks">show All Books</a>
	<br>
	<a href="join">join</a>
	<br>
	<a href="authorWithBooks">author With Books</a>
	<br>
	<security:authorize access="isAuthenticated()">
		<p>крабы захватят мир , почему хутин праб</p>
	</security:authorize>

</body>
</html>