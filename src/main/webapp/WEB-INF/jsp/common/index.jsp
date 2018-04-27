<%@page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<div id="container">
    <div id="myCarousel" class="carousel slide">
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
        </ol>
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="picture/1.jpg" alt="First slide" class="img-responsive center-block">
            </div>
            <div class="item">
                <img src="picture/2.jpg" alt="Second slide" class="img-responsive center-block">
            </div>
            <div class="item">
                <img src="picture/3.jpg" alt="Third slide" class="img-responsive center-block">
            </div>
            <div class="item">
                <img src="picture/4.jpg" alt="Four slide" class="img-responsive center-block" />
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<div class="container">
    <ul class="nav nav-pills nav-justified">
        <li class="active"><a href="#">主页</a></li>
        <li><a href="#">学校简介</a></li>
        <li><a href="#">教学研究</a></li>
        <li><a href="#">学生园地</a></li>
        <li><a href="#">教室园地</a></li>
        <li><a href="#">下载中心</a></li>
    </ul>
</div></br>
<div class="container">
    <div class="row" >
        <div class="col-sm-3">
            <a href="#" class="list-group-item active">教务管理系统</a>
            <a href="/login" class="list-group-item ">选课入口</a>
            <a href="#" class="list-group-item ">教师登录</a>
            <a href="/dispacher/login" class="list-group-item ">学生登录</a>
        </div>
        <div class="col-sm-6"
             style="background-color: white;box-shadow:
         inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
            <h3>通知、公告</h3>
            <hr size="2" width="100%"></hr>
        </div>

        <div class="col-sm-3"
             style="background-color: #dedef8;
         box-shadow:inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
            <a>信息服务</a>
        </div>
    </div>
</div>
</body>
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
