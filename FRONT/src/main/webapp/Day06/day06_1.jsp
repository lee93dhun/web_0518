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
			margin: 0 auto;	/*�ٱ����� : 0 auto  [�ڽ��� �߾ӹ�ġ ]*/
			border: solid 1px red;
			padding: 20px;
		}
		#box2{ text-align: right;}	/*���ڳ� �׸��� ����*/
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

	<p> 1. div ---- span ���� 
	<div id="box1">
		�ȳ��ϼ���
	</div>
	<div id="box2">
		�ȳ��ϼ���2
	</div>
	<div id="box3">
		<img alt="" src="����.jpg">
	</div>
	
	<div id="a"> ��� A</div>	
	<div id="b"> ��� B</div>	
	<div id="c"> ��� C</div>	
	<div id="d"> ��� D</div>	
	
	<div id="f">
		<img alt="" src="����.jpg">
	</div>
	<h3> ���� ���� </h3>
	<p> ���ִ� ���� �Դϴ� </p>
	
	
	
	
	

</body>
</html>