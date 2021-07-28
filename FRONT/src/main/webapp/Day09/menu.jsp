<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

		<!-- ��Ʈ��Ʈ�� css �������� -->
	<link rel="stylesheet" href="../css/bootstrap.css">
		<!-- ������ ��[����̽�ũ�� �ڵ�ũ������] -->
	<meta name="viewport" content ="width=device-width  initial-scale = 1 "> 

	<style type="text/css">
	
		@font-face {
		    font-family: 'CookieRunOTF-Bold';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_twelve@1.0/CookieRunOTF-Bold00.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
				
				*{
					  font-family: 'CookieRunOTF-Bold';
				
				}
		
		.navbar-nav li a{ font-size: 15px; color: black;  }
	
	</style>

</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top" style="background-color: white;" >
		<div class="container">
			<div class="navbar-header">
			
				<!-- ȭ�� ũ�Ⱑ ������� �޴� ��ư -->
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> 
					<span class="sr-only"> toggle </span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			
			
				<a href="main.jsp"> <img alt="" src="logo.png" style="width: 130px; padding: 15px;"> </a> 
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				
				 <ul class="nav navbar-nav">

					<li class="dropdown">  <!-- ��Ӵٿ� ���� -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false">  ���� <span class="caret"></span> </a>

						<ul class="dropdown-menu">
							<li> <a href="#">����Ű</a> </li>
							<li> <a href="#">�Ƶ�ٽ�</a> </li>
							<li> <a href="#">�ٶ�</a> </li>
						</ul>
					<li> <!-- ��Ӵٿ� �� -->
					
					<li class="dropdown">  <!-- ��Ӵٿ� ���� -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false"> ���� </a>

						<ul class="dropdown-menu">
							<li> <a href="#">����Ű</a> </li>
							<li> <a href="#">�Ƶ�ٽ�</a> </li>
							<li> <a href="#">�ٶ�</a> </li>
						</ul>
					<li> <!-- ��Ӵٿ� �� -->
					
							<li class="dropdown">  <!-- ��Ӵٿ� ���� -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false"> �ƿ��� </a>

						<ul class="dropdown-menu">
							<li> <a href="#">����Ű</a> </li>
							<li> <a href="#">�Ƶ�ٽ�</a> </li>
							<li> <a href="#">�ٶ�</a> </li>
						</ul>
					<li> <!-- ��Ӵٿ� �� -->
					
							<li class="dropdown">  <!-- ��Ӵٿ� ���� -->
						<a href="#" class="dropdown-toggle" 
						data-toggle="dropdown" role="button" 
						aria-haspopup="true" aria-expanded="false"> �Ǽ��縮 </a>

						<ul class="dropdown-menu">
							<li> <a href="#">����Ű</a> </li>
							<li> <a href="#">�Ƶ�ٽ�</a> </li>
							<li> <a href="#">�ٶ�</a> </li>
						</ul>
					<li> <!-- ��Ӵٿ� �� -->
					
				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					<% 
						// day11 �α�����Ʈ�ѿ��� ���� �ο� ������ �ڵ� 
						
						String logid = (String)session.getAttribute("logid");
						if( logid !=null){
						%>
							<li> <%=logid %>�� �ȳ��ϼ��� </li>
						<%	
						}
					%>
					<li> <a href="boardlist.jsp" style="font-size: 10px;"> �������� </a> </li>
					<li> <a href="#" style="font-size: 10px;"> �α��� </a> </li>
					<li> <a href="#" style="font-size: 10px;"> ȸ������</a> </li>
					<li> <a href="#" style="font-size: 10px;"> �α׾ƿ�</a> </li>
					<li> <a href="#" style="font-size: 10px;"> ������������</a> </li>
					<li> <img alt="" src="carticon.png" width="30px;" style="padding-top: 10px;"> </li>
				</ul>
			</div>
		</div>
	</nav>
	<!--  jquery  -->
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<!--  ��Ʈ��Ʈ�� js -->
	<script src="../js/bootstrap.js"></script>
	
</body>
</html>