<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<% // 1. java ���� ��Ʈũ���� ��ũ ���� 
	
		//2. �� �������κ��� �Ű����� ��û 
			// 1. ���ڵ� Ÿ��
			request.setCharacterEncoding("UTF-8");
			// 2. �Ű����� ��û�ϱ� 
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String passwordconfirm = request.getParameter("passowrdconfirm");
			String name = request.getParameter("name");
			
			/*
			out.print( request.getParameterNames() );
			out.print( request.getParameterValues("id") );
			*/
			
			
		// 3. �Ű����� ��� 
			out.print("�Է��Ͻ� ���̵� " + id ); 
			out.print("�Է��Ͻ� ��й�ȣ " + password );
			out.print("�Է��Ͻ� ��й�ȣȮ�� " + passwordconfirm );
			out.print("�Է��Ͻ� �̸� " + name );

							
	// ��Ʈ��Ʈ�� �� 
	%>
	
	<% if( !password.equals(passwordconfirm) ){
	%>	
		<script type="text/javascript">
			alert('�н����尡 ���� �ٸ��ϴ�');
			location.href="Day10_5_signup.jsp";
		</script>
	<%
	}else{
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('ȸ�������� �Ǿ����ϴ�')");
		printWriter.println("location.href='../Day09/main.jsp'");
		printWriter.println("</script>");
	}
	%>
	


</body>
</html>