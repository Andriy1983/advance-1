<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>HEADER</h2>
<security:authorize access="isAuthenticated()">
	<form action="/logout" method="post">
		<input type="submit" value="asfd">
		
		<input type="hidden" name="${_csrf.parameterName}"	
		value="${_csrf.token}"/>
			
	</form>
	</security:authorize>
</body>
</html>