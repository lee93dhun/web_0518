<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>

	<%@include file="menu.jsp" %>
	
	<div class="container">
		 
		 <h3> Ŀ�´�Ƽ </h3>
		
		 <table class="table table-striped">
		 	<thead>
		 		<tr>
		 			<th> ��ȣ </th>
		 			<th> �̹��� </th>
		 			<th> ���� </th>
		 			<th> �ۼ��� </th>
		 			<th> �ۼ��� </th>
		 			<th> ��ȸ�� </th>
		 		</tr>
		 	</thead>
		 	
		 	<tbody>
		 		<!--  java �ݸ�  -->
		 	</tbody>
		 </table>
		 
		 <a href="boardwrite.jsp" class="btn btn-info pull-right">���ۼ�</a>
		 
		 <form>
		 	<table  style="margin: 0 auto;">
		 		<tr>
		 			<td>
		 				<select name="key" class="form-control">
		 					<option> ���� </option>
		 					<option> ���� </option>
		 					<option> �ۼ��� </option>
		 				</select>
		 			</td>
		 			<td>
		 				<input type="text" class="form-control" name="keyword" placeholder="�˻���" style="margin: 3px;">
		 			</td>
		 			<td>
		 				<input type="submit" value="�˻�" class="form-control" style="margin: 6px;">
		 			</td>
		 		</tr>
		 	</table>
		 </form>
		 
		 <div align="center">
		 	<ul class="pagination">
		 		<li class="page-item"> <a href="#"> ���� </a> </li>
		 		<li class="page-item"> <a href="#">1 </a></li>
		 		<li class="page-item"> <a href="#">2 </a></li>
		 		<li class="page-item"> <a href="#">3 </a></li>
		 		<li class="page-item"> <a href="#">���� </a></li>
		 	</ul>
		 </div>
	</div>
	
</body>
</html>
















