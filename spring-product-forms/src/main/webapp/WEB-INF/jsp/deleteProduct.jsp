<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Product</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Delete product</h3>

	<div id="deleteProduct">
		<form:form action="/deleteProduct" method="get" modelAttribute="hos">
			<p>
				<label>Enter Product Id</label>
				<form:input path="prod_id" />
			</p>
			
		<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>