<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


		<style type="text/css">
			
				.carousel-control{
					background: none !important; /* 효과가 겹쳐있을경우 최우선 */
				}
			</style>
</head>
<body>

	<%@include file="../Index/menu.jsp" %>

		<!--  이미지 슬라이드 = > 캐러셀[부트스트랩용] -->
		<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000" >
				
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slie-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slie-to="1"></li>
				<li data-target="#myCarousel" data-slie-to="2" ></li>
				<li data-target="#myCarousel" data-slie-to="3" ></li>	
			</ol>
			
						<div class="carousel-inner">
							<div class="item active">
								<a href="#"> <img src="../img/main1.png" class="img-responsive center-block"> </a>
							</div>
							<div class="item">
								<a href="#"> <img src="../img/main2.png" class="img-responsive center-block"> </a>
							</div>
							<div class="item">
								<a href="#"> <img src="../img/main3.png" class="img-responsive center-block"> </a>
							</div>
							<div class="item">
								<a href="#"> <img src="../img/main4.png" class="img-responsive center-block"> </a>
							</div>
						</div>
						
				<a class="left carousel-control" href="#myCarousel" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left"></span>
				</a>
				
				<a class="right carousel-control" href="#myCarousel" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right"></span>
				</a>
				
		</div>

	<%@include file="../Index/footer.jsp" %>

</body>
</html>