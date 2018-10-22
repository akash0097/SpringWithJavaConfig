<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function validate() {
		document.write.console("Java Script file");
		var name = document.loginForm.userName.value;
		var age = document.loginForm.age.value;
		var email = document.loginForm.email.value;
		
		if (name == null || name == "") {
			alert("fill the details");
			return false;
		}
	}
</script>
</head>
<body>
	<h1>Welcome User</h1>

	<form:form  name="loginForm" action="send" method="post" commandName="User"  onsubmit="validate()">

<label>Enter Name :</label><form:input type="text" path="name" name= "userName"/>
		<br>
<label>Enter Age : </label><form:input type="text" path="age" name = "age"/>
		<br>
<label>Enter Email : </label><form:input type="email" path="email" name = "email"/>
		<br>

		<input type="submit" value="SUBMIT -->>">

	</form:form>
</body>
</html>