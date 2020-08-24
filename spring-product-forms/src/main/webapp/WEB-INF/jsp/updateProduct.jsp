 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update product</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Update product Details</h3>

	<div id="updateProduct">
		<form:form action="/updateProduct" method="get" modelAttribute="hos">
			<p>
				<label>Enter product Id</label>
				<form:input path="prod_id" />
			</p>
			<p>
				<label>Enter name</label>
				<form:input path="prod_name" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>