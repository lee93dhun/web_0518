<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="menu.jsp" %>
				<!-- container width: 1200px -->
	<div class="container">
				
		<h3> �� �ۼ� </h3>
		<form method="post" action="boardwritecontroller.jsp">
			<div style="margin-top: 30px;">
				<label>����</label>
				<input type="text" class="form-control" name="title">
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
	
</body>
</html>