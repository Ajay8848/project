<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="bean.Employee,model.Dboperations"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>BigBull</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
	
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<%
		System.out.println(Integer.parseInt(request.getParameter("emp_id")));
		int emp_id = Integer.parseInt(request.getParameter("emp_id"));
		Dboperations db = new Dboperations();

		Employee e = db.getEmployeeById(emp_id);
	%>
	<div class="main">

		<section class="signup">
			<!-- <img src="images/signup-bg.jpg" alt=""> -->
			<div class="container">
				<div class="signup-content">

					<form action="./Update" method="post">

						<div class="form-group">

							<input type="hidden" name="emp_id" class="form-control"
								value="<%=e.getId()%>" />
						</div>
						<div class="form-group">
							<label>Name</label> <input type="text" name="emp_name"
								class="form-control" value="<%=e.getName()%>" />
						</div>
						<div class="form-group">
							<label>Address</label> <input type="text" name="emp_address"
								class="form-control" value="<%=e.getAddress()%>" />
						</div>
						<div class="form-group">
							<label>Contact</label> <input type="text" name="emp_contact"
								class="form-control" value="<%=e.getContact()%>" />
						</div>
						<div class="form-group">
							<label>Department</label> <input type="text" name="emp_Dept"
								class="form-control" value="<%=e.getDepartment()%>" />
						</div>
						<div class="form-group">
							<label>Salary</label> <input type="text" name="emp_salary"
								class="form-control" value="<%=e.getSalary()%>" />
						</div>
						<div class="form-group">
							<label>Email_Id</label> <input type="text" name="emp_email"
								class="form-control" value="<%=e.getE_mail()%>" />
						</div>
						<div class="form-group">
							<label>User Name</label> <input type="text" name="emp_uname"
								class="form-control" value="<%=e.getUsername()%>" />
						</div>
						<div class="form-group">
							<label>Password</label> <input type="password"
								name="emp_password" class="form-control"
								value="<%=e.getPassword()%>" />
						</div>
						<div class="form-group text-center">
							<input type="submit" class="btn btn-outline-info"
								style="width: 200px" name="Update" value="Update" />
						</div>
					</form>
				</div>
			</div>
			</section>
	</div>
	<div class="text-center">
		<a href="index.html" class="btn btn-info btn-lg active" role="button"
			aria-pressed="false">Home page</a>
	</div>
</body>
</html>
