<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3> �۾��� ������ </h3>
		<a href="boardlist.jsp"><button>�۸��</button></a>
	<form method="post" action="boardwritecontroller.jsp">
		���� : <input type="text" name="btitle" size="50"> <br>
		�ۼ��� :<input type="text" name="bwriter" size="10"> <br>
		���� :  <textarea rows="10" cols="40" style="resize: none" name="bcontents"></textarea> <br>
		<input type="submit" value="�ۼ�"> <input type="submit" value="���">
	</form>
</body>
</html>