<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Work Experience</title>
<style>
p.error{
	color: red;
	font-weight: bold;
}
td.col1{

	line-height:180%;
}
div.format1{
	line-height:160%;
}

td.col2{

	

}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Customers and Selection</title>
</head>
<body>
<h2>Enter Work Experiences</h2>

<p class=error>${error}</p>

<div><p>${message}</p></div>

<h4>Please input your work experiences.<br>
Please enter 1 experience at a time. You may input 0 and no more than 10.<br>
Adding more than 10 will result in the earliest inputs being deleted</h4>
<h4>If you would like to not add an experience, or have finished adding experiences, <br>
please check the box and leave everything else blank.</h4>

<h4>The experience will include the job title, company worked for, and the start and end month and year for that job<br>
You will then be directed to a page to input the number of duties you had in the job</h4>

<table>

<tr>
 <td class="col1">
  Job Title:<br>
  Company:<br>
  <div class="format1">Start Month and Year (e.g. May 2010):<br>
  End Month and Year (If current job, enter 'Present'):<br></div>
  
 </td>
 <td>
 
 <br>
  <form action="CreateWorkExp" method="post">
   <br>
   <br>
   <input type="text" name="title"><br>
   <input type="text" name="company"><br>
   <input type="text" name="start"><br>
   <input type="text" name="end"><br>
   <input type="checkbox" name="continue">
   I would like to add no more work experiences
   <br>
   <input type="submit">
   <input type="reset" value="Clear"/>
  </form>
 </td>

</tr>
</table>
<br>
<br>
<br>
<a href="http://localhost:8080/RoboResumeWeb/createPerson.html" class="btn btn-default">Home</a>

</body>
</html>