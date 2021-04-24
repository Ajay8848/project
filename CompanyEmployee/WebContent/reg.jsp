<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="bean.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
    
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
    
</head>
<body>

    <div class="main">

        <section class="signup">
            <!-- <img src="images/signup-bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form action="./Reg" method="POST" id="signup-form" class="signup-form">
                        <h2 class="form-title">Create account</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_id" id="id" placeholder="Your ID"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_name" id="name" placeholder="Your Name"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_address" id="address" placeholder="Your Address"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_contact" id="contact" placeholder="Your Contact"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_Dept" id="department" placeholder="Your Department"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_salary" id="salary" placeholder="Your Salary"/>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-input" name="emp_email" id="email" placeholder="Your E-mail"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_uname" id="uname" placeholder="User Name"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="emp_password" id="password" placeholder="Password"/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="re_password" id="re_password" placeholder="Repeat your password"/>
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                        </div>
                        <div class="form-group">
                        	<span class=""></span>
                            <input type="submit" name="submit" id="submit" class="form-submit" value="Sign up"/>
                            
                        </div>
                    </form>
                    <p class="loginhere">
                        Have already an account ? <a href="EmployeeLogin.html" class="loginhere-link">Login here</a>
                    </p>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main1.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>