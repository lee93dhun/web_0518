<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Reply"%>
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


	<%
		request.setCharacterEncoding("EUC-KR");
	
		int bno =  Integer.parseInt( request.getParameter("bno") );
			// ��û�� �Ű������� �⺻Ÿ��: String
		String rwriter =  request.getParameter("rwriter");
		String rcontents = request.getParameter("rcontents");
		
			// ��¥ 
			Date date = new Date(); // ���糯¥/�ð� ��ü
			// ��¥���� 
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
			String rdate = simpleDateFormat.format(date);
			
		Reply reply = new Reply( bno , rwriter , rcontents , rdate );
		
		BoardDao boardDao = BoardDao.getinstance();
		
		int result =  boardDao.rwrite(reply);
		
		if( result == 1 ){ response.sendRedirect("boardview.jsp?bno=" + bno ); } 
		else{}
		
		
		
	%>
	

</body>
</html>