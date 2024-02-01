<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ARTICLE LIST</title>
</head>
<body>
	<h1>DETAIL</h1>

	<hr />


	<div>번호 : ${article.id }</div>
	<div>날짜 : ${article.regDate.substring(0,10) }</div>
	<div>작성자 : ${article.extra__writer}</div>
	<div>제목 : ${article.title }</div>
	<div>내용 : ${article.body }</div>
	<hr />
	<div>
		<a style="color: hotpink" href="list">♥ 리스트로 돌아가기</a>
	</div>




</body>
</html>