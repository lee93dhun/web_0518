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
		header{  height: 100px;}
		.box{  width: 1200px; margin: 0 auto;  }
			/* 메인 이미지*/
			#main_img{ 
				height: 250px; 
				background-image: url("../img/main_img.png"); 
				background-repeat: no-repeat;
				background-position: top center;
				margin-top: 20px;
			}
		#sub_menu{ width: 250px;  float: left; margin-top: 20px; }
		#main_contents{width: 930px;  float: right; margin: 20px 0 20px 20px;  }
		footer{ height:200px; clear: both; background-color: #2c2a29;  }
		
		/*공통*/
		li{ list-style-type: none;}
		
		/*상단 메뉴*/
		#logo{ float: left; margin:20px 0 0 20px;  }
		#menu{ float: right;  }
		#top_menu{ text-align: right; margin-top: 20px; }
		#main_menu{ margin-top: 20px; font-family: 20px; }
		#main_menu li{ display: inline; margin-left: 80px;}
		
		/*메인*/
		/*사이드바*/
			#sub_menu h3{ font-size: 18px; color: #5df0c0; padding: 15px; background-color: #516e7f;}
			#sub_menu li{ padding: 10px; border-bottom: dotted 1px #cccccc;}
		/*메인내용*/
			#main_contents h3{ font-size: 23px; border-bottom: solid 1px #cccccc; padding-bottom: 10px;}
			#main_contents p{ margin-top: 30px; line-height: 180%;}
			#main_contents #figure{ margin-top: 30px; text-align: center;}
			#main_contents li{ padding: 5px;}
		/*푸터*/
		#footer_logo{ float: left; margin: 50px 0 0 30px; }
		#address{ float: right; color: white; margin: 50px 30px 0 0; }
	
		
	</style>

</head>
<body>

	<header>
		<div class="box">
			<div id="logo">
				<img alt="" src="../img/logo.png"> 		
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
		
	</section>
	
	<section class="box">
		<div id="sub_menu">
			<h3> 사진이론 </h3>
				<ul>
					<li>카메라 동작 원리 </li>
					<li>무조건 찍어보자!</li>
					<li>피사체의 배경 </li>
					<li>조리개와 심도 </li>
					<li>카메라 촬영 모드 </li>
				</ul>
		</div>
	
		<div id="main_contents">
			<h3>카메라 동작 원리 </h3>
			<p>DSLR 카메라에서 DSLR은 “Digital Single Lens Reflex”의 약어로써 우리말로는 디지털 일안 반사식 카메라을 의미합니다. DSLR은 디지털 카메라로써 카메라 내부에 들어온 빛이 상단의 펜타프리즘을 통하여 뷰파인더에 맺히게 되어 셔터를 누르기 전에 뷰 파인더를 통하여 피사체를 확인할 수 있게 됩니다. </p>
			<div id="figure">
				<img src="../img/dslr.png">
			</div>
			<p>[그림 1]은 DSLR 카메라에서 셔터를 누르기 전의 상태를 보여주는데 렌즈를 통해 들어오는 빛은 카메라 내부에서 다음과 같은 과정을 거치게 됩니다.</p>
			<ul>
				<li>① 빛이 카메라 렌즈를 통과합니다.</li>
				<li>② 빛이 반사 거울에 반사되어 위쪽으로 향합니다.</li>
				<li>③ 빛이 펜타프리즘 거울에 반사되어 뷰파인더로 향합니다.</li>
				<li>④ 들어온 빛에 의해 뷰파인터들 통하여 피사체를 볼 수 있습니다.</li>
			</ul>
			
		</div>
	</section>
	
	<footer>
		<div class="box">
			<div id="footer_logo">
				<img alt="" src="../img/footer_logo.png">
			</div>
			<ul id="address">
				<li> 서울시 강남구 삼성동 1234 우:123-1234</li>
				<li> TEL:031-123-1234 Email : email@doamin.com</li>
				<li> COPYRIGHT (C) 루바토 ALL RIGHTS RESERVED</li>
			</ul>
		</div>
	</footer>
</body>
</html>