<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>newauthor</title>
</head>
<body>
<form:form  modelAttribute="readyAuthorAtribute" action="addNewAuthor" method="post" >
	<form:input path="name" />
	<form:input path="surname" />
	<input type="submit"/>
</form:form>


</body>
</html>