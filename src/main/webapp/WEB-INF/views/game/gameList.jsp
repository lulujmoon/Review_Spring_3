<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<c:import url="../template/bootstrap.jsp"></c:import>
<title>What I Played</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
	<br><br>
	<h2 style="margin-bottom:10px">Game List</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width:8%">no</th>
					<th style="width:37%">Title</th>
					<th style="width:30%">Developer</th>
					<th style="width:15%">Release Date</th>
					<th style="width:10%">Rate</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="game">
					<tr>
						<td>${game.num}</td>
						<td><a href="#">${game.title}</a></td>
						<td>${game.developer}</td>
						<td>${game.release_date}</td>
						<td>${game.rate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>