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
		
			<!-- 현재 가로길이를 12등분 했을때  -->
			<div class="col-md-3">
				<!-- 관리자 사이드바 포함 -->
				<%@include file="../admin/adminsiebar.jsp" %>
			</div>
			
			<!--  공백 -->
			<div class="col-md-1"></div>
			
			<div class="col-md-8">
				
				<h3> 제품등록</h3>
							
				<form method="post" action="productwritecontroller.jsp" enctype="multipart/form-data">
					<!-- 폼 : 양식 method="전송방식" action="RUL"  enctype="전송데이터 타입" onsubmit="조건메소드"  -->
					
					제품명  <input type="text" name="name" class="form-control"> <br>
					설명  <textarea cols="" rows="" name="comment" class="form-control"></textarea> <br>
					가격   <input type="text" name="price" class="form-control"> <br>
					제조사  <input type="text" name="manufacturer" class="form-control"> <br>
					
					분류 <input type="radio" name="category"> 스페셜&할인팩
					<input type="radio" name="category"> 프리미엄
					<input type="radio" name="category"> 와퍼
					<input type="radio" name="category"> 주니어&버거
					<input type="radio" name="category"> 올데이킹&치킨버거
					<input type="radio" name="category"> 사이드
					<input type="radio" name="category"> 음료&디저트
					<br> <br> 
					
					재고 <input type="text" name="stock" class="form-control"> <br>
					출시일 <input type="date" name="releasedate" class="form-control"> <br>
					이미지 <input type="file" name="img" class="form-control"> <br>
					<input type="submit" value="등록" class="form-control" >
				</form>
				
			</div>
			
		</div>
	<%@include file="../Index/footer.jsp" %>


</body>
</html>