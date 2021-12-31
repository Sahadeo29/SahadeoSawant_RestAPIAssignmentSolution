<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

<title>Student</title>
</head>
<body>
	<div class="container">
		<center>
			<b> <font size="5">
					<h1 style="background-color: MediumSeaGreen">Employee Management</h1>
			</font>
			</b>
		</center>

		<hr>
		<!-- Add a button -->
		<a href="/Employee_Management/employees/showFormForAdd"
			class="btn btn-primary btn-sm mb-3">Add Employee</a>

		<!-- Display table User interface -->
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Employees}" var="temp">
					<tr>
						<td><c:out value="${temp.firstName}" /></td>
						<td><c:out value="${temp.lastName}" /></td>
						<td><c:out value="${temp.email}" /></td>

						<!-- Add "Update" button -->
						<a
							href="/Employee_Management/employees/showFormForUpdate?theId=${temp.theId}"
							class="btn btn-info btn-sm">Update</a>

						<!-- Add "Delete" button -->
						<a
							href="/Employee_Management/employees/showFormForDelete?theId=${temp.theId}"
							class="btn btn-danger btn-sm"
							onclick="if(!(confirm(Are you sure you want to delete?))) return false">Delete</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>