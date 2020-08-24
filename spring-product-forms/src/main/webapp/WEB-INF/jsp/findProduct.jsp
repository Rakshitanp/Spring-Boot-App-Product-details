 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Product</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Find doctor</h3>

	<div id="findProduct">
		<form:form action="/found" method="get" modelAttribute="hos">
			<p>
				<label>Enter Product Id</label>
				<form:input path="prod_id" />
			</p>
			
		<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>