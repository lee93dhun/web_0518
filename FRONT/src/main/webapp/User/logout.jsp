<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// session.invalidate(); // 모든 세션 초기화 
		session.setAttribute("loginid", null ); // loginid만 null로 초기화 
		
		// 페이지이동
		response.sendRedirect("login.jsp");
	%>

</body>
</html>