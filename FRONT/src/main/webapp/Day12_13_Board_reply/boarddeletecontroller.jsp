<%@page import="Dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
	
		// 1. �Ű����� ��û [ �⺻Ÿ�� : String ] 
		int bno = Integer.parseInt(request.getParameter("bno"));
					// interger.parseint( ���ڿ� ) : ���ڿ� => ������ 
		// 2. �Խù���ȣ�� �ش��ϴ� db �˻��ؼ� ��� 
		BoardDao boardDao = BoardDao.getinstance();
		int result =  boardDao.bdelete(bno);

		if( result == 1 ) response.sendRedirect("boardlist.jsp");
	%>

</body>
</html>