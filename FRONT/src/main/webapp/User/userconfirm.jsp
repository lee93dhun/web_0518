<%@page import="Dto.UserDto"%>
<%@page import="Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<%@include file="../Index/menu.jsp" %>
		
		<%
			UserDao userDao = UserDao.getinstance();
			UserDto userDto = userDao.getuser(loginid);
			String password = request.getParameter("password");
			
			if(  userDto.getUpassword().equals(password) ){
				response.sendRedirect("userinfo.jsp?confirm="+1);
			}else{
				response.sendRedirect("userinfo.jsp?confirm="+0);
			}
			
			
		%>

	
</body>
</html>