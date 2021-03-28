<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootstrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<div class="container" style="text-align: center;margin-top:100px" >
		<h1>정말 탈퇴하시겠습니까?</h1>
		<p style="margin-top:20px;margin-bottom:30px">탈퇴해도 작성한 리뷰는 삭제되지 않습니다.</p>
		<a href="./deleteAccount" class="btn btn-danger">Delete</a>
	</div>
</body>
</html>