<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link type="text/css" rel="stylesheet"
	href="bootstrap/css/bootstrap.min.css" />

<title>Login Page</title>
</head>
<body>
	<div class="container-fluid">
		<!-- Header -->
		<div class="row">
			<div class="col-md-12"></div>
			<h1>
				EVERGREEN PTE LTD<br/> <small>Employee Database</small>
			</h1>


		</div>
		<!-- Header ends-->

		<!-- Body -->
		<div class="row"></div>
		<!-- Section Left -->
		<div class="col-md-8">
			<h3>HR Login</h3>
			<form method="post" action="login">
				<table>
					<tr>
						<!-- Table Row -->
						<td>Username</td>
						<td><input type="text" name="user" size="30" required /></td>
					</tr>
					<tr>
						<!-- Table Row -->
						<td>Password</td>
						<td><input type="password" name="passwrd" size="30" required /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><button type="submit"
								class="btn btn-primary">Login</button>
								<button type="reset" class="btn btn-danger">Clear</button></td>
								
					</tr>


					<!-- table data -->
				</table>
			</form>
		</div>
		<!-- right section -->
		<div class="col-md-4"></div>
		<!-- body ends-->

		<!-- footer -->
		<div class="row"></div>
		<div class="col-md-12">
			<p>Created By I.T. Consultancy &copy;</p>
		</div>
		<!-- Footer ends-->
	</div>

</body>
</html>