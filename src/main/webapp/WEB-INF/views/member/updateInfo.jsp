<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootstrap.jsp"></c:import>
<title>Manage Account</title>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container">
	<br>
	<br>
	<h2>Manage Account</h2>
	<br>
		<form action="./updateInfo" method="post">
			<div class="form-group">
				<label for="putId">ID</label> <input type="text" class="form-control" id="putId" aria-describedby="idHelp" name="id" readonly="readonly" value="${member.id}"> 
				<small id="idHelp" class="form-text text-muted">You cannot change ID.</small>
			</div>
			<div class="form-group">
				<label for="Password1">Password</label> <input type="password" class="form-control" id="Password1" name="pw" value="${member.pw}">
			</div>
			<div class="form-group">
				<label for="Name">Name</label> <input type="text" class="form-control" id="Name" name="name" value="${member.name}">
			</div>
			<div class="form-group">
				<label for="Email">Email</label> <input type="email" class="form-control" id="Email" name="email" value="${member.email}">
			</div>						
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<button type="submit" class="btn btn-info">Submit</button>
			<a href="./deleteQ" class="btn btn-danger" style="float:right">Delete Account</a>
		</form>
		
</div>
</body>
</html>