<%@page import="Dto.Board"%>
<%@page import="Dao.BoardDao"%>
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
		// 1. �Ű����� ��û [ �⺻Ÿ�� : String ] 
		int bno = Integer.parseInt(request.getParameter("bno"));
					// interger.parseint( ���ڿ� ) : ���ڿ� => ������ 
		// 2. �Խù���ȣ�� �ش��ϴ� db �˻��ؼ� ��� 
		BoardDao boardDao = BoardDao.getinstance();
		Board board  = boardDao.bview(bno);
		
		
		
	%>
	<a href="boardlist.jsp"><button>���</button> </a>
	<a href="boardupdate.jsp?bno=<%=bno%>"><button>����</button> </a>
	<a href="boarddeletecontroller.jsp?bno=<%=bno%>"><button>����</button> </a>
	<table border="1">
		<tr>
			<td colspan="3"> ���� :  <%=board.getBtitle() %> </td>
		</tr>
		
		<tr>
			<td> �ۼ��� :  <%=board.getBwriter() %> </td> 
			<td> �ۼ��� : <%=board.getBdate() %> </td> 
			<td> ��ȸ�� : <%=board.getBcount() %> </td>
		</tr>
		
		<tr>
			<td colspan="3"> ���� : <%=board.getBcontents() %> </td> 
		</tr>
		
		
	</table>
	
	
	

</body>
</html>