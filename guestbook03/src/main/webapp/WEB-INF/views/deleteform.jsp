<%@page import="com.douzone.guestbook.vo.GuestbookVo"%>
<%@page import="com.douzone.guestbook.repository.GuestbookRepository"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- JSTL만의 메소드를 쓸 수있게 해줌  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- 함수 처리를 쓸 수있게 해줌  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form method="post"
		action="${pageContext.request.contextPath }/delete/${no }">
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" required="required"></td>
				<td><input type="submit" value="확인"></td>
				<td><a href="${pageContext.request.contextPath }/">메인으로
						돌아가기</a></td>
			</tr>
		</table>
		<c:if test="${false eq result }">
			<p>비밀번호가 틀렸습니다.</p>
		</c:if>
	</form>

</body>
</html>