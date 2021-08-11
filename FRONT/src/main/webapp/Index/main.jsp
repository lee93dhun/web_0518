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
		
		/* 상품 목록 제목 */
		.goodslist_tit{
			margin-top: 100px;
			margin-bottom: 60px;
			text-align: center;
		}
		.goodslist_detail{
			color: gray;
			margin-top: 15px;
			padding-bottom: 30px; 
			border-bottom: 4px solid orange;
		}
		
		/* 상품 목록 */
		ul{
			margin-top: 20px 0px;
		}
		ul .main_li{
			margin-right: 15px;
			list-style-type: none;
			float: left;
			margin-top: 30px;
		}
		ul .main_li img{  
			width: 200px; /* 부트스트랩 컨테이너 전체크기 => 1200px; */
			border-radius: 5%; /* 모서리 곡선*/
			border-bottom : 1px solid orange;
			margin-bottom: 20px;
		}
		ul .main_li img:hover {
			/* 이미지에 마우스를 올렸을때 */
			transform: scale( 1.1 ) /*확대 1.1배*/
		}
		.goods_info{
			width: 200px;
		}
		.category{
			line-height: 1.5em;
			color: gray;
		}
		.productname{
			line-height: 1.5em;
			font-size: 18px;
			display: block;
		}
		.price{
			line-height: 1.5em;
			text-align: right;
			color: black;
			display: block;
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
<!----------------------------  캐러셀 END ----------------------->	
	
		<div class="container">
			
			<div class="goodslist" id="goodslist_best">
				
				<div class="goodslist_tit">
					<h3> 베스트 상품 </h3>
					<span class="goodslist_detail"> 다양한 BEST 주문 상품들을 만나보세요. </span>
				</div>
			
				<ul>
					<!-- 반복문 -->
					<li class="main_li">
						<a href="#"> <img alt="" src="../img/몬스터2버거.png"> </a> 
						<div class="goods_info">
							<span class="category">분류명</span>
							<span class="productname">제품명</span>
							<span class="price">20,000</span>
						</div>
					</li>
				</ul>
			</div>
		</div>	
		
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	<%@include file="../Index/footer.jsp" %>

</body>
</html>