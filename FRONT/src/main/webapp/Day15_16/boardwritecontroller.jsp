
<%@page import="java.io.PrintWriter"%>
<%@page import="Dao.NoticeDao"%>
<%@page import="Dto.NoticeDto"%>
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
		// jsp �±� : java ��Ʈũ��Ʈ�� 
		
		request.setCharacterEncoding("EUC-KR");
	
		String ntitle = request.getParameter("title");
		String ncontents = request.getParameter("contents");
		String nfile = request.getParameter("file");
		
		// ��ü 
		NoticeDto noticeDto = new NoticeDto(ntitle , ncontents , "���缮" , 0 , nfile );
		
		// DB 
		NoticeDao noticeDao = NoticeDao.getinstance();
		
		int result =  noticeDao.noticewrite(noticeDto);
		
		if( result == 1 ){
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('�� �ۼ� ���')");
			printWriter.println("location.href='boardlist.jsp'");
			printWriter.println("</script>");
		}
		else{
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('�� �ۼ� ����[�����ڿ��� ����]')");
			printWriter.println("location.href='boardwrite.jsp'");
			printWriter.println("</script>");
		}
		

	%>

</body>
</html>