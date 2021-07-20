<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		#box1 , #box2 , #box3{
			width: 400px;
			margin: 0 auto;	/*바깥여백 : 0 auto  [박스의 중앙배치 ]*/
			border: solid 1px red;
			padding: 20px;
		}
		#box2{ text-align: right;}	/*글자나 그림의 정렬*/
		#box3{ text-align: center; }
		
		div{
			width: 100px;
			height: 50px;
			margin: 10px;
			color: black;
			text-align: center;
		}
		
		#a , #b { background-color: green;}
		#c{ float:right; background-color: blue;}
		#d{ float:left; background-color: gray;}
		#f{ float:left; }
		h3{ clear: both;}
	
	</style>

</head>
<body>

	<p> 1. div ---- span 차이 
	<div id="box1">
		안녕하세요
	</div>
	<div id="box2">
		안녕하세요2
	</div>
	<div id="box3">
		<img alt="" src="수박.jpg">
	</div>
	
	<div id="a"> 요소 A</div>	
	<div id="b"> 요소 B</div>	
	<div id="c"> 요소 C</div>	
	<div id="d"> 요소 D</div>	
	
	<div id="f">
		<img alt="" src="수박.jpg">
	</div>
	<h3> 수박 과일 </h3>
	<p> 맛있는 수박 입니다 </p>
	
	
	
	
	

</body>
</html>