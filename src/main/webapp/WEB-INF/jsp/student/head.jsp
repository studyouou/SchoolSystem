<%@page contentType="text/html; charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <style type="text/css">
        body {
            background-color: whitesmoke;
        }
 </style>
<div class="container">
    <div class="row">
        <div class="col-sm-5">
            <h1>某某某大学教务管理系统</h1>
        </div>
        <div class="col-sm-3">

        </div>
        <div class="col-sm-4">
            </br>
            ${student.name}(${student.id})
            <button class="btn btn-default" onclick="update()">
                <span class="glyphicon glyphicon-cog"></span>修改密码</button> &nbsp;&nbsp;| &nbsp;&nbsp;
            <button class="btn btn-default" onclick="exit()">
                <span class="glyphicon glyphicon-off"></span>退出
            </button>
        </div>
    </div>
</div></br>
<div class="container">
    <ul class="nav nav-pills nav-justified">
        <li id="mainindex"><a href="/student/index">主页</a></li>
        <li class="dropdown" id="personcenter">
            <a class="dropdown-toggle"  data-toggle="dropdown" href="#">个人中心
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li>
                    <a href="/student/detail">个人资料</a></li>
                <li>
                    <a href="#">惩罚祥明</a></li>
                <li>
                    <a href="#">在读证明</a></li>
                <li>
                    <a href="/student/updateindex">密码修改</a></li>
            </ul>
        </li>
        <li id="infoquery"><a href="/student/detail">信息查询</a></li>
        <li id="choosesubject"><a href="/student/1/chooseSujectindex" >选课</a></li>
        <li><a href="#">重修报名</a></li>
        <li><a href="#">成绩</a></li>
        <li><a href="#">学生评教</a></li>
    </ul>
</div>
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-validator/0.5.1/js/bootstrapValidator.min.js"></script>
<script type="application/javascript">
    function update(){
        window.location.href="/student/updateindex";
    }
    function exit() {
        window.location.href="/student/exit";
    }

</script>
<script type="application/javascript">
    $(function () {
        var student = <%= session.getAttribute("student") %>;
        if (student == null){
            window.location.href = "/dispacher/login"
        }
    })
</script>

