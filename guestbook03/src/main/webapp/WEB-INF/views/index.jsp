<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- JSTL만의 메소드를 쓸 수있게 해줌  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> <!-- 함수 처리를 쓸 수있게 해줌  -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   pageContext.setAttribute("newLine", "\n");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/add" method="post">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name" required="required"></td>
			<td>비밀번호</td><td><input type="password" name="password" required="required"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="contents" cols=60 rows=5 required="required"></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<c:set var='listCount' value='${fn:length(list) }' />
	<c:forEach items="${list }" var="vo" varStatus='status'>
	<br>
	<table width=510 border=1>
		<tr>
			<td>[${listCount-status.index }]</td>
			<td>${vo.name }</td>
			<td>${vo.date }</td>
			<td><a href="${pageContext.request.contextPath }/delete/${vo.no }">삭제</a></td>
		</tr>
		<tr>
			<td colspan="4">
				${fn:replace(vo.contents, newLine, "<br>") }
			</td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>