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
							<!--  행마다 구별용 -->
				<thead>
					<tr>
						<th>번호</th>
						<th>대표이미지</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td> 1 </td>
						<td> 사진위치 </td>
						<td> 제목위치 </td>
						<td> 유재석 </td>
						<td> 2021-07-22 </td>
						<td> 13 </td>
					</tr>
					<tr>
						<td> 2 </td>
						<td> 사진위치 </td>
						<td> 제목위치 </td>
						<td> 강호동 </td>
						<td> 2021-07-22 </td>
						<td> 20 </td>
					</tr>
				</tbody>
			</table>
		<!-- ---------------------------------- 검색  -->			
			<form>
				<table style="margin: 0 auto">
					<tr>
						<td>
							<select name="key" class="form-control">
								<option> 제목 </option>
								<option> 내용 </option>
								<option> 작성자 </option>
							</select>
						</td>
						<td>
							<input type="text" class="form-control" name="keyword" placeholder="검색어 입력">
						</td>
						
						<td>
							<input type="submit" value="검색" class="btn btn-info">
						</td>
					</tr>			
				
				</table>
	
			</form>
			<a href="#" class="btn btn-info pull-right">글작성</a>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>