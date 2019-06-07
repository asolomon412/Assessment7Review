<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>API Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />


</head>
<body>
	<div class="container">
	<a class="btn btn-primary" href="joke-selection">Chuck Norris Jokes?</a> <br><br>
	<h1>Breweries</h1>
		<table class="table">
			<thead>
				<tr>
					<td>Name</td>
					<td>Type</td>
					<td>More Info</td>

				</tr>

			</thead>

			<tbody>
				<c:forEach var="b" items="${list}">
					<tr>
						<td>${b.name }</td>
						<td>${b.brewery_type }</td>
						<td><a class="btn btn-primary" href="details?id=${b.id}">Details</a></td>


					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>