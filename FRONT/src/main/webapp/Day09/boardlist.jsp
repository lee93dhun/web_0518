<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		*{ text-align: center !important}
		form table tr td{ padding: 5px; }
		
	</style>

</head>
<body>


	<%@include file="menu.jsp" %>
	
	
	<div class="container">
	
			<table class="table table-striped" style="margin-top: 100px;" >
							<!--  �ึ�� ������ -->
				<thead>
					<tr>
						<th>��ȣ</th>
						<th>��ǥ�̹���</th>
						<th>����</th>
						<th>�ۼ���</th>
						<th>�ۼ���</th>
						<th>��ȸ��</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td> 1 </td>
						<td> ������ġ </td>
						<td> ������ġ </td>
						<td> ���缮 </td>
						<td> 2021-07-22 </td>
						<td> 13 </td>
					</tr>
					<tr>
						<td> 2 </td>
						<td> ������ġ </td>
						<td> ������ġ </td>
						<td> ��ȣ�� </td>
						<td> 2021-07-22 </td>
						<td> 20 </td>
					</tr>
				</tbody>
			</table>
		<!-- ---------------------------------- �˻�  -->			
			<form>
				<table style="margin: 0 auto">
					<tr>
						<td>
							<select name="key" class="form-control">
								<option> ���� </option>
								<option> ���� </option>
								<option> �ۼ��� </option>
							</select>
						</td>
						<td>
							<input type="text" class="form-control" name="keyword" placeholder="�˻��� �Է�">
						</td>
						
						<td>
							<input type="submit" value="�˻�" class="btn btn-info">
						</td>
					</tr>			
				
				</table>
	
			</form>
			<a href="#" class="btn btn-info pull-right">���ۼ�</a>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>