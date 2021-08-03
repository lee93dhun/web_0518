
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
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
		// JSP 파일 업로드 하기 [ 파일 --> 서버 ]
		// 1. COS 라이브러리 추가 
		
		// 2.업로드 된 파일을 저장할 폴더 경로 설정 
		String realFolder = "C:/Users/User/git/web_0518/FRONT/src/main/webapp/upload";
	
		// 3.파일 요청 클래스 
		MultipartRequest multi = new MultipartRequest( request , realFolder , 1024*1024*10 , "UTF-8" ,new DefaultFileRenamePolicy() );
																// 1. 요청방식 , 2.저장경로 , 3.파일최대용량[ 10mb ] , 4.인코딩타입 5. 보안[ 동일한 이름이 있을경우 파일명뒤에 숫자 붙여줌]
																		// [ bit -> byte -> kb -> mb ]
		// 4. form 태그 속성 enctype="multipart/form-data"
		
		String ntitle = multi.getParameter("title");
		String ncontents = multi.getParameter("contents");
		String nfile = multi.getFilesystemName("file"); 
									// .getFilesystemName : 첨부파일에 있는 파일명 요청 									
	%>	

	<%
		// jsp 태그 : java 스트크립트문 
		

		/* String ntitle = request.getParameter("title");
		String ncontents = request.getParameter("contents");
		String nfile = request.getParameter("file"); */
		
		// 객체 
		NoticeDto noticeDto = new NoticeDto(ntitle , ncontents , "유재석" , 0 , nfile );
		
		// DB 
		NoticeDao noticeDao = NoticeDao.getinstance();
		
		int result =  noticeDao.noticewrite(noticeDto);
		
		if( result == 1 ){
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('글 작성 등록')");
			printWriter.println("location.href='boardlist.jsp'");
			printWriter.println("</script>");
		}
		else{
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('글 작성 실패[관리자에게 문의]')");
			printWriter.println("location.href='boardwrite.jsp'");
			printWriter.println("</script>");
		}
		

	%>

</body>
</html>