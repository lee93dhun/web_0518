<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<!--  form �±� �Ӽ� 
					1. method : ���� ��� 
						1. get : url�� �Ű����� ���� ǥ�� [ ���� ��� ] [ �ӵ�(ĳ��:�ѹ� ������ ������ ����) ] 
						2. post : url �� �Ű����� ���� ǥ��x [ ���� ���� ] [ 
					2. action : ���� ��ġ  [ submit Ŭ�������� ]
						1. URL
						2. ���ϸ� 
		  -->
	<form method="get" action="Day10_3_����1.jsp" >
		�̸� : <input type="text" name="name"> <br>
		���� : <select name="color">
		
			<option value="blue"> �Ķ��� </option>
			<option value="red"> ������ </option>
			<option value="orange"> �������� </option>
			<option value="etc"> ��Ÿ </option>
			
		</select> <br>
		<input type="submit" value="������">
	</form>
	

</body>
</html>