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
		table {
			border-top: solid 3px black;
			width: 600px;
			margin: 0 auto;
		}
		td{
			border-bottom: solid 1px #cccccc;
			padding: 10px;
		}
		input {
			width: 500px;
			height: 30px;
		}
		textarea {
			width: 500px;
			height: 100px;
			resize: none;		/* ũ������ ������� */
		}
		#buttons{
			width: 600px;
			text-align: right;
			margin: 0 auto;
		}
		button {
			padding: 5px 20px;
			margin-left: 10px;
			margin-top: 30px;
		}
		
		
	
	
	</style>
</head>
<body>

	<%@include file="menu.jsp" %>
	
	<h3> �� ���� </h3>
	
	<form>
		<table>
			<tr>
				<td> �̸� </td>
				<td> ȫ�浿 </td>
			</tr>
			<tr>
				<td> ���� </td>
				<td> <input type="text"> </td>
			</tr>
			<tr>
				<td> �۳��� </td>
				<td> <textarea rows="" cols=""></textarea>
			</tr>
			<tr>
				<td> ���� </td>
				<td> <input type="file"></td>
			</tr>
		</table>
		
		<div id = "buttons">
			<button> �����ϱ� </button>
			<button> ��Ϻ��� </button>
		</div>
	</form>
	
</body>
</html>