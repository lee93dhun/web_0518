<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<% 
		// ��ȿ���˻� : js
	%>

	<%@include file="menu.jsp" %>
				<!-- container width: 1200px -->
	<div class="container">
				
		<h3> �� �ۼ� </h3>
		<form name="boardform" method="post" action="boardwritecontroller.jsp" enctype="multipart/form-data" onsubmit="return boardcheck()">
			<div style="margin-top: 30px;">
				<label>����</label>
				<input type="text" class="form-control" name="title" maxlength="30">
			</div>
			
			<div style="margin-top: 30px;">
				<label>����</label>
				<textarea rows="5" cols="" style="resize: none;" class="form-control" name="contents"></textarea>
			</div>
			
			<div style="margin-top: 30px;">
				<label>÷������</label>
				<input type="file" class="form-comtrol" name="file">
			</div>
			<div>
				<input type="submit" value="���" class="form-control pull-right" style="width: 100px;">
			</div>
		</form>
	</div>
	
		<!-- 
			HTML : ������ 
			CSS : HTML �ٹ̱� [ ��Ÿ�� ��Ʈ ]
			JS : 
		 -->
	
	<script type="text/javascript"> <!-- js[javascript] ��ȿ���˻�  -->
		function boardcheck() {
			// boardcheck �޼ҵ� ����		
			if( boardform.title.value.length == 0 ){
				alert("������ �Է����ּ���"); // �޽��� â ���� 
				return false;  
			}
			if( boardform.contents.value.length == 0 ){
				alert("������ �Է����ּ���"); // �޽��� â ���� 
				return false; 
			}
		}
	</script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>