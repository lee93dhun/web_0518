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

	<!-- Controller 페이지 [ view 없음 ]  -->
	<%// java 스크립트 시작 
		
		//1.매개변수 인코딩 타입설정  
		request.setCharacterEncoding("EUC-KR");
		
		// 2. 매개변수 요청 
		String mid = request.getParameter("id");
		String mpassword = request.getParameter("password");
		String mpasswordconfirm = request.getParameter("passowrdconfirm");
		String mname = request.getParameter("name");
		String memail = request.getParameter("email");
		
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String mphone = phone1 + phone2 + phone3;
		
		String adress1 = request.getParameter("adress1");
		String adress2 = request.getParameter("adress2");
		String adress3 = request.getParameter("adress3");
		String adress4 = request.getParameter("adress4");
		String adress5 = request.getParameter("adress5");
		String madress = adress1 +","+adress2+","+adress3+","+adress4+","+adress5;
		
		// 객체 => db 
		Member member = new Member( mid , mpassword , mname , memail , mphone , madress );
		
		out.print( member.getMadress());
		
									/* 	// Enumeration 인터페이스 : 순서가 없는 여러개의 항목을 하나씩 순회 
										Enumeration<String> enumeration =  request.getParameterNames();
										
										while( enumeration.hasMoreElements() ){
											String name2 =  enumeration.nextElement();
											String value = request.getParameter(name2);
											out.println(name2 + " : " + value );
										}
 									*/
 									
 					
	//java 스크립트 끝 
	%>
	
	
	
</body>
</html>