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
	<br>
	<br>
	<h2>Sign Up</h2>
	<br>
			<form action="./signUp" method="post">
			<div class="form-group">
				<label for="putId">ID</label> <input type="text" class="form-control" id="putId" aria-describedby="idHelp" name="id"> 
				<small id="idHelp" class="form-text text-muted">We'll never share your information with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="Password1">Password</label> <input type="password" class="form-control" id="Password1" name="pw">
			</div>
			<div class="form-group">
				<label for="Name">Name</label> <input type="text" class="form-control" id="Name" name="name">
			</div>
			<div class="form-group">
				<label for="Email">Email</label> <input type="email" class="form-control" id="Email" name="email">
			</div>						
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<button type="submit" class="btn btn-info">Submit</button>
		</form>
</div>
</body>
</html>