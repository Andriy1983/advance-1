<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href='<c:url value="/resources/css/main.css"></c:url>'>
		<title>layout</title>
	</head>
	<body>
		<div>
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>
		<div>
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
	</body>
</html>