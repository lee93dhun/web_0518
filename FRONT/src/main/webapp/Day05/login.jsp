<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		h3{
			text-align: center;
		}
		form{
			width: 400px;
			margin: 0 auto;  /* ���� ��� ���� */
		}
		input {
			width: 150px;	/* �Է»����� ���α��� */ 
			height: 25px;	/* �Է»����� ���α��� */ 
		}
		button {
			padding: 25px;
			margin-left: 15px;
		}
		table{
			margin-top: 50px;
		}
	</style>
</head>
<body>
		<%@include file="menu.jsp" %>
			<h3> �α��� ��</h3>
		<form>
		
			<table>
				<tr>
					<td> ���̵� </td>
					<td> <input type="text"> </td>
					<td rowspan="2"> <button>�α���</button> </td>
				</tr>
				<tr>
					<td> ��й�ȣ </td>
					<td> <input type="password"> </td>
				</tr>
			</table>
		</form>

</body>
</html>