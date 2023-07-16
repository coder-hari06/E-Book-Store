<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register to Login</title>
<style>
body{
	font-family:Arial,Helvetica, sans-serif;
	background-color: white;
}
.container{
	padding: 16px;
	background-color: white;
	
}
.registerbtn{
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}
* {
	box-sizing: border-box;
}
.registerbtn{
	opacity: 1;
}
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
</style>	
</head>
<body>	
		<h1> Employee Registration form</h1>
		<p>Please fill in this form to create an account.</p>
		<form action="log" method="post">
			<div class="container">
			<label> Id  <input type = "text" placeholder = "Enter your Id" name ="id"></label> <br>
			<label> Name <input type = "text" placeholder = "Enter your Name" name ="name"> </label> <br>
			<label> Phone Number <input type = "text" placeholder = "Enter your Phone" name ="phone"> </label> <br>
			<label> Location <input type = "text" placeholder = "Enter your Loc" name ="loc"> </label> <br>
			<label> Job <input type = "text" placeholder = "Enter your Job" name ="job"> </label> <br>
			<label> Salary <input type = "text" placeholder = "Enter your Salary" name ="sal"></label> <br>
			<label> Password <input type = "password" placeholder = "Enter your Password" name ="pass"></label> <br>
			<input class = "registerbtn" type="submit">
			</div>
		</form>
	
</body>
</html>