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

	<h3> �ۼ��� ������ </h3>
		<a href="boardlist.jsp"><button>�۸��</button></a>
		<a href="boardview.jsp?bno=<%=bno%>"><button>���</button></a>
	<form method="post" action="boardupdatecontroller.jsp">
		<!-- ���ܼ� ������  --> <input type="hidden" name="bno" value="<%=board.getBno() %>">
		���� : <input type="text" name="btitle" size="50" value="<%=board.getBtitle()%>"> <br>
		�ۼ��� :<input type="text" name="bwriter" size="10" value="<%=board.getBwriter()%>" disabled="disabled"> <br>
		���� :  <textarea rows="10" cols="40" style="resize: none" name="bcontents"><%=board.getBcontents() %></textarea> <br>
		<input type="submit" value="����">
	</form>
	
</body>
</html>