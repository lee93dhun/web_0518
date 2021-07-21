<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		/*���̾ƿ� */
		*{ margin: 0; padding: 0; font-family: "����";}
		header{  height: 100px;}
		.box{  width: 1200px; margin: 0 auto;  }
			/* ���� �̹���*/
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
		
		/*����*/
		li{ list-style-type: none;}
		
		/*��� �޴�*/
		#logo{ float: left; margin:20px 0 0 20px;  }
		#menu{ float: right;  }
		#top_menu{ text-align: right; margin-top: 20px; }
		#main_menu{ margin-top: 20px; font-family: 20px; }
		#main_menu li{ display: inline; margin-left: 80px;}
		
		/*����*/
		/*���̵��*/
			#sub_menu h3{ font-size: 18px; color: #5df0c0; padding: 15px; background-color: #516e7f;}
			#sub_menu li{ padding: 10px; border-bottom: dotted 1px #cccccc;}
		/*���γ���*/
			#main_contents h3{ font-size: 23px; border-bottom: solid 1px #cccccc; padding-bottom: 10px;}
			#main_contents p{ margin-top: 30px; line-height: 180%;}
			#main_contents #figure{ margin-top: 30px; text-align: center;}
			#main_contents li{ padding: 5px;}
		/*Ǫ��*/
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
					�α��� | ȸ������ | ��������
				</div>
				<ul id="main_menu">
					<li> �����̷� </li>
					<li> �������� </li>
					<li> �����۰� </li>
					<li> Ķ���� </li>
					<li> Ŀ�´�Ƽ </li>
				</ul> 
			</div>
		</div>
	</header>
	<section id="main_img">
		
	</section>
	
	<section class="box">
		<div id="sub_menu">
			<h3> �����̷� </h3>
				<ul>
					<li>ī�޶� ���� ���� </li>
					<li>������ ����!</li>
					<li>�ǻ�ü�� ��� </li>
					<li>�������� �ɵ� </li>
					<li>ī�޶� �Կ� ��� </li>
				</ul>
		</div>
	
		<div id="main_contents">
			<h3>ī�޶� ���� ���� </h3>
			<p>DSLR ī�޶󿡼� DSLR�� ��Digital Single Lens Reflex���� ���ν� �츮���δ� ������ �Ͼ� �ݻ�� ī�޶��� �ǹ��մϴ�. DSLR�� ������ ī�޶�ν� ī�޶� ���ο� ���� ���� ����� ��Ÿ�������� ���Ͽ� �����δ��� ������ �Ǿ� ���͸� ������ ���� �� ���δ��� ���Ͽ� �ǻ�ü�� Ȯ���� �� �ְ� �˴ϴ�. </p>
			<div id="figure">
				<img src="../img/dslr.png">
			</div>
			<p>[�׸� 1]�� DSLR ī�޶󿡼� ���͸� ������ ���� ���¸� �����ִµ� ��� ���� ������ ���� ī�޶� ���ο��� ������ ���� ������ ��ġ�� �˴ϴ�.</p>
			<ul>
				<li>�� ���� ī�޶� ��� ����մϴ�.</li>
				<li>�� ���� �ݻ� �ſ￡ �ݻ�Ǿ� �������� ���մϴ�.</li>
				<li>�� ���� ��Ÿ������ �ſ￡ �ݻ�Ǿ� �����δ��� ���մϴ�.</li>
				<li>�� ���� ���� ���� �������͵� ���Ͽ� �ǻ�ü�� �� �� �ֽ��ϴ�.</li>
			</ul>
			
		</div>
	</section>
	
	<footer>
		<div class="box">
			<div id="footer_logo">
				<img alt="" src="../img/footer_logo.png">
			</div>
			<ul id="address">
				<li> ����� ������ �Ｚ�� 1234 ��:123-1234</li>
				<li> TEL:031-123-1234 Email : email@doamin.com</li>
				<li> COPYRIGHT (C) ����� ALL RIGHTS RESERVED</li>
			</ul>
		</div>
	</footer>
</body>
</html>