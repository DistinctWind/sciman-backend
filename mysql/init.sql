drop database if exists sciman;
create database sciman;
use sciman;

# user table

create table user(
    id int unsigned auto_increment primary key comment '登录用户id',
    username varchar(32) unique comment '唯一用户名',
    password varchar(32) comment '用户密码',
    classification int comment '用户分类：0=超级管理员'
);

insert into user(username, password, classification) values
('hack', 'hack', -1),
('admin', 'admin@123', 0);

# information tables

create table laboratory(
    id int unsigned auto_increment primary key comment '研究室id',
    name varchar(32) not null comment '研究室名称',
    orientation varchar(256) comment '研究方向介绍'
) comment '研究室信息表';

create table venue(
    id int unsigned auto_increment primary key comment '办公场所id',
    laboratory_id int unsigned not null comment '所属实验室id',
    area double not null comment '办公场所面积，单位平方米',
    address varchar(256) not null comment '办公场所地址',
    foreign key (laboratory_id) references laboratory(id)
) comment '办公场所表';

create table staff(
    id int unsigned auto_increment primary key comment '主任id',
    researcher_id int unsigned not null comment '科研人员id',
    laboratory_id int unsigned not null comment '研究室id',
    due_date date not null comment '任期'
) comment '主任表';

create table secretary(
    employee_id int unsigned primary key comment '秘书工号',
    name varchar(12) not null comment '姓名',
    gender tinyint unsigned not null comment '性别：1=男，2=女',
    age tinyint unsigned not null comment '年龄',
    employ_date date not null comment '聘用时间',
    duty varchar(256) comment '职责'
) comment '秘书信息表';

create table researcher(
    employee_id int unsigned primary key comment '科研人员工号',
    laboratory_id int unsigned not null comment '所属实验室id',
    name varchar(12) not null comment '姓名',
    gender tinyint unsigned not null comment '性别：1=男，2=女',
    title varchar(256) comment '职称',
    age tinyint unsigned not null comment '年龄',
    orientation varchar(256) comment '研究方向介绍'
) comment '科研人员信息表';

create table contact(
    id int unsigned primary key comment '联系人id',
    office_phone_no char(9) comment '办公电话',
    mobile_phone_no char(11) comment '移动电话',
    email_address varchar(64) comment '邮箱地址'
) comment '外部联系人信息表';

create table organization(
    id int unsigned primary key auto_increment comment '外部单位id',
    name varchar(32) comment '外部单位名称',
    address varchar(128) comment '外部单位地址',
    principal_contact_id int unsigned comment '负责人联系方式索引id'
) comment '外部单位信息表';

create table project(
    project_id int unsigned primary key comment '项目号',
    main_researcher_id int unsigned comment '项目负责人id',
    name varchar(64) comment '项目名称',
    content varchar(512) comment '项目内容',
    budget decimal(20, 2) comment '项目预算，单位元',
    begin_date date comment '项目起始时间',
    end_date date comment '项目完成时间',
    client_organization_id int unsigned comment '委托方单位id',
    monitor_organization_id int unsigned comment '质量检测方单位id'
) comment '项目信息表';

create table subproject(
    id int unsigned auto_increment primary key comment '子课题id',
    project_id int unsigned comment '所属项目id',
    principal_id int unsigned comment '科研人员负责人id',
    due_date date comment '完成时间要求',
    budget decimal(20, 2) comment '子课题经费',
    tech_description varchar(512) comment '技术指标'
) comment '子课题信息表';

create table achievement(
    id int unsigned auto_increment primary key comment '科研成果id',
    name varchar(64) comment '科研成果名称',
    achieve_date date comment '成果取得时间',
    ranking_factor double comment '在排名中的比重',
    classification tinyint comment '分类信息：1=发明专利；2=实用新型专利；3=外观专利；4=论文；5=软件著作权'
);

# relationships
create table serve(
    id int unsigned auto_increment primary key comment '秘书服务关系id',
    secretary_id int unsigned comment '秘书id',
    laboratory_id int unsigned comment '所属研究室id'
) comment '秘书服务研究室关系表';

create table organization_secondary_contact(
    id int unsigned auto_increment primary key comment '外部单位联系人索引id',
    organization_id int unsigned comment '所属外部单位id',
    contact_id int unsigned comment '外部单位联系人id'
) comment '外部单位联系人关系表';

create table project_coworker_organization(
    id int unsigned auto_increment primary key comment '项目合作方索引id',
    project_id int unsigned comment '项目id',
    coworker_organization_id int unsigned comment '项目合作方id'
) comment '项目合作方关系表';

create table achievement_contribution(
    id int unsigned auto_increment primary key comment '科研成果索引id',
    researcher_id int unsigned comment '在该科研成果中做出贡献的科研人员id',
    achievement_id int unsigned comment '科研成果id'
) comment '科研人员贡献科研成果关系表';

# tri-relation tables

create table attend_project(
    id int unsigned auto_increment primary key comment '研究人员参与项目索引id',
    researcher_id int unsigned comment '研究人员id',
    project_id int unsigned comment '参与项目id',
    work_time int unsigned comment '工时',
    work_amount double comment '工作量占项目总量的比值'
) comment '研究人员参与项目关系表';
