<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		
		/* 레이아웃*/
		*{ margin: 0; padding: 0; }
		header{ height: 150px; border: solid 1px red;}
		.box{ width: 1100px; margin: 0 auto;  border: solid 1px blue; }
		#main_image{ height: 200px; border: solid 1px red; }
		aside{ width: 250px; height: 300px; float: left; border: solid 1px green;   }
		#main{ width: 846px; height: 300px; float: right; border: solid 1px green;  }
		footer{ height: 150px; clear: both; border: solid 1px red;}
		
		/* 헤더 */
		#logo{ float: left; margin: 40px 0 0 20px; }
		#logo img{ width: 100px;}
		
		li{ list-style-type: none;}
		#menu{ float: right; text-align:right; margin-right: 20px; }
		#menu li{ display: inline-block;}
			/* inline : 위아래 높이/마진 x */
		#top_menu li{ margin: 30px 0 0 10px;}
		#main_menu li{ margin: 40px 0 0 100px; font-weight: bold; font-size: 20px;}
		
	</style>
	















</head>
<body>

	<header>
		<div class="box">
			
			<div id="logo">
					<img alt="" src="logo.png">
			</div>
			
			<div id="menu">
				<ul id="top_menu">
					<li> 유재석님 </li>
					<li> 로그아웃 </li>
					<li> 회원정보 </li>
				</ul>
				
				<ul id="main_menu">
					<li> Home </li>
					<li> 전체상품 </li>
					<li> 게시판 </li>
					<li> 고객센터 </li>
				</ul>
			</div>
			
		</div>
	</header>
	<section id="main_image">
		메인 이미지 
	</section>
	<div class="box">
		<aside>
			사이드바
		</aside>
		<section id="main">
			메인 세션
		</section>
	</div>
	<footer>
		<div class="box">
			푸터
		</div>
	</footer>
</body>
</html>

