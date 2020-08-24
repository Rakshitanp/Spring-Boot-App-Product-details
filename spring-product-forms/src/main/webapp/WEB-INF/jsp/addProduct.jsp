<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Departmentf</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New department</h3>

	<div id="addDepartment">
		<form:form action="/addDepartment" method="post" modelAttribute="hos">
			<p>
				<label>Enter department Id</label>
				<form:input path="prod_id" />
			</p>
			<p>
				<label>Enter department name</label>
				<form:input path="prod_name" />
			</p>
			<p>
				<label>Enter doctor id</label>
				<form:input path="prod_code" />
			</p>
			<p>
				<label>Enter doctor name</label>
				<form:input path="prod_type" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
