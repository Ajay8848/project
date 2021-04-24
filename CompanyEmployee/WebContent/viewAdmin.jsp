<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="bean.Admin,model.Dboperations,com.servlet.AdminList,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form </title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<%
		Dboperations db = new Dboperations();
		String uname = request.getParameter("ad_uname");
		String pass = request.getParameter("ad_password");
		Admin a = db.getAdmin(uname, pass);
	%>
	<div class="main">

		<section class="signup">
			<!-- <img src="images/signup-bg.jpg" alt=""> -->
			<div class="cont">
				<div class="list-content">
					<table class="table table-responsive table-hover table-bordered">
						<tr style="background-color:hsla(9, 100%, 64%, 0.5)">
							<th>ID</th>
							<th>Name</th>
							<th>Address</th>
							<th>Contact</th>
							<th>Salary</th>
							<th>E-mail</th>
							<th>User Name</th>
							<th>Password</th>
						</tr>
						<tr>
							<td><%=a.getId()%></td>
							<td><%=a.getName()%></td>
							<td><%=a.getAddress()%></td>
							<td><%=a.getContact()%></td>
							<td><%=a.getSalary()%></td>
							<td><%=a.getEmail()%></td>
							<td><%=a.getUsername()%></td>
							<td><%=a.getPassword()%></td>
						</tr>
					</table>
					<div class="text-center">
						<a href="index.html" class="btn btn-lg btn-info"><span class="glyphicon glyphicon-home"></span> Home</a> 
							<a href="./Delete?ad_id=<%=a.getId()%>" class="btn btn-lg btn-danger"><span class="glyphicon glyphicon-trash"></span> Delete</a> 
							<a href="update.jsp?ad_id=<%=a.getId()%>" class="btn btn-lg btn-warning"><span class="glyphicon glyphicon-edit"></span>Edit</a>
							<a href="Admin.jsp" class="btn btn-lg btn-warning"><span class="glyphicon glyphicon-edit"></span>Admin Section</a>
					</div>

				</div>
			</div>
			</section>
	</div>
</body>
</html>