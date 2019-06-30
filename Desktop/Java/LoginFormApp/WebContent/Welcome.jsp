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
			<h3>Welcome <%=session.getAttribute("username") %></h3>

		</div>
		<!-- Header ends-->
		
		<!-- BODY Starts -->
		<div class="row">
		<div class="col-md-12">
		 <a href="AddContactForm.jsp" class="btn btn-primary btn-lg btn-block btn-huge">Add Contact</a><br/>
		  <a href="ContactListing.jsp" class="btn btn-success btn-lg btn-block btn-huge">View Contact</a><br/>
		   <a href="#" class="btn btn-danger btn-lg btn-block btn-huge">Send Birthday Card</a>
		
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