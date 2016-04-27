<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%--<style>
  	 <%@include file="/WEB-INF/viewe/css/main.css" %>
</style>
 --%>

</head>
<body>
newjsp.jsp

<%for(int x =0;x<10;x++) {%>

	<%int i = 100; %>
	${key}
	<br>	
	<%=i %>
	
<%} %>

</body>
</html>