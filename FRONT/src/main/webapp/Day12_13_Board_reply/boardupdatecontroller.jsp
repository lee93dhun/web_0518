<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Board"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- 1.������ ��û�ϱ� -->
	<%
		request.setCharacterEncoding("EUC-KR"); // ��û�� �������� �ѱ��� ������� 
		
		int bno = Integer.parseInt(request.getParameter("bno")); 	// �Խù� ��ȣ
		String btitle = request.getParameter("btitle");				// �Խù� ���� 
		String bcontents = request.getParameter("bcontents");		// �Խù� ����

	%>
	<!-- 2.��û�� ������ ��üȭ -->
	<%
		Board board = new Board( btitle , bcontents ); // ��ȸ���� 0 
	%>
	<!-- 3.DB�� �����ϱ�  -->
	<%
		BoardDao boardDao = BoardDao.getinstance();
		int result =  boardDao.bupdate(bno, board);
	%>
	<!-- 4.�ٸ��������� �̵� -->
	<%
		if( result == 1 ) response.sendRedirect("boardlist.jsp");
		
	%>
</body>
</html>








