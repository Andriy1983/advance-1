<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="BookModelAtribute" action="addNewBook"
		method="post">
		<br> 
		<form:input type="hidden" path="id" />
		<form:errors path="id"></form:errors>
		<br> 
		<form:errors path="title"></form:errors>
		<form:input path="title" />
		<br> 
		<form:input path="description" />
		<br> 
		<form:input path="year" />
		<br> 
		<form:select path="authors">
			<c:forEach items="${authors}" var="author">
				<option value="${author.id}">
					${author.name}
					${author.surname}
				</option>
			</c:forEach>
		</form:select>
		<br> 
		<input type="submit">
	</form:form>



	<%-- 	<form action="addNewBook" method="post"> --%>
<%-- 		<input type="hidden" value="${book.id}" name="id"> --%>
<%-- 		<input type="text" name="title" required value="${book.title}"> --%>
<!-- 		<br> -->
<!-- 		<textarea rows="5"  cols="5" name="description" required></textarea> -->
<!-- 		<br> -->
<!-- 		<input type="text" name="year" required> -->
<!-- 		<br> -->
		
<!-- 		<select name="multiselect" multiple="multiple" size="5" required> -->
<%-- 			<c:forEach items="${authorsList}" var="author"> --%>
<%-- 				<option value="${author.id}">${author.name} ${author.surname}</option> --%>
<%-- 			</c:forEach> --%>
		
<!-- 		</select> -->
<!-- 		<input type="submit"> -->
<!-- 		<input type="hidden" -->
<%-- 			name="${_csrf.parameterName}" value="${_csrf.token}" /> --%>
<%-- 	</form> --%>


</body>
</html>