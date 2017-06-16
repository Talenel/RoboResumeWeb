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
    .row.content {height: 750px;}
    
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
h2.error{
	color: red;
	font-weight: bold;
}

</style>
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
		<h1>Create a Resume!</h1>
		<br>
		<h2 class="error">${error}</h2>
		<br>
		<h4>Enter your first and last name and then your email below:</h4>
		<form action="CreatePerson" method="post">
		
		
		<div class="form-group">
	      <label for="name">User's Name:</label>
	      <input type="text" class="form-control" id="name" placeholder="Enter first and last name" name="name">
	    </div>
	    
	    <div class="form-group">
      	  <label for="email">User's Email:</label>
      	  <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    	</div>
		
		<br>
		<input class="button" type="submit">
		<input type="reset" value="Clear" >
		
		
		</form>
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