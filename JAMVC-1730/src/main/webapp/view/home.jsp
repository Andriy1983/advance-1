<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href='<c:url value=""></c:url>'>
<title>Insert title here</title>
</head>
<body>
HOME

<table>
<c:forEach items="${key}" var="author" >
	<tr>
		<td>${author.id}  aa</td>
		<td><a href="author-${author.id}" style="color: red">${author.name}</a></td>
	</tr>
	
</c:forEach>
</table>

<br>

</body>
</html>