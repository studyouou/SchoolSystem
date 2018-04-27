create database db_school_system;

-- 使用数据库
use database db_school_system;

-- 创建管理表
create table tb_admin
(id int(11) auto_increment primary key,
 password varchar(20) not null )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;


 --创建学生表

 create table tb_student(
 id int(40) auto_increment primary key comment '学生学号',
 name varchar(20) not null comment '学生姓名',
 age int(4) not null comment '学生年龄',
 sex varchar(2) not null comment '学生性别',
 password varchar(20) not null comment '密码',
 major varchar(10) not null comment '专业',
 inSchoolTime date comment '入学时间',
 idCard varchar(40) not null comment '身份证',
 num int(4) default 0 comment '选课数'，
 maxnum int(4) not null comment '最大选课数',
 unique(idCard)
 )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;


-- 插入学生数据

insert into tb_student(name,age,sex,password,major,inSchoolTime,idCard) values('欧小朴',18,'男','120833','地质学','2015-09-01','541643199602120833',0,8);
insert into tb_student(name,age,sex,password,major,inSchoolTime,idCard) values('张三',18,'男','123456789','地质学','2015-09-01','510623199603040321',0,8);
insert into tb_student(name,age,sex,password,major,inSchoolTime,idCard) values('李欣',17,'女','140120','地质学','2015-09-01','41031319971214012x',0,8);

--创建老师表
create table tb_teacher(
id int(40) auto_increment primary key comment '老师证号',
name varchar(20) not null comment '老师姓名',
 age int(4) not null comment '老师年龄',
 sex varchar(2) not null comment '老师性别',
 password varchar(20) not null comment '密码',
 major varchar(10) not null comment '专业',
 teachTime date not null comment '授课时间',
  idCard varchar(40) not null comment '身份证',
 unique(idCard)
 )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;

 --插入老师数据
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('张峰',54,'男','651564','地质学','2015-09-01','513456845213651564');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('李四',45,'男','354855','大地构造','2015-09-01','865123455612354855');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('孙琪',34,'女','142144','地史学','2015-09-01','321452112542142144');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('王五',44,'男','045211','遥感学','2015-09-01','321452112542045211');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('李冰',51,'女','542321','地球物理','2015-09-01','321452112542542321');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('赵小晴',29,'女','412345','数学','2015-09-01','321452112542412345');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('福利然',43,'男','421548','马克思','2015-09-01','321452112542421548');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('邓丽',45,'女','851354','经济学','2015-09-01','321452112542851354');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('乔军',54,'男','845212','计算机系统','2015-09-01','321452112542845212');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('钱俊蓉',32,'女','325121','软件系统','2015-09-01','321452112542325121');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('杜伟',45,'男','84512','金融学','2015-09-01','32145211254284512');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('李晓倩',28,'女','516521','艺术学','2015-09-01','32145211254516521');


--创建学科表
create table tb_subject(
id int(40) auto_increment primary key comment '课程id',
name  varchar(20) not null comment '课程名',
num int not null comment '人数',
teacherName  varchar(10) not null comment '授课老师',
hours int(10) not null comment '课时',
startTime date not null comment '开始时间',
endTime date not null comment '结束时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ;

--插入学科表
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('地质学',100,'张峰',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('大地构造',100,'李四',30,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('遥感学',100,'王五',28,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('地球物理',100,'李冰',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('高等数学',100,'赵小晴',36,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('马克思主义',100,'福利然',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('地球物理',100,'张峰',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('经济学',100,'杜伟',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('计算机基础',100,'乔军',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('第四系',100,'孙琪',26,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('线性代数',100,'赵小晴',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('形势与政策',100,'福利然',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('毛泽东思想与邓小平理论',100,'福利然',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('概率论',100,'赵小晴',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('计算机应用',100,'乔军',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('数据结构',100,'钱俊蓉',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('艺术欣赏',100,'李晓倩',16,'2018-08-04','2018-09-15');


--创建老师-课程表
create table tb_teacher_subject(
teacherId int(40) ,
subjectId int(40) ,
primary key(teacherId,subjectId),
constraint fk_teacher foreign key(teacherId) references tb_teacher(id),
constraint fk_subjectforteacher foreign key(subjectId) references tb_subject(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

insert into tb_teacher_subject(teacherId,subjectId) values(1000,1);
insert into tb_teacher_subject(teacherId,subjectId) values(1001,3);
insert into tb_teacher_subject(teacherId,subjectId) values(1002,11);
insert into tb_teacher_subject(teacherId,subjectId) values(1003,4);
insert into tb_teacher_subject(teacherId,subjectId) values(1004,5);
insert into tb_teacher_subject(teacherId,subjectId) values(1000,8);
insert into tb_teacher_subject(teacherId,subjectId) values(1005,6);
insert into tb_teacher_subject(teacherId,subjectId) values(1005,12);
insert into tb_teacher_subject(teacherId,subjectId) values(1005,15);
insert into tb_teacher_subject(teacherId,subjectId) values(1000,5);
insert into tb_teacher_subject(teacherId,subjectId) values(1006,7);
insert into tb_teacher_subject(teacherId,subjectId) values(1006,13);
insert into tb_teacher_subject(teacherId,subjectId) values(1006,14);
insert into tb_teacher_subject(teacherId,subjectId) values(1008,10);
insert into tb_teacher_subject(teacherId,subjectId) values(1008,16);
insert into tb_teacher_subject(teacherId,subjectId) values(1009,17);
insert into tb_teacher_subject(teacherId,subjectId) values(1010,9);



--创建学生-课程表
create table tb_student_subject(
studnetId int(40) ,
subjectId int(40) ,
primary key(studnetId,subjectId),
constraint fk_student foreign key(studnetId) references tb_student(id),
constraint fk_subjectforstudent foreign key(subjectId) references tb_subject(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

