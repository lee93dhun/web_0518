<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		#web{ /* Ȩ������ ���� ���� */
			width: 800px;
			margin: 0 auto;
		}
		#header{
			height: 80px;
			background-color: green;
		}
		#sidebar{
			width: 200px;
			height: 300px;
			background-color: orange;
			float: left;			/*�������� = ���� */
		}
		#section{
			width: 600px;
			height: 300px;
			background-color: skyblue;
			float: right;				/*�������� = ������ */
		}
		#footer{
			height: 80px;
			background-color: gray;
			clear: both;			/*���� float ���� */
		}
		/* �±׷� ���̾ƿ� �����*/
		header{
			height: 80px;
			background-color: green;
		}
		aside{ 
			width: 200px;
			height: 300px;
			background-color: orange;
			float: left;			/*�������� = ���� */
		}
		section{
			width: 600px;
			height: 300px;
			background-color: skyblue;
			float: right;				/*�������� = ������ */
		}
		footer{
			height: 80px;
			background-color: gray;
			clear: both;			/*���� float ���� */
		}
	
	
	</style>



</head>
<body>
	<div id="web">
		<div id="header">
			��� ��� 
		</div>
		
		<div id="sidebar">
			���̵��
		</div>
		
		<div id="section">
			���� ����
		</div>
		
		<div id="footer">
			�ϴ� Ǫ��
		</div>
	</div>
	
	<div id="web">
		<header>
			��� ��� 
		</header>
			
		<aside>
			���̵��
		</aside>
		
		<section>
			���� ����
		</section>
		
		<footer>
			�ϴ� Ǫ��
		</footer>
	</div>
	
	
	
	
	
	
	
	
	
	

</body>
</html>