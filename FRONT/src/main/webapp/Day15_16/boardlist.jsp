<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Dto.NoticeDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.NoticeDao"%>
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
		 			<th> ��ǥ �̹��� </th>
		 			<th> ���� </th>
		 			<th> �ۼ��� </th>
		 			<th> �ۼ��� </th>
		 			<th> ��ȸ�� </th>
		 		</tr>
		 	</thead>
		 	
		 	<tbody>
		 		<%
		 		
		 		request.setCharacterEncoding("EUC-KR");
		 		String key = request.getParameter("key");
		 		String keyword = request.getParameter("keyword");
		 		
		 		NoticeDao noticeDao = NoticeDao.getinstance();
		 		
		 		ArrayList<NoticeDto> noticeDtos ;
		 		// �˻��� ������� 
		 		if( key == null || keyword == null ){
		 			noticeDtos = noticeDao.noticelist();
		 		}else{ // �˻��� �ִ°��
		 
		 			noticeDtos = noticeDao.noticekeyword( key , keyword );
		 		}
		 		for( NoticeDto noticeDto : noticeDtos  ){
		 		%>	
		 			<tr>
		 				<td><%=noticeDto.getNno() %></td>
		 				<td> <img alt="" src="../upload/<%=noticeDto.getNfile() %>"  width="25px;"> </td>
		 				<td width="700px;"><a href="#"> <%=noticeDto.getNtitle() %></a></td>
		 				<td><%=noticeDto.getNwriter() %></td>
		 				<%
		 					String dbdate = noticeDto.getNdate();
		 					Date date = new Date();
		 					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		 					if( dbdate.substring(0,10).equals( simpleDateFormat.format(date) ) ){
		 					%>
		 						<td><%=dbdate.substring(10,16) %></td>
		 					<% 
		 					}else{
		 					%>
		 						<td><%=dbdate.substring(0,10) %></td>
		 					<%
		 					}
		 				%>
		 				<td><%=noticeDto.getNcount() %></td>
		 			</tr>
		 			
		 		<% 
		 		}
		 		
		 		%>
		 	</tbody>
		 </table>
		 
		 <a href="boardwrite.jsp" class="btn btn-info pull-right">���ۼ�</a>
		 
		 <form method="post" action="boardlist.jsp">
		 	<table  style="margin: 0 auto;">
		 		<tr>
		 			<td>
		 				<select name="key" class="form-control">
		 					<option value="ntitle"> ���� </option>
		 					<option value="ncontents"> ���� </option>
		 					<option value="nwriter"> �ۼ��� </option>
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
















