<%@page import="Dto.UserDto"%>
<%@page import="Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 현재 파일이 포함시키는 파일과 폴더가 동일한경우 -->
	<% //<%@include file="menu.jsp" %> 

	<!-- 현패 파일이 포함시키는 파일과 폴더가 다른경우 -->
	<%@include file="../Index/menu.jsp" %>
	
	<%
		UserDao userDao = UserDao.getinstance();
		UserDto userDto = userDao.getuser(loginid);
		
		String confirm = request.getParameter("confirm");
	%>

	<div class="container">
		<!-- 부트스트랩 탭메뉴 -->  <!-- nav-justified : 탭 자동 간격 -->
		<ul class="nav nav-tabs nav-justified">
		
			<li class="nav-item">
				<a class="nav-link " data-toggle="tab" href="#order">주문목록</a>
			</li>
		
			<li class="nav-item">
				<a class="nav-link " data-toggle="tab" href="#info">회원정보</a>
			</li>
			
			<!--  페이지 새로 열렸을때 회원수정 탭 활성화 -->
			<%
				if( confirm != null ){
			%>
				<li class="nav-item active">
			<% 
				}else{
			%>
				<li class="nav-item">
			<%	
				}
			%>
			
				<a class="nav-link " data-toggle="tab" href="#infoupdate">회원수정</a>
			</li>
			
			<li class="nav-item">
				<a class="nav-link" data-toggle="tab" href="#infodelete">회원탈퇴</a>
			</li>
			
		</ul>
		
		<div class="tab-content">
			<div class="tab-pane fade" id="order">
				<div>주문목록</div>
			</div>
			<div class="tab-pane fade" id="info">
				<div>
					<table>
						<tr>
							<td> 아이디 : <%=loginid %> </td>
						</tr>
						<tr>
							<td> 비밀번호 : ******** </td>
						</tr>
						<tr>
							<td> 성명 : <%=userDto.getUname() %> </td>
						</tr>
						<tr>
							<td> 주소 : <%=userDto.getUaddress() %> </td>
						</tr>
						<tr>
							<td> 이메일 : <%=userDto.getUemail() %> </td>
						</tr>
						<tr>
							<td> 포인트 : <%=userDto.getUpoint() %> </td>
						</tr>
					</table>
				</div>
			</div>
			
			<!--  페이지 새로 열렸을때 회원수정 탭 활성화 -->
			<%
				if( confirm != null ){
			%>
				<div class="tab-pane fade active in" id="infoupdate">
			<% 
				}else{
			%>
				<div class="tab-pane fade" id="infoupdate">
			<%	
				}
			%>
					<%
						
						if( confirm == null ){
					%>
						비밀번호 확인 
						<form method="post" action="userconfirm.jsp">
							비밀번호 : <input type="password" name="password">
							<input type="submit" value="확인">
						</form>
					<%
						}else if( confirm.equals("1")){
					%>
						<form method="post" action="userupdatecontroller.jsp">
							<table>
							<tr>
								<td> 아이디 : <%=loginid %> </td>
							</tr>
							<tr>
								<td> 기존 비밀번호 : ******** </td>
								<td> 새로운 비밀번호 : <input type="password" name="password"> </td>
							</tr>
							<tr>
								<td> 성명 : <input type="text" value="<%=userDto.getUname() %>" name="name">  </td>
							</tr>
							<tr>
								<td> 주소 : <%=userDto.getUaddress() %> </td>
								<td> 새로운주소 :
									<div>
									<input type="text" id="sample4_postcode" placeholder="우편번호" name="address1" class="form-control" >
									</div>
									<div class="col-lg-4">
										<input type="button" style="margin-top: 23px;" onclick="sample4_execDaumPostcode()" value="주소 검색" class="form-control" >
									</div>
									<div class="col-lg-6">
										<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name="address2" class="form-control">
									</div>
									<div class="col-lg-6">
										<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name="address3" class="form-control">
									</div>
									<div class="col-lg-12">
										<input type="text" id="sample4_detailAddress" placeholder="상세주소" name="address4" class="form-control">
									</div>
								
								 </td>
							</tr>
							<tr>
								<td> 이메일 : <input type="email" value=" <%=userDto.getUemail() %>" name="email"> </td>
							</tr>
						</table>
						</form>
					<%	
						}else if( confirm.equals("0")){
					%>
						비밀번호 확인 
						<form method="post" action="userconfirm.jsp">
							비밀번호 : <input type="password" name="password">
							<input type="submit" value="확인">
						</form>
						비밀번호가 일치 하지 않습니다.
					<% 	
						}
					%>
					
				</div>
			</div>
			<div class="tab-pane fade" id="infodelete">
				<div>회원탈퇴</div>
			</div>
		</div>
	</div>
	<%@include file="../Index/footer.jsp" %>
	
</body>
</html>