<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootstrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<div class="container">
	<br><br>
			<h2>${game.title}</h2>
	<table class="table table-hover">
		<tr>
			<td>Title</td>
			<td>${game.title}</td>
		</tr>
		<tr>
			<td>Developer</td>
			<td>${game.developer}</td>
		</tr>
		<tr>
			<td>Genre</td>
			<td>${game.genre}</td>
		</tr>
		<tr>
			<td>Rate</td>
			<td>${game.rate}</td>
		</tr>
		<tr>
			<td>Release Date</td>
			<td>${game.release_date}</td>
		</tr>
		<tr>
			<td>Platform</td>
			<td>${game.platform}</td>
		</tr>
		<tr>
			<td>Info</td>
			<td>${game.info}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${game.price}</td>
	</table>
	<br><br>
	<h4 style="display: inline-block;float:left">Reviews</h4>
	<c:if test="${not empty member}">
		<a href="../gReview/newGReview?game_num=${game.num}" class="btn btn-info btn-sm" style="float:right;margin-bottom:10px">Write</a>
	</c:if>
	<table class="table table-hover">
		<thead>
			<tr>
				<th style="width:20%">ID</th>
				<th style="width:57%">Comment</th>
				<th style="width:8%">Rate</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="re">
				<tr>
					<td><a href="../member/memberSelect">${re.id}</a></td>
					<td>${re.comments}</td>
					<td>${re.rate}</td>
					<td> <c:if test="${member.id eq re.id}">
							<a class="btn btn-outline-secondary btn-sm" href="../gReview/gReviewUpdate">Edit</a>
							<a class="btn btn-outline-secondary btn-sm" href="../gReview/gReviewDelete?num=${re.num}">Delete</a>
						 </c:if> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	</div>
	
</body>
</html>