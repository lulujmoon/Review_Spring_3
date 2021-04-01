<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<br>
	<br>
	<c:if test="${not empty member}">
	<h2>Update Review</h2>
	<br>
			<form action="./newGReview" method="post">
			<div>
				<input type="hidden" name="game_num" value="${param.game_num}">
			</div>
			
			<div class="form-group">
				<label for="id">ID</label> <input type="text" class="form-control" id="id" name="id" value="${member.id}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="comment">Comment</label> <input type="text" class="form-control" id="comments" name="comments">
			</div>
			<div class="form-group">
				Rate 
				<select name="rate">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>6</option>
					<option>7</option>
					<option>8</option>
					<option>9</option>
					<option>10</option>
				</select>
			</div>
			<br>			
			<button type="submit" class="btn btn-info">Submit</button>
		</form>
	</c:if>
	<c:if test="${empty member}">
		<h6 style="text-align:center">잘못된 접근입니다.</h6>
	</c:if>
</div>
</body>
</html>