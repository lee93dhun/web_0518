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
		
		// ��ü => db 
		Member member = new Member( mid , mpassword , mname , memail , mphone , madress );
		
		out.print( member.getMadress());
		
									/* 	// Enumeration �������̽� : ������ ���� �������� �׸��� �ϳ��� ��ȸ 
										Enumeration<String> enumeration =  request.getParameterNames();
										
										while( enumeration.hasMoreElements() ){
											String name2 =  enumeration.nextElement();
											String value = request.getParameter(name2);
											out.println(name2 + " : " + value );
										}
 									*/
 									
 					
	//java ��ũ��Ʈ �� 
	%>
	
	
	
</body>
</html>