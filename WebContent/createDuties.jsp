<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Duties</title>
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

<h4>Please input your duties in this job.</h4>
<h4>Please enter 1 duty at a time. You must input at least 1 duty </h4>
<h4>Each duty is simply a brief basic description of that duty for the job</h4>
<h4>Please check the box each time if you would like to continue adding more duties</h4>

<form action="CreateDuties" method="post">

 <br>Description of Duty:
 <br>
 <input type="text" name="dutyDesc">
 
 <br>
 <input type="checkbox" name="continue" value="">
  I would like to add more duties
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