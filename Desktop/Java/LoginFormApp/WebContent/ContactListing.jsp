<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.project.dao.contact.*"%>
<%@ page import="com.project.domain.Contact"%>
<%@ page import="java.util.ArrayList"%>

<%
	ContactDAO cdao = new ContactDAOImpl();
    ArrayList<Contact> contactList = cdao.getContactList();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link type="text/css" rel="stylesheet"
	href="bootstrap/css/bootstrap.min.css" />
<title>Contact Listings Page</title>
</head>
<body>
	<div class="container-fluid">
		<!-- Header -->
		<div class="row">
			<div class="col-md-12"></div>
			<h1>
				<a href="Login.jsp">Saleh Pizza Shop<br /> <small>Where every pizza is Ibiza!</small>
			</a></h1>
			<h3>
				Welcome
				<%=session.getAttribute("username")%></h3>

		</div>
		<!-- Header ends-->

		<!-- BODY Starts -->
		<div class="row">
			<div class="col-md-12">
				<h1>My Contact List</h1>
				<%
					if (contactList != null && contactList.isEmpty() == false) {
				%>
				<table class="table table-striped">
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email Address</th>
						<th>Mobile Number</th>
						<th>Gender</th>
						<th>Date of Birth</th>
						<th colspan="3" class="text-center">Actions</th>
					</tr>
					<%for(Contact c: contactList){
					%>
					<tr>
					<td><%=c.getFname() %></td>
					<td><%=c.getLname() %></td>
					<td><%=c.getEmailadd() %></td>
					<td><%=c.getMobilenos() %></td>
					<td><%=c.getGender() %></td>
					<td><%=c.getDob() %></td>
					<td> 
						<form action="editContact" method="post">
						<button type="submit" class="btn btn-warning">
						<span class="glyphicon glyphicon-edit">
						</span> Edit
						</button>
						
						</form>
					
					</td>
					<td><form action="deleteContact" method="post">
						<button type="submit" class="btn btn-danger">
						<span class="glyphicon glyphicon-folder-close	">
						</span> Delete
						</button>
						
						</form>
					</td>
					<td><form action="sendBirthdayEmail" method="post">
						<input type="hidden" name="fname" value="<%=c.getFname() %>"/>
						<button type="submit" class="btn btn-success">
						<span class="glyphicon glyphicon-send	">
						</span> B'Day Email
						</button>
						
						</form>
					</td>
					</tr>
					
					<%
					
					}
					
					%>
					
				</table>


				<%
					} else {
				%>
				<p>Contact Records Not Found</p>
				<%
					}
				%>
					Thanks!
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