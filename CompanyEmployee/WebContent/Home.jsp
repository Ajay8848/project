<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<style>
.container {
  margin-top: 30px;
  margin-bottom: 100px;
  margin-right: 100px;
  margin-left: 100px;
}
h3 {

	font-size: 50px;
}
a {
 font-size: 15px;
}
</style>
</head>
<body >
<div class="container">
		<h3 class="text-center text-info">!!! ---- Welcome ---- !!!</h3>
		<form action="login" method="post">
		<div class="form-group">
		<nav>
			<a href="register.jsp" class="btn btn-primary" role="button" aria-pressed="false">Registration of New Employee</a>&nbsp;
		
			<a href="EmployeeList.jsp" class="btn btn-warning" role="button" aria-pressed="false">View Employee Details</a>&nbsp;
		
			<a href="LoginEmployee.jsp" class="btn btn-success" role="button" aria-pressed="false">Login for Employee</a>&nbsp;

			<a href="logout.jsp" class="btn btn-danger" role="button" aria-pressed="false">Logout</a>
		</nav>
		</div>
	</form>
</div>
</body>
</html>