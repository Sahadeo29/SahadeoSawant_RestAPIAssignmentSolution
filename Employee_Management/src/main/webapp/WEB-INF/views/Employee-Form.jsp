<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOC TYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Koo8x4CGsO3+Hh xv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPF9MuhOf23Q9Isis"
	cross-origin="anonymous">

<title>Save Employee</title>
</head>
<body>
	<div class="container">
		<h3>Employee Directory</h3>
		<hr>
		<p class="h4 mb-4">Enter Employee</p>
		<form action="/Employee_Management/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Employee.id}" />
			<div class="form inline">
				<input type="text" name="firstName" value="${Employee.firstName}"
					class="form-control mb-4 col-4" placeholder="First_Name">
			</div>
			<div class="form inline">
				<input type="text" name="lastName" value="${Employee.lastName}"
					class="form-control mb-4 col-4" placeholder="Last_Name">
			</div>
			<div class="form inline">
				<input type="text" name="email" value="${Employee.email}"
					class="form-control mb-4 col-4" placeholder="Email">
			</div>
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
</body>
</html>