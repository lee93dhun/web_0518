<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p> html �� css : ����Ʈ���� </p>
	<p> JSP : html���� �ڹ� �ڵ带 ���� [html+java] </p>
		<p> 1. �±׾ȿ��� java�� ��� </p>
		
		
	
	Ŭ���̾�Ʈ		-------------��û HTTP ---------->			����
	[������:ũ��,�ͽ��÷� ��] <------ ���� HTTP -----			[ �� ���� ���� : HTML ����]
				
														JSP ���� 
														���� [ JAVA �� ���α׷��� Ŭ���� ]
	<p> jsp �±� 
	<!--  
	<%! %> : ������ �±� 								
	<%  %> : ��Ʈ��Ʈ �±� 
	<%= %> : ǥ���� �±� 
	<%@ %> : ������ �±� 
	<%-- --%> : �ּ� �±�
	-->
	<% 
		int ���� = 3;
		for( int i = 0 ; i<5 ; i++ ){ 
			���� += i;
		}
		
	%>
	�ݺ��� ������ : <%=���� %>
	
	
	

</body>
</html>