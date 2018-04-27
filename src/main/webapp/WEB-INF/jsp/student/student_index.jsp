<%@page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>

</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <jsp:include page="left.jsp"></jsp:include>
        <div class="col-sm-1"></div>
        <div class="col-sm-6" style="background-color : white">
            </br><font color="blue">教务通知</font></br></br>
            <font color="red">在读证明、学生成绩单盖章，请于每周一、三、五下午(14:30-18:00)到教务处105办公室办理，其他时间不受理。</br></br>
                重新学习报名、刷分报名 、报名结果查询</font></br></br></br>
            <font color="blue">办事指南</font></br></br>
            <div class="row">
                <div class="col-sm-6">
                    <div class="lead">学籍、电子注册 </div>
                    <a hreg="#">变更姓名、身份证号</a></br>
                    <a hreg="#">补办学生证</a></br>
                    <a hreg="#">休学、复学、退学</a></br>
                    <a hreg="#">提前、延后毕业</a></br></br>
                    <div class="lead">其他</div>
                    <a hreg="#">学生活动教室借用申请</a></br>
                    <a hreg="#">在读证明成绩单盖章程</a></br>
                    <a hreg="#">成绩单盖章</a>
                </div>
                <div class="col-sm-6">
                    <div class="lead">选课、考试、成绩</div>
                    <a hreg="#">  补选课、退课</a></br>
                    <a hreg="#">课程考试成绩查询</a></br>
                    <a hreg="#">缓考申请</a></br>
                    <a hreg="#">课程免修申请</a></br>
                </div>
            </div>
        </div>
        <div class="col-sm-3">
            <p align="right">当前位置 : 首页</p>
            <font color="blue">快捷入口</font></br></br>
            <div class="row">
                <div class="col-sm-5">
                    <label>
                        <a>查看结果</a>
                    </label></br></br>
                    <label>
                        <a></a>考试安排
                    </label></br></br>
                    <label >
                        <a> 学籍信息</a>
                    </label>
                </div>
                <div class="col-sm-2"></div>
                <div class="col-sm-5">
                    <label>
                        <a>选课结果</a>
                    </label></br></br>
                    <label>
                        <a>成绩单</a>
                    </label></br></br>
                    <label>
                        <a> 教室查询</a>
                    </label>
                </div>
            </div>
            </span></br></br></br>
            表格下载：</br></br>
        </div>
    </div>
</div>
<jsp:include page="botton.jsp"></jsp:include>
</body>
<script type="application/javascript">
    $(function () {
        $('#mainindex').attr("class","active");
    })
</script>
</html>