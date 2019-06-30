<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link type="text/css" rel="stylesheet"
	href="bootstrap/css/bootstrap.min.css" />
<title>Welcome Page</title>
</head>
<body>
<div class="container-fluid">
		<!-- Header -->
		<div class="row">
			<div class="col-md-12"></div>
			<h1>
				Saleh Pizza Shop<br/> <small>Where every pizza is Ibiza!</small>
			</h1>


		</div>
		<!-- Header ends-->
		
		<!-- BODY Starts -->
		<div class="row">
		<div class="col-md-12">
		 <form class="form-horizontal" action="addContact" method="POST">
  <fieldset>
    <div id="legend">
      <legend class="">Fill Your Details below</legend>
    </div>
    <div class="control-group">
      <!-- First Name -->
      <label class="control-label"  for="fname">First Name</label>
      <div class="controls">
        <input type="text" id="fname" name="fname" placeholder="" class="input-xlarge">
       <!--  <p class="help-block">Username can contain any letters or numbers, without spaces</p> -->
      </div>
    </div>
 
 <div class="control-group">
      <!-- Last Name -->
      <label class="control-label"  for="lname">Last Name</label>
      <div class="controls">
        <input type="text" id="lname" name="lname" placeholder="" class="input-xlarge">
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="email">E-mail</label>
      <div class="controls">
        <input type="text" id="email" name="email" placeholder="" class="input-xlarge">
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
 
        <div class="control-group">
      <!-- Mobile -->
      <label class="control-label"  for="mobilenos">Mobile</label>
      <div class="controls">
        <input type="text" id="mobile" name="mobile" placeholder="e.g.1234567" class="input-xlarge">
        <!-- <p class="help-block">Please confirm password</p> -->
      </div>
    </div>
    
    <div class="control-group">
      <!-- Gender -->
      <label class="control-label"  for="gender">Gender</label>
      <div class="controls">        
        <input type="radio" id="gender male" name="gender" value="M" placeholder="" class="input-xlarge">Male
        <input type="radio" id="gender female" name="gender" value="F" placeholder="" class="input-xlarge">Female
        <!-- <p class="help-block">Please confirm password</p> -->
      </div>
    </div>
    
    <div class="control-group">
      <!-- DOB -->
      <label class="control-label"  for="DOB">Date of Birth</label>
      <div class="controls">
        <input type="date" id="DOB" name="DOB" class="input-xlarge">
        <!-- <p class="help-block">Please confirm password</p> -->
      </div>
    </div>
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button type="submit"class="btn btn-success">Add Contact</button>
      </div>
    </div>
  </fieldset>
</form>
		
		</div>
		</div>
		
		
		<!-- BODY ends -->
		<!-- footer -->
		<div class="row"></div>
		<div class="col-md-12">
			<p>Created By Saloooh &copy;</p>
		</div>
		<!-- Footer ends-->
	</div>

</body>


</html>