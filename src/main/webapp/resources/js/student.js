
var student = {
    init : function(id){

       if (id != null && trim(id)){
           window.location.href==="/student/index";
           return;
       }
       <!--获取cookie-->
        var studentId = $.cookie('student');
       alert(studentId);
        if(!studentId == null || isNaN(studentId)){
            alert("cookie");
            var id = $("#id");
            id.attr("value",studentId);
        }
    },
    method : {
    updatePassword : function () {
            $('#submitBtn').click(function () {
                $.post("/student/updatePassword", {
                    oldPassword: $("input[name=oldPassword]").val(),
                    newPassword: $("input[name=newPassword]").val(),
                    rePassword: $("input[name=rePassword]").val()
                }, function (result) {
                    var code = result['code'];
                    var span = $('#modeSpan');
                    if (code == 1) {
                        span.hide().html('<p align="center"><font size="4" color="#ffd700">密码修改成功点击下面返回主页</font>' +
                            '</p></br>' +
                            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
                            '<button class="btn btn-success" id="return">返回主页</button> ');
                        $('#return').click(function () {
                            window.location.href = "/student/index"
                        });
                        span.show();
                    } else {
                        var msg = $('#passwordMessage');
                        msg.html('<p align="center"><font size="5" color="red">' + result['msg'] + '</font></p>');
                        msg.show();
                    }
                });
            });
        },
        validateUpdatePassword : function () {
            $("#update").bootstrapValidator({
                feedbackIcons:{
                    valid: 'glyphicon glyphicon-ok',            // 有效的
                    invalid: 'glyphicon glyphicon-remove',      // 无效的
                    validating: 'glyphicon glyphicon-refresh'   // 刷新的
                },
                fields: {
//          匹配校验规则
                    oldPassword: {
                        // 规则
                        validators: {

                            notEmpty: {
                                message: '密码不能为空'
                            }
                        }
                    },
                    newPassword: {
                        validators: {
                            message: '密码无效',
                            notEmpty: {
                                message: '密码不能为空'
                            },
                            stringLength: {
                                min: 6,
                                max: 18,
                                message: '密码在6-18个字符内'
                            },
                            regexp: {
                                regexp: /^[a-zA-Z0-9_\.]+$/,
                                message: '含有非法字符'
                            },
                            callback: {
                                message: '密码不正确'
                            }
                        }
                    },
                    rePassword: {
                        message: '密码无效',
                        validators: {
                            notEmpty: {
                                message: '用户名不能为空'
                            },
                            stringLength: {
                                min: 6,
                                max: 18,
                                message: '用户名长度必须在6到18之间'
                            },
                            identical: {//相同
                                field: 'newPassword',
                                message: '两次密码不一致'
                            },
                            regexp: {//匹配规则
                                regexp: /^[a-zA-Z0-9_\.]+$/,
                                message: 'The username can only consist of alphabetical, number, dot and underscore'
                            }
                        }
                    }
                }
            });
        },
        chooseSubject : function (v) {
            var value = v.value;
            var url = "/student/choose/submit"+value+"/subject";
            alert(url);
            $.post(url,{},function (result) {
                var code = result['code'];
                var myModal = $('#myModal');
                var info = $('#info');
                if (code==1){
                    info.attr("color","green");
                    info.html(result['data']);
                    myModal.modal({
                        show: true,//显示弹出层
                        backdrop: 'static',//禁止位置关闭
                        keyboard: false//关闭键盘事件
                    });
                    $('#reloadIndex').click(function () {
                        window,location.reload();
                    });
                }else {
                    info.attr("color","red");
                    info.html(result['msg']);
                    myModal.modal({
                        show: true //显示弹出层
                    });
                }
            })
        },
        searchSubject : function () {
            $('#searchSubject').click(function () {
                window.location.href="/student/1/searchAllSubjects";
            });
        },
        query : function (v) {
            var value = v.value;
            var url = "/student/query"+value+"/subject";
            $.get(url,{},function (result) {
                var code = result['code'];
                var myModal = $('#myModal');
                var info = $('#info');
                if (code==1){
                    info.attr("color","green");
                    info.html(result['data']);
                    myModal.modal({
                        show: true,//显示弹出层
                        backdrop: 'static',//禁止位置关闭
                        keyboard: false//关闭键盘事件
                    });
                    $('#reloadIndex').click(function () {
                        window,location.reload();
                    });
                }else {
                    info.attr("color","red");
                    info.html(result['msg']);
                    myModal.modal({
                        show: true //显示弹出层
                    });
                }

            });
        }
    }
}