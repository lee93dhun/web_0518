<%@page import="java.io.PrintWriter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Dto.NoticeDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.NoticeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<%@include file="../Index/menu.jsp" %>
	

	
	
	<div class="container">
		 
		 <h3> 커뮤니티 </h3>
		
		 <table class="table table-striped">
		 	<thead>
		 		<tr>
		 			<th> 번호 </th>
		 			<th> 대표 이미지 </th>
		 			<th> 제목 </th>
		 			<th> 작성자 </th>
		 			<th> 작성일 </th>
		 			<th> 조회수 </th>
		 		</tr>
		 	</thead>
		 	
		 	<tbody>
		 		<%
		 		
		 		request.setCharacterEncoding("UTF-8");
		 		String key = request.getParameter("key");
		 		String keyword = request.getParameter("keyword");
		 		
		 		NoticeDao noticeDao = NoticeDao.getinstance();
		 		
		 		ArrayList<NoticeDto> noticeDtos ;
		 		// 검색이 없을경우 
		 		if( key == null || keyword == null ){
		 			noticeDtos = noticeDao.noticelist();
		 		}else{ // 검색이 있는경우
		 
		 			noticeDtos = noticeDao.noticekeyword( key , keyword );
		 		}
		 		for( NoticeDto noticeDto : noticeDtos  ){
		 		%>	
		 			<tr>
		 				<td><%=noticeDto.getNno() %></td>
		 				<td> <img alt="" src="../upload/<%=noticeDto.getNfile() %>"  width="25px;"> </td>
		 				<td width="700px;"><a href="boardview.jsp?nno=<%=noticeDto.getNno()%>"> <%=noticeDto.getNtitle() %></a></td>
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
		 
		 <%
		 	// 로그인 세션이 있을경우에만 글작성 
		 		//String loginid = (String)session.getAttribute("loginid");
		 		// 메뉴에 선언되어 있어서 주석 
		 		
		 	if( loginid != null ){
		 %>
		 	<a href="boardwrite.jsp" class="btn btn-info pull-right">글작성</a>
		 <% 		
		 	}else{
		 %>
		 	<div align="right"> *로그인후 글작성이 가능합니다</div>
		 <%		
		 	}
		 %>
		 
		 
		 <form method="post" action="boardlist.jsp">
		 	<table  style="margin: 0 auto;">
		 		<tr>
		 			<td>
		 				<select name="key" class="form-control">
		 					<option value="ntitle"> 제목 </option>
		 					<option value="ncontents"> 내용 </option>
		 					<option value="nwriter"> 작성자 </option>
		 				</select>
		 			</td>
		 			<td>
		 				<input type="text" class="form-control" name="keyword" placeholder="검색어" style="margin: 3px;">
		 			</td>
		 			<td>
		 				<input type="submit" value="검색" class="form-control" style="margin: 6px;">
		 			</td>
		 		</tr>
		 	</table>
		 </form>
		 
		 <div align="center">
		 	<ul class="pagination">
		 		<li class="page-item"> <a href="#"> 이전 </a> </li>
		 		<li class="page-item"> <a href="#">1 </a></li>
		 		<li class="page-item"> <a href="#">2 </a></li>
		 		<li class="page-item"> <a href="#">3 </a></li>
		 		<li class="page-item"> <a href="#">다음 </a></li>
		 	</ul>
		 </div>
	</div>
	
</body>
</html>
















