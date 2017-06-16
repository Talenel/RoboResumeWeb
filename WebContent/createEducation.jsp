<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Create a Resume!</title>
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
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Education</title>
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
		<h2>Create Education</h2>
		
		<h3 class=error>${error}</h3> 
		
		
		<h4>Please input your educational experiences.</h4>
		<h4>Please enter 1 experience at a time. You must input at least 1 and no more than 10</h4>
		<h4>Adding more than 10 will result in the earliest inputs being deleted</h4>
		<h4>The experience will include the School, Year Graduated, Degree type awarded and Major</h4>
		<h4>Please check the box each time if you would like to continue adding more experiences</h4>
		
		<form action="CreateEducation" method="post">
		
		 <br>
		 <div class="form-group">
	      <label for="college">College Name:</label>
	      <input type="text" class="form-control" id="college" placeholder="Enter name of college" name="college">
	     </div>
		 
		 
		 <br>
		 <div class="form-group">
	      <label for="yearGrad">Year Graduated:</label>
	      <input type="number" min="1900" max="2100" value="2000" class="form-control" id="yearGrad" placeholder="Enter the year you graduated" name="yearGrad">
	     </div>
		 
		 <br>
		 <div class="form-group">
	      <label for="degType">Degree Type:</label>
	      <input type="text" class="form-control" id="degType" placeholder="Enter degree type awarded (e.g.:BS,MS):" name="degType">
	     </div>
		 <br>
		 <div class="form-group">
	      <label for="degMajor">Degree Major:</label>
	      <input type="text" class="form-control" id="degMajor" placeholder="Enter major of degree:" name="degMajor">
	     </div>
		 <br>
		 <label><input type="checkbox" name="continue" value=""> I would like to add more educational experiences</label>
		 
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
</div>
<footer class="container-fluid text-center">
  
</footer>

</body>
</html>