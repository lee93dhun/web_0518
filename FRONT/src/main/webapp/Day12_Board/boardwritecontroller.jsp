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
		
		String btitle = request.getParameter("btitle");
		String bwriter = request.getParameter("bwriter");
		String bcontents = request.getParameter("bcontents");
		
			// ��¥ 
			Date date = new Date(); // ���糯¥/�ð� ��ü
			// ��¥���� 
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
			String bdate = simpleDateFormat.format(date);
	%>
	<!-- 2.��û�� ������ ��üȭ -->
	<%
		Board board = new Board( btitle , bcontents , bwriter , bdate , 0 ); // ��ȸ���� 0 
	%>
	<!-- 3.DB�� �����ϱ�  -->
	<!-- 4.�ٸ��������� �̵� -->
</body>
</html>