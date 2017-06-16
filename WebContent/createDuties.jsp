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
<title>Create a list of Duties!</title>
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
		<h2>Create a List of Duties</h2>
		
		<p class=error>${error}</p>
		
		
		
		<h4>Please input your duties in this job.</h4>
		<h4>Please enter 1 duty at a time. You must input at least 1 duty </h4>
		<h4>Each duty is simply a brief basic description of that duty for the job</h4>
		<h4>Please check the box each time if you would like to continue adding more duties</h4>
		
		<form action="CreateDuties" method="post">
		
		 <div class="form-group">
	      	<label for="dutyDesc">Description of Duty:</label>
	      	<input type="text" class="form-control" id="dutyDesc" placeholder="Enter a brief description of the duty" name="dutyDesc">
	     </div>
		 
		 <br>
		 <label><input type="checkbox" name="continue" value="">I would like to add more duties</label>
		  
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