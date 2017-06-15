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
<title>Create Skills List</title>
</head>
<body>
<h2>Create Skills List</h2>

<p class=error>${error}</p>

<div><p>${message}</p></div>

<h4>Please input your applicable work skills.<br>
Please enter 1 skill at a time. You must input 1 and no more than 20<br>
Adding more than 20 will result in the earliest inputs being deleted</h4>
<h4>The skill will include the desired skill and a skill rating<br>
The available ratings are 'familiar','intermediate', 'proficient', and 'expert'<br>
Please check the box each time if you would like to continue adding more experiences<br>
</h4>

<form action="CreateSkills" method="post">

 <br>Skill Name:
 <input type="text" name="skillName">
 
 <br>Skill Rating:
 <input type="text" name="skillRating">
 <br>
 <input type="checkbox" name="continue" value="">
  I would like to add more skills
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