<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
	<c:import url="./template/bootstrap.jsp"></c:import>
</head>
<body>
<c:import url="./template/header.jsp"></c:import>

<div class="container">
<br><br>
<h1>Hello!</h1>

<c:if test="${not empty member}">
	<br>
	<h4>${member.name} 님 반갑습니다.</h4>
</c:if>
</div>

</body>
</html>
