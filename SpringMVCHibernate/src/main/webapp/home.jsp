<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Akash</h1>

<form:form action="send" method="get" modelAttribute="MvcUser" commandName="MvcUser"  >

Enter Name :<input type = "text" path = "name" name = "userName"/><br>
Enter Age : <input type = "text" path = "age" name = "userAge"/><br>
Enter Email : <input type = "email" path = "email" name = "userEmail"/><br>

<input type = "submit" value="SUBMIT -->>">

</form:form>
</body>
</html>