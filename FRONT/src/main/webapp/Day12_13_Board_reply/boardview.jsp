<%@page import="Dto.Reply"%>
<%@page import="java.util.ArrayList"%>
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
	
	<!--  ���  -->
	 <hr>
	<h4> ��� ���� </h4>
	<form action="replywritecontroller.jsp" method="post">
		
		<table>
			<tr>
				<th>�ۼ���</th> <th>����</th> <td></td> 
			</tr>
			<tr>
				<td> <input type="text" name="rwriter" size="10"> </td>
				<td> <textarea rows="" cols="50" name="rcontents"></textarea> </td>
				<td> <input type="submit" value="���"> </td>
			</tr>
		</table>
		<!-- ���� �Խù���ȣ [��� �ĺ���] --> <input type="hidden" value="<%=bno%>" name="bno">
		
	</form>

	 <hr>
	 <br>
	 <h4> ��� ��� </h4>
	 <table>
	 	<tr>
	 		<td>�ۼ���</td><td>����</td><td>�ۼ���</td> <td>���</td>
	 	</tr>
	 	<%
	 		ArrayList<Reply> replies = boardDao.rlist(bno);
	 		for( Reply reply : replies ){
	 	%>		
	 		<tr>
	 			<td><%=reply.getRwriter() %></td>	
	 			<td><%=reply.getRcontents() %></td>		
	 			<td><%=reply.getRdate() %></td>
	 			<td> <a href="#"> <button>����</button> </a>
	 			<td> <a href="#"> <button>����</button> </a>
	 		</tr>
	 	<%	
	 		}
	 	%>
	 
	 </table>
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
</body>
</html>