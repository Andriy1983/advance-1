<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="addAuthorModel" action="addNewAuthor" method="post">
		<form:input type ="hidden" path="id" />
		<form:input path="name" required="required"/>
		<form:input path="surname" required="required"/>
		<input type="submit">
	</form:form>



</body>
</html>