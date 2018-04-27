<%@page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <jsp:include page="left.jsp"></jsp:include>
        <div class="col-sm-1"></div>
        <div class="col-sm-6" style="background-color : white">
            <h5>基本资料：</h5>
            学号：${student.id}</br></br>
            姓名：${student.name}</br></br>
            性别：${student.sex}</br></br>
            年龄：${student.age}</br></br>
            身份证号：${student.idCard} </br></br>
            入学时间：${student.inSchoolTime}</br></br>
            专业：${student.major}</br></br>

        </div>
        <div class="col-sm-3">
            <p align="right">当前位置 : 个人中心>个人资料</p>
        </div>
    </div>
</div>
<jsp:include page="botton.jsp"></jsp:include>
</body>
<script type="application/javascript">
    $(function () {
        $('#personcenter').attr("class","active");
    })
</script>
</html>