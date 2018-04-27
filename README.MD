##############################时间： 2018/04/18##########################################
系统构架
1，采用ssm框架，这样sql语句更加灵活
2，采用redis作为缓存

数据库（db_school_system)，表设计
1，首先是管理表（admin），统一管理学校课程
id(唯一标识符，用户名)，password（服务密码）。


2，学生表(tb_student)：描述学生信息
id（学生id唯一标识符），name（学生姓名），age（年龄），sex（性别），password（登录密码），num（课程数量），major（专业），inSchoolTime（入学时间），idCard（身份证信息）。



3，老师表(tb_teacher)：描述老师信息
id（老师唯一标识符），name（老师姓名），age（年龄），sex（性别），password（登录密码），major（专业），teachTime(授课时间），idCard（身份证信息）。



4，课程(tb_subject)：描述课程信息
id（唯一标识符），name（课程名称），teacherName（任课老师），hours（学时），startTime（报名时间），endTime（报名截止时间）。


5，老师-课程表(tb_teacher_subject)
teacherId(外键关联），subjectId（外键关联）


6，学生-课程表(tb_student_subject)
studentId(外键关联),subjectId(外键关联)

mvc架层
entity层 ：主要储存model实体；分为Student类（主要映射student表），Teacher类（映射teacher表），Subject类（映射subject表）。

dao层：主要连接数据库，并对数据库进行操作。

service层：连接dao层和controller层，并进行一些逻辑操作，用事务进行逻辑处理。

controller层：处理页面结果等；

配置文件
mapper文件夹：配置dao层的映射文件。
spring层：web应用的配置文件。

这个应用还没写完，后面还会更新