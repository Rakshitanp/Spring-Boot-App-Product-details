<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="menu.jsp" />
<title>Found!</title>
</head>
<body>
	<div>
	<ul>
		<c:forEach var="listValue" items="${products}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
	</div>
</body>
</html>