<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		/*레이아웃 */
		*{ margin: 0; padding: 0; font-family: "굴림";}
		header{  height: 100px; border: solid 1px red; }
		.box{  width: 1200px; margin: 0 auto; border: solid 1px red; }
		#main_img{ height: 250px; border: solid 1px red; }
		#sub_menu{ width: 250px; height:500px; float: left; border: solid 1px red; }
		#main_contents{width: 946px; height:500px; float: right; border: solid 1px red;  }
		footer{ height:200px; clear: both; border: solid 1px red; }
		
		/*
		
	</style>

</head>
<body>

	<header>
		<div class="box">
			<div id="logo">
				<img alt="" src="/img/logo.png"> 		
			</div>
			<div id="menu">
				<div id="top_menu">
					로그인 | 회원가입 | 공지사항
				</div>
				<ul id="main_menu">
					<li> 사진이론 </li>
					<li> 사진구도 </li>
					<li> 사진작가 </li>
					<li> 캘러리 </li>
					<li> 커뮤니티 </li>
				</ul> 
			</div>
		</div>
	</header>
	<section id="main_img">	
		메인 이미지
	</section>
	
	<section class="box">
		<div id="sub_menu">
			사이드바	
		</div>
	
		<div id="main_contents">
			메인 내용
		</div>
	</section>
	
	<footer>
		<div class="box">
			하단 푸터 
		</div>
	</footer>
</body>
</html>