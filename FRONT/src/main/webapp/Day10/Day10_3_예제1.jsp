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

	<h3> ����1 </h3>

	<%! // ����
		
		// ��ü ���� 
		String ���� = "���ڿ� �Դϴ�";
	
		// �޼ҵ� ���� O 
		public String ���ڹ�ȯ(){
			return ����;
		}
	%>
	
	<% // ��ũ��Ʈ�� 
		
		// ��ü ���� 
		String ����2 = "���ڿ�2 �Դϴ�";
		String ����3 = "���ڿ�3 �Դϴ�";
		
		// html�� ����ϱ� 
		out.println(" ���� ��ü�� ��� " + ���� + "<br>" );
		
		// �޼ҵ� ���� X
		/*
		public String ���ڹ�ȯ2(){
			return ����2;
		}
		*/
		
	%>
		<!-- ǥ����  -->
		���ڿ� ��� : <%=���� %> <br>
		�޼ҵ� ��� : <%=���ڹ�ȯ() %> <br>
		��ũ��Ʈ��� : <%=����2 %>
	
	<h3> ���� ���� </h3>
	
	
	<% 
		// ��ũ��Ʈ�������� ��ü����� ��������
		String name = "jsp" + team; %>
	
	<%! 
		// ���𹮿��� ��ü����� ��������
		String team =" �ѱ���";
	%>
	
	
	��°�� : <%=name %>
	
	<h3> �޼ҵ� ���� </h3>
	
	<%!
		int one;
		int two = 1;
		
		public int plus�޼ҵ�(){
			return one+two;
		}
		String msg;
		int three;
	%>
	
	one �� two�� ���� : <%=plus�޼ҵ�() %> <br>
	string msg ���� : <%=msg %> <br>
 	int three ���� : <%=three %> <br>	
 	
 	<h3> ��Ʈ��Ʈ </h3>
	
	<%!
		int one2;
		String msgone2;
	%>
	
	<%
		int two = 31;
		String msgtwo ="��Ʈ��Ʈ ����";
	%>
	
		<%= two +" :  " + msgtwo %> <br>	
		<%=one %> <br>	
		<%=application.getRealPath("/") %> <!--  ��ü�� �޼ҵ嵵 ��°��� -->
	
	<h3> ��Ʈ��Ʈ2 </h3>
	
	<%
		float f = 2.3f;
		int i = Math.round(f); // java Ŭ������ ��� ���� 
		
		Date date = new Date(); 
		
	%>
	
	�Ǽ� f�� �ݿø����� <%= i %>  <br>
	���� ��¥�� �ð��� <%=date.toString() %> <br>
	
	<h3> ǥ���� </h3>
	
	<%
		String[] name2 ={ "java" , "jsp" , "android" ,"struts"};
	%>
	
	<table border="1" >
		<% for(int j = 0 ; j< name2.length ; j++ ){
			// <tr> ��Ʈ��Ʈ������ �±� ���Ұ� 
		%>
			<tr>
				<td> <%=j %> </td>
				<td> <%=name2[j] %> </td>
			</tr>	
		<%
		} 
		%>
	</table>
	
	<h3> ǥ����2 </h3>
	
	<%
		Date date2 = new Date();
		int �� = date2.getHours();
		int ��1 = 10;
		int ��2 = 12;
	%>
	
	
	<%!
		public int ū�����( int ��1 , int ��2 ){
		
			return ��1>��2 ? ��1 : ��2;
	}
	%>
	������ �����ϱ��? <%= ��<12 ? "����":"����" %> <br>
	
	���� ū ���� ��� <%=ū�����(��1, ��2) %>
	
	<h3> ��� if </h3>
	
	<%
		// jsp�� �̸� ������� ��ü  
			// ��û��ü : request ��ü  [ HttpServletRequest Ŭ������ ��ü ]
			// ���䰴ü 
		
		// ��û ���ڵ� Ÿ�� : EUC-KR Ȥ�� UTF-8 
		request.setCharacterEncoding("EUC-KR"); 
	
		// �� �������κ��� ��û --> name �̸��� ���� �ִ� �±׷κ��� value �� ��û
		String name3 = request.getParameter("name"); 
		String color = request.getParameter("color");
		
		if( color.equals("blue")){ msg="�Ķ���"; }
		else if( color.equals("red")){ msg="������"; }
		else if( color.equals("orange")){ msg="��������";}
		else{ color = "while"; msg="��Ÿ��"; }
	%>
	
		<div style="background-color: <%=color %>">
			<%=name3 %> ���� �����ϴ� ������ <%=msg %> �Դϴ�
		</div>
	
	
	
		

</body>
</html>