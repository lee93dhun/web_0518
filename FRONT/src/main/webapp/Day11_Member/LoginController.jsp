<%@page import="Dao.MemberDao"%>
<%@page import="Dto.Member"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- Controller ������ [ view ���� ]  -->
	<%// java ��ũ��Ʈ ���� 
		
		//1.�Ű����� ���ڵ� Ÿ�Լ���  
		request.setCharacterEncoding("EUC-KR");
		
		// 2. �Ű����� ��û 
		String mid = request.getParameter("id");
		String mpassword = request.getParameter("password");
		
		MemberDao memberDao = MemberDao.getinstance();
		
		int result =  memberDao.login(mid, mpassword);
		
		if( result == 1 ){
			//�α��� ������ main������ �̵� 
			response.sendRedirect("../Day09/main.jsp");
			session.setAttribute("logid", mid); // ���Ǻο�
			
		}else{
			response.sendRedirect("Login.jsp");
		}

			
	%>
	
	
	
</body>
</html>