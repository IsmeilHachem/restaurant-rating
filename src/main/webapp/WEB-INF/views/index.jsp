<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Restaurant Ratings:</h1>

	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="items" items="${items}">
				<tr>
					<td>${items.name}</td>
					<td>${items.rating}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>