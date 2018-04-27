create database db_school_system;

-- ʹ�����ݿ�
use database db_school_system;

-- ���������
create table tb_admin
(id int(11) auto_increment primary key,
 password varchar(20) not null )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;


 --����ѧ����

 create table tb_student(
 id int(40) auto_increment primary key comment 'ѧ��ѧ��',
 name varchar(20) not null comment 'ѧ������',
 age int(4) not null comment 'ѧ������',
 sex varchar(2) not null comment 'ѧ���Ա�',
 password varchar(20) not null comment '����',
 major varchar(10) not null comment 'רҵ',
 inSchoolTime date comment '��ѧʱ��',
 idCard varchar(40) not null comment '���֤',
 num int(4) default 0 comment 'ѡ����'��
 maxnum int(4) not null comment '���ѡ����',
 unique(idCard)
 )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;


-- ����ѧ������

insert into tb_student(name,age,sex,password,major,inSchoolTime,idCard) values('ŷС��',18,'��','120833','����ѧ','2015-09-01','541643199602120833',0,8);
insert into tb_student(name,age,sex,password,major,inSchoolTime,idCard) values('����',18,'��','123456789','����ѧ','2015-09-01','510623199603040321',0,8);
insert into tb_student(name,age,sex,password,major,inSchoolTime,idCard) values('����',17,'Ů','140120','����ѧ','2015-09-01','41031319971214012x',0,8);

--������ʦ��
create table tb_teacher(
id int(40) auto_increment primary key comment '��ʦ֤��',
name varchar(20) not null comment '��ʦ����',
 age int(4) not null comment '��ʦ����',
 sex varchar(2) not null comment '��ʦ�Ա�',
 password varchar(20) not null comment '����',
 major varchar(10) not null comment 'רҵ',
 teachTime date not null comment '�ڿ�ʱ��',
  idCard varchar(40) not null comment '���֤',
 unique(idCard)
 )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;

 --������ʦ����
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('�ŷ�',54,'��','651564','����ѧ','2015-09-01','513456845213651564');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('����',45,'��','354855','��ع���','2015-09-01','865123455612354855');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('����',34,'Ů','142144','��ʷѧ','2015-09-01','321452112542142144');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('����',44,'��','045211','ң��ѧ','2015-09-01','321452112542045211');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('���',51,'Ů','542321','��������','2015-09-01','321452112542542321');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('��С��',29,'Ů','412345','��ѧ','2015-09-01','321452112542412345');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('����Ȼ',43,'��','421548','���˼','2015-09-01','321452112542421548');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('����',45,'Ů','851354','����ѧ','2015-09-01','321452112542851354');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('�Ǿ�',54,'��','845212','�����ϵͳ','2015-09-01','321452112542845212');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('Ǯ����',32,'Ů','325121','���ϵͳ','2015-09-01','321452112542325121');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('��ΰ',45,'��','84512','����ѧ','2015-09-01','32145211254284512');
insert into tb_teacher(name,age,sex,password,major,teachTime,idCard) values('����ٻ',28,'Ů','516521','����ѧ','2015-09-01','32145211254516521');


--����ѧ�Ʊ�
create table tb_subject(
id int(40) auto_increment primary key comment '�γ�id',
name  varchar(20) not null comment '�γ���',
num int not null comment '����',
teacherName  varchar(10) not null comment '�ڿ���ʦ',
hours int(10) not null comment '��ʱ',
startTime date not null comment '��ʼʱ��',
endTime date not null comment '����ʱ��'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ;

--����ѧ�Ʊ�
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('����ѧ',100,'�ŷ�',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('��ع���',100,'����',30,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('ң��ѧ',100,'����',28,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('��������',100,'���',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('�ߵ���ѧ',100,'��С��',36,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('���˼����',100,'����Ȼ',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('��������',100,'�ŷ�',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('����ѧ',100,'��ΰ',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('���������',100,'�Ǿ�',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('����ϵ',100,'����',26,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('���Դ���',100,'��С��',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('����������',100,'����Ȼ',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('ë��˼�����Сƽ����',100,'����Ȼ',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('������',100,'��С��',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('�����Ӧ��',100,'�Ǿ�',16,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('���ݽṹ',100,'Ǯ����',32,'2018-08-04','2018-09-15');
insert into tb_subject(name,num,teacherName,hours,startTime,endTime) values('��������',100,'����ٻ',16,'2018-08-04','2018-09-15');


--������ʦ-�γ̱�
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



--����ѧ��-�γ̱�
create table tb_student_subject(
studnetId int(40) ,
subjectId int(40) ,
primary key(studnetId,subjectId),
constraint fk_student foreign key(studnetId) references tb_student(id),
constraint fk_subjectforstudent foreign key(subjectId) references tb_subject(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

