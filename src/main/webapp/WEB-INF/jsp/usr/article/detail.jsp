<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="ARTICLE DETAIL"></c:set>
<%@ include file="../common/head.jspf"%>


<section class="mt-8 text-xl px-4">
	<div class="mx-auto">
		<table class="table-box-1" border="1">
			<tbody>
				<tr>
					<th>번호</th>
					<td>${article.id }</td>
				</tr>
				<tr>
					<th>작성날짜</th>
					<td>${article.regDate }</td>
				</tr>
				<tr>
					<th>수정날짜</th>
					<td>${article.updateDate }</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${article.extra__writer }</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${article.title }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${article.body }</td>
				</tr>
			</tbody>
		</table>



		<div class="btns">

			<button class="hover:underline" type="button" onclick="history.back();">BACK</button>


			<c:choose>
				<c:when test="${loginedMemberCanModifyRd !=null}">
					<a class="modify-link" href="../article/modify?id=${article.id }">MODIFY</a>
					<a class="delete" href="../article/doDelete?id=${article.id }">DELETE</a>
				</c:when>
				<c:otherwise>

				</c:otherwise>
			</c:choose>







			<%-- 			<c:choose> --%>
			<%-- 				<c:when test="${empty loginedMemberCanModifyRd}"> --%>
			<!-- 					<li class="nav-item"><a class="nav-link" href="/loginForm">LOGIN</a></li> -->
			<!-- 					<li class="nav-item"><a class="nav-link" href="/joinForm">SIGNUP</a></li> -->
			<%-- 				</c:when> --%>
			<%-- 				<c:otherwise> --%>
			<!-- <!-- 					<li class="nav-item"><a class="nav-link" href="/boards/writeForm">글쓰기</a></li> -->
			-->

			<%-- 					<a class="modify-link" href="../article/modify?id=${article.id }">MODIFY</a> --%>
			<%-- 					<a class="delete" href="../article/doDelete?id=${article.id }">DELETE</a> --%>

			<%-- 				</c:otherwise> --%>
			<%-- 			</c:choose> --%>

			<%-- 			<a class="modify-link" href="../article/modify?id=${article.id }">MODIFY</a> --%>
			<%-- 			<a class="delete" href="../article/doDelete?id=${article.id }">DELETE</a> --%>
		</div>
	</div>
</section>






<%@ include file="../common/foot.jspf"%>