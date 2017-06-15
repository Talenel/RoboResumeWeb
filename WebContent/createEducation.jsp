<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Education</title>
<style>
p.error{
	color: red;
	font-weight: bold;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Customers and Selection</title>
</head>
<body>
<h2>Display Customers and Selection</h2>

<p class=error>${error}</p>

<div><p>${message}</p></div>

<h4>Please input your educational experiences.</h4>
<h4>Please enter 1 experience at a time. You must input at least 1 and no more than 10</h4>
<h4>Adding more than 10 will result in the earliest inputs being deleted</h4>
<h4>The experience will include the School, Year Graduated, Degree type awarded and Major</h4>
<h4>Please check the box each time if you would like to continue adding more experiences</h4>

<form action="CreateEducation" method="post">

 <br>College:
 <input type="text" name="college">
 
 <br>Year Graduated:
 <input type="text" name="yearGrad">
 <br>
 Degree Type Awarded (e.g.:BS,MS):
 <input type="text" name="degType">
 <br>
 Degree Major:
 <input type="text" name="degMajor">
 <br>
 <input type="checkbox" name="continue" value="">
  I would like to add more educational experiences
  <br>
  <input type="submit">
  <input type="reset" value="Clear"/>
  
  
</form>
<br>
<br>
<br>
<a href="http://localhost:8080/RoboResumeWeb/createPerson.html" class="btn btn-default">Home</a>

</body>
</html>