<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function validate() {
		var name = document.loginForm.userName.value;
		if (name == null || name == "") {
			alert("Enter Name");
			return false;
		}
	}
</script>
</head>
<body>
	<h1>Hello Akash</h1>

	<form:form name="loginForm" action="send" method="get"
		modelAttribute="MvcUser" commandName="MvcUser"
		onsubmit="return validate()">

Enter Name :<input type="text" path="name" name="userName" />
		<br>
Enter Age : <input type="text" path="age" name="userAge" />
		<br>
Enter Email : <input type="email" path="email" name="userEmail" />
		<br>

		<input type="submit" value="SUBMIT -->>">

	</form:form>
</body>
</html>