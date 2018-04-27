<%@ page import="com.ougen.entity.Student" %>
<%@page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>

    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                </br></br></br></br></br></br></br></br></br>
                <h2><font color="blue">某某某大学学生登录</font></h2>
                <div class="text-center">
                    <div style="padding: 100px 100px 10px;">
                        <form action="/student/login" class="bs-example bs-example-form" role="form" method="post">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                <input type="text" name="id" id = "id" class="form-control" size=20 placeholder="请输入学号">
                                <span><font color="red">${error.name}</font></span>
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                                <input type="password" name="password" size=20 placeholder="请输入密码" class="form-control">
                                <span><font color="red">${error.password}</font></span>
                            </div>
                            <input type="submit" class="btn btn-primary" value="登   录">
                        </form>
                    </div>

                </div>
            </div>
            <div class="col-sm-4"></div>
        </div>
    </div>
<!--学生是否登录过-->
<input type="hidden" value="${student.id}" id="studentId"/>
</body>
<script src="/resources/js/student.js"></script>
<%--jQuery Cookie操作插件--%>
<script src="https://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<script src="/resources/js/common/flx.js"></script>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script type="application/javascript">
    $(function () {
        var id = $('#studentId').val();
        alert(id);
        student.init(id);
    });
</script>
</html>