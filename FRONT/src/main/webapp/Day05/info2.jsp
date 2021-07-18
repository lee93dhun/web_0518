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
		#info{
			width: 600px;
			margin: 0 auto;
		}
		td{
			border-bottom: solid 1px #eeeeee;
		}
		.col1{
			width: 80px;
			font-size: 30px;
			vertical-align: top;
		}
		.col2{
			width: 50px;
			font-size: 20px;
		}
		.col3{
			width: 400px;
			font-size: 15px;
		}
	
	</style>
</head>
<body>

	<%@include file="menu.jsp" %>
	<%@include file="companyinfo.jsp" %>

	<h3> ȸ�� ���� </h3>

	<div id="info">
		
		<table>
			<tr>
				<td rowspan="2" class="col1">2001</td>
				<td class="col2">12</td>
				<td class="col3">TUV NORD�� ��ȣ ���� ���� ü��</td>
			</tr>
			<tr>
				<td class="col2">12</td>
				<td class="col3">aT���� & �ѱ����� ���� �����û� ���</td>
			</tr>
			<tr>
				<td rowspan="2" class="col1">2002</td>
				<td class="col2">01</td>
				<td class="col3">�߼Һ�ó����� ���� �����û� ���</td>
			</tr>
			<tr>
				<td class="col2">04</td>
				<td class="col3">�̱� FDA ���� ������� Microbac Analytical Laboratories Partnership</td>
			</tr>
			<tr>
				<td class="col1">2003</td>
				<td class="col2">02</td>
				<td class="col3">������б� �濵���������ҿ� ���п� ü��</td>
			</tr>
		</table>
		
	</div>
		

</body>
</html>