<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 900px;}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
      min-height: calc(100vh - 105px);
    }
    .content {
    min-height: calc(100vh - 105px);
    /* 80px header + 40px footer = 120px  */
}
    
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 25px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
form{

	margin-left:50px;

}

input.button{
	margin-left:120px;
}
h3.error{
	color: red;
	font-weight: bold;
}
p.error{
	color: red;
	font-weight: bold;
}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a Work Experience!</title>
</head>
<body>
<div class="content">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="http://localhost:8080/RoboResumeWeb/createPerson.jsp">Home</a></li>
        <!-- <li><a href="#">About</a></li>-->
        
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      
    </div>
    <div class="col-sm-8 text-left">
		<h2>Enter Work Experiences</h2>
		
		<p class=error>${error}</p>
		
		
		<h4>Please input your work experiences.<br>
		Please enter 1 experience at a time. You may input 0 and no more than 10.<br>
		Adding more than 10 will result in the earliest inputs being deleted</h4>
		<h4>If you would like to not add an experience, or have finished adding experiences, <br>
		please check the box and leave everything else blank.</h4>
		
		<h4>The experience will include the job title, company worked for, and the start and end month and year for that job<br>
		You will then be directed to a page to input the number of duties you had in the job</h4>
		
				
		 <br>
		  <form action="CreateWorkExp" method="post">
		   <br>
		   <div class="form-group">
	      	<label for="title">Job Title:</label>
	      	<input type="text" class="form-control" id="title" placeholder="Enter job title" name="title">
	       </div>
	       <br>
	       <div class="form-group">
	      	<label for="company">Company:</label>
	      	<input type="text" class="form-control" id="company" placeholder="Enter the company you worked for" name="company">
	       </div>
		   <br>
		   <div class="form-group">
	      	<label for="start">Start Month and Year </label>
	      	<input type="month" class="form-control" id="start" placeholder="Enter the start Month and Year (e.g. May 2010):" name="start">
	       </div>
	       <br>
	       <div class="form-group">
	      	<label for="end">End Month and Year</label>
	      	<input type="month" class="form-control" id="end" placeholder="Enter the end Month and Year (If current job, enter 'Present'):" name="end">
	       </div>
		   <br>
		   <label><input type="checkbox" name="continue" value=""> I would like to add no more work experiences</label>
		   
		   <br>
		   <input type="submit">
		   <input type="reset" value="Clear"/>
		  </form>
		 
		<br>
		<br>
		<br>
	</div>
    <div class="col-sm-2 sidenav">
      
    </div>
  </div>
</div>
<footer class="container-fluid text-center">
  
</footer>
</div>

</body>
</html>