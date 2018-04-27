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
                <div class="text-center">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <td>课程名称</td>
                            <td>授课老师</td>
                            <td>课时</td>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="subject" items="${page.list}">
                            <tr>
                                <td>${subject.name}</td>
                                <td>${subject.teacherName}</td>
                                <td>${subject.hours}</td>
                                <td>
                                    <button class="btn btn-info" value="/${student.id}/${subject.id}" onclick="quitSubject(this)">退 课</button>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                    <ul class="pagination">
                        <li><a href="/student/${page.hasPrePage ?page.currentPage-1 : 1}/searchAllSubjects">&laquo;</a></li>
                        <c:forEach var="num" begin="1" end="${page.allPages}">
                            <li class="${page.currentPage eq num ? "active":""}"><a href="/student/${num}/searchAllSubjects">${num}</a></li>
                        </c:forEach>
                        <li><a href="/student/${page.hasNextPage ?  page.currentPage+1:page.allPages}/searchAllSubjects">&raquo;</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-3">
                <p align="right">当前位置 : 详细课程</p>
            </div>
        <jsp:include page="botton.jsp"></jsp:include>
        <!---返回提示消息-->
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="text-center">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal"
                                    aria-hidden="true">×
                            </button>
                            <h4 class="modal-title" id="myModalLabel">
                                <font size="4" color="blue">选课提示</font>
                            </h4>
                        </div>
                        <div class="modal-body">
                            <font id="info"  size="4">选课成功</font></br>
                            <button type="button" class="btn btn-primary"
                                    data-dismiss="modal" id="reloadIndex">返回
                            </button>
                        </div>

                    </div>
                </div>
            </div>
        </div>
</body>
<script src="/resources/js/student.js">
    function quitSubject(v){
        $('#choosesubject').attr("class","active");
        student.method.query(v);
    }
</script>
</html>