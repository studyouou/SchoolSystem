<%@page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap-validator/0.5.1/css/bootstrapValidator.min.css">
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <jsp:include page="left.jsp"></jsp:include>
            <div class="col-sm-1"></div>
            <div class="col-sm-6" style="background-color : white">
                <div style="padding: 100px 100px 10px;">
                    <span id="modeSpan">
                        <form  class="bs-example bs-example-form" role="form" id="update" method="post">
                            <div class="input-group input-group-lg">
                                <span class="input-group-addon">*</span>
                                <input type="password" name="oldPassword" id="oldPassword"
                                       class="form-control" placeholder="请输入密码："><span id="passwordMessage"></span>
                            </div><br>
                            <div class="input-group input-group-lg">
                                <span class="input-group-addon">*</span>
                                <input type="password" name="newPassword" id="newPassword"
                                       class="form-control" placeholder="请输入新密码" >
                            </div><br>
                            <div class="input-group input-group-lg">
                                <span class="input-group-addon">*</span>
                                <input type="password" name="rePassword" id="rePassword"
                                       class="form-control"  placeholder="确认密码" >
                            </div><br>
                            <button type="button" class="btn btn-primary" id="submitBtn">修  改</button>
                        </form>
                    </span>
                </div>
            </div>
            <div class="col-sm-3">
                <p align="right">当前位置 : 个人中心>密码修改</p>
            </div>
    </div>

</div>
<jsp:include page="botton.jsp"></jsp:include>
</body>
<script src="/resources/js/student.js"></script>
<script type="application/javascript">
    $(function () {
        student.method.validateUpdatePassword();
        student.method.updatePassword();
        $('#personcenter').attr("class","active");
    })
</script>
</html>