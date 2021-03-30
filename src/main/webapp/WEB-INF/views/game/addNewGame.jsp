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
</body>
<div class="container">
	<br>
	<br>
	<c:if test="${not empty member and member.id eq 'admin' }">
	<h2>Add New Game</h2>
	<br>
			<form action="./addNewGame" method="post">
			<div class="form-group">
				<label for="title">Title</label> <input type="text" class="form-control" id="title" name="title">
			</div>
			<div class="form-group">
				<label for="developer">Developer</label> <input type="text" class="form-control" id="developer" name="developer">
			</div>
			<div class="form-group">
				<label for="release_date">Release Date</label> <input type="date" class="form-control" id="release_date" name="release_date">
			</div>
				
			<br>			
			<button type="submit" class="btn btn-info">Submit</button>
		</form>
	</c:if>
	<c:if test="${empty member or (not empty member and member.id ne 'admin')}">
		<h6 style="text-align:center">잘못된 접근입니다.</h6>
	</c:if>
</div>
</html>