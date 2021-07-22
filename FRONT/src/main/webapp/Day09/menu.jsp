<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

		<!-- 부트스트랩 css 가져오기 -->
	<link rel="stylesheet" href="../css/bootstrap.css">
		<!-- 반응형 웹[디바이스크기 자동크기조절] -->
	<meta name="viewport" content ="width=device-width  initial-scale = 1 "> 

	<style type="text/css">
	

		   @font-face {
		    font-family: 'Eulyoo1945-SemiBold';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2102-01@1.0/Eulyoo1945-SemiBold.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
		
					
	
		*{ font-family: Eulyoo1945-SemiBold  }
		
		.navbar-nav li a{ font-size: 15px; color: black;  }
	
	</style>

</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top" style="background-color: white;">
		<div class="container">
			<div class="navbar-header">
			
				<!-- 화면 크기가 작을경우 메뉴 버튼 -->
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> 
					<span class="sr-only"> toggle </span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			
			
				<img alt="" src="logo.png" style="width: 130px; padding: 15px;">
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				
				 <ul class="nav navbar-nav">

					<li class="dropdown">  <!-- 드롭다운 시작 -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false">  상의 <span class="caret"></span> </a>

						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>
					<li> <!-- 드롭다운 끝 -->
					
					<li class="dropdown">  <!-- 드롭다운 시작 -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false"> 하의 </a>

						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>
					<li> <!-- 드롭다운 끝 -->
					
							<li class="dropdown">  <!-- 드롭다운 시작 -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false"> 아우터 </a>

						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>
					<li> <!-- 드롭다운 끝 -->
					
							<li class="dropdown">  <!-- 드롭다운 시작 -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false"> 악세사리 </a>

						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>
					<li> <!-- 드롭다운 끝 -->
					
				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					<li> <a href="#" style="font-size: 10px;"> 공지사항 </a> </li>
					<li> <a href="#" style="font-size: 10px;"> 로그인 </a> </li>
					<li> <a href="#" style="font-size: 10px;"> 회원가입</a> </li>
					<li> <a href="#" style="font-size: 10px;"> 로그아웃</a> </li>
					<li> <a href="#" style="font-size: 10px;"> 관리자페이지</a> </li>
					<li> <img alt="" src="carticon.png" width="30px;" style="padding-top: 10px;"> </li>
				</ul>
			</div>
		</div>
	</nav>
	<!--  jquery  -->
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<!--  부트스트랩 js -->
	<script src="../js/bootstrap.js"></script>
	
</body>
</html>