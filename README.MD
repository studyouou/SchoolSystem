##############################ʱ�䣺 2018/04/18##########################################
ϵͳ����
1������ssm��ܣ�����sql���������
2������redis��Ϊ����

���ݿ⣨db_school_system)�������
1�������ǹ�������admin����ͳһ����ѧУ�γ�
id(Ψһ��ʶ�����û���)��password���������룩��


2��ѧ����(tb_student)������ѧ����Ϣ
id��ѧ��idΨһ��ʶ������name��ѧ����������age�����䣩��sex���Ա𣩣�password����¼���룩��num���γ���������major��רҵ����inSchoolTime����ѧʱ�䣩��idCard������֤��Ϣ����



3����ʦ��(tb_teacher)��������ʦ��Ϣ
id����ʦΨһ��ʶ������name����ʦ��������age�����䣩��sex���Ա𣩣�password����¼���룩��major��רҵ����teachTime(�ڿ�ʱ�䣩��idCard������֤��Ϣ����



4���γ�(tb_subject)�������γ���Ϣ
id��Ψһ��ʶ������name���γ����ƣ���teacherName���ο���ʦ����hours��ѧʱ����startTime������ʱ�䣩��endTime��������ֹʱ�䣩��


5����ʦ-�γ̱�(tb_teacher_subject)
teacherId(�����������subjectId�����������


6��ѧ��-�γ̱�(tb_student_subject)
studentId(�������),subjectId(�������)

mvc�ܲ�
entity�� ����Ҫ����modelʵ�壻��ΪStudent�ࣨ��Ҫӳ��student������Teacher�ࣨӳ��teacher������Subject�ࣨӳ��subject������

dao�㣺��Ҫ�������ݿ⣬�������ݿ���в�����

service�㣺����dao���controller�㣬������һЩ�߼�����������������߼�������

controller�㣺����ҳ�����ȣ�

�����ļ�
mapper�ļ��У�����dao���ӳ���ļ���
spring�㣺webӦ�õ������ļ���

���Ӧ�û�ûд�꣬���滹�����