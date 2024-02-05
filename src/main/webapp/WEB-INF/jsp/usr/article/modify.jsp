<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="MODIFY"></c:set>
<%@ include file="../common/head.jspf"%>


<section class="mt-8 text-xl px-4">
	<div class="mx-auto">
		<form action="../article/doModify" method="POST">
		
		<input type="hidden" value="${article.id }" name="id" type="number"/>
			<table class="login-box table-box-1" border="1">
				<tbody>
					<tr>
						<th>제목</th>
						<td><input autocomplete="off" type="text" placeholder="제목을 입력해주세요" name="title" /></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea autocomplete="off" type="text" placeholder="내용을 입력해주세요" name="body" /></textarea></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="submit" value="수정" /></td>
					</tr>
				</tbody>
			</table>
		</form>
		<div class="btns">
			<button class="hover:underline" type="button" onclick="history.back();">뒤로가기</button>
		</div>
	</div>
</section>



<%@ include file="../common/foot.jspf"%>