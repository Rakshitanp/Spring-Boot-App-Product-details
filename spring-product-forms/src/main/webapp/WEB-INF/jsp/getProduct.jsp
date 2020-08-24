<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show products and their types</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">Show All Types</h3>
	<ul>
		<c:forEach var="listValue" items="${products}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>