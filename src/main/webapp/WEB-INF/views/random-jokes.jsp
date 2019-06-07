<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jokes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<td>ID</td>
					<td>Joke</td>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="j" items="${list}">
					<tr>
						<td>${j.id }</td>
						<td>${j.joke }</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-primary" href="joke-selection">More Jokes?</a>
	</div>
</body>
</html>