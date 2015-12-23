CREATE DATABASE RESUMEMANAGER DEFAULT CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;
USE RESUMEMANAGER;

--简历信息
drop table if exists resume;
create table resume 
(
   resumeId        varchar(45) not null comment '简历ID',
   resumeName          varchar(45) comment '简历名称',
   desiredSalary       varchar(45) comment '期望月薪',
   currentCareerStatus varchar(45) comment '当前工作状态',
   schoolNameAll      varchar(45) comment '毕业院校',
   desiredEmploymentType varchar(45) comment '期望工作性质',
   desiredJobType     varchar(45) comment '期望职位类别',
   desiredCity         varchar(45) comment '期望工作地点',
   majorNameAll       varchar(45) comment '专业名称',
   jobNameAll         varchar(45) comment '职位名称',
   educationLevel      varchar(45) comment '学历',
   gender               varchar(4) comment '性别',
   birthYear           varchar(4) comment '年龄',
   currentCity         varchar(45) comment '年龄',
   dateModified        varchar(45) comment '更新时间',
   constraint pkResume primary key (resumeId)
)comment '简历信息' charset=utf8 engine=innodb;

--工作经验
drop table if exists workexperience;
create table workexperience 
(
   resumeId           varchar(45)          not null comment '简历id',
   expnum             varchar(45)          not null comment '经验编号',
   cmpanyName        varchar(45) comment '企业名称',
   industry           varchar(45) comment '行业类别',
   jobtype            varchar(45) comment '职位类别',
   jobname            varchar(45) comment '职位名称',
   workstartDate     varchar(45) comment '工作开始时间',
   workendDate       varchar(45) comment '工作截至时间',
   salaryScope       varchar(45) comment '职位月薪(税前)',
   sellResumecont    varchar(2000) comment '工作描述',
   companyType       varchar(45) comment '企业性质',
   companySize       varchar(45) comment '企业规模',
   constraint pk_workexperience primary key (resumeId, expnum)
)comment '工作经验' charset=utf8 engine=innodb;

--在校学习情况
drop table if exists studyatschool;
create table studyatschool 
(
   resumeId           varchar(45)          not null comment '简历id',
   burse              varchar(45) comment '奖学金',
   description        varchar(2000) comment '校内活动/职务描述',
   constraint pkStudyatschool primary key (resumeId)
)comment '在校学习情况' charset=utf8 engine=innodb;

--获得奖项
drop table if exists reward;
create table reward 
(
   resumeId          varchar(45)          not null comment '简历id',
   rewardId          varchar(45)          not null comment '奖项id',
   rewardName        varchar(45) comment '名称',
   rewardLevel       varchar(4) comment '等级',
   rewardDate        varchar(45) comment '获奖时间',
   descriptionReward varchar(2000) comment '描述',
   constraint pkReward primary key (resumeId, rewardId)
)comment '获得奖项' charset=utf8 engine=innodb;

--在校实践经验
drop table if exists practice;
create table practice 
(
   resumeId          varchar(45) not null comment '简历id',
   practiceId        varchar(45) not null comment '时间经验id',
   practiceName      varchar(45) comment '名称',
   practiceStartDate varchar(20) comment '开始时间',
   practiceEndDate  varchar(20) comment '结束时间',
   descriptionPractice varchar(2000) comment '实践描述',
   constraint pkReward primary key (resumeId, practiceId)
)comment '在校实践经验' charset=utf8 engine=innodb;

--语言
drop table if exists language;
create table language 
(
   resumeId          varchar(45)          not null comment '简历id',
   languagesId       varchar(45)          not null comment '语言id',
   readability        varchar(4) comment '读写能力',
   spokenability      varchar(4) comment '听说能力',
   constraint pkLanguage primary key (resumeId, languagesId)
)comment '语言' charset=utf8 engine=innodb;

--自我评价
drop table if exists selfevaluete;
create table selfevaluete 
(
   resumeId           varchar(45) not null comment '简历id',
   customCommenttitle varchar(45) comment '标题',
   commentcontent     varchar(2000) comment '内容',
   constraint pkLanguage primary key (resumeId)
)comment '自我评价' charset=utf8 engine=innodb;

--项目经验
drop table if exists projectexperience;
create table projectexperience 
(
   resumeId           varchar(45)          not null comment '简历id',
   projectId          varchar(45)          not null comment '项目id',
   projectName       varchar(45) comment '项目名称',
   projectStartDate varchar(45) comment '开始时间',
   projectEndDate   varchar(45) comment '结束时间',
   itFlag            varchar(2) comment '是否属于IT项目',
   software           varchar(45) comment '软件环境',
   hardware           varchar(45) comment '硬件环境',
   development        varchar(45) comment '开发工具',
   responsibilities   varchar(2000) comment '项目中职责',
   description        varchar(2000) comment '项目描述',
   constraint pkProjectexperience primary key (resumeId, projectId)
)comment '项目经验' charset=utf8 engine=innodb;

--教育背景
drop table if exists education;
create table education 
(
   resumeId           varchar(45)          not null comment '简历id',
   educationId        varchar(45)          not null comment '教育背景id',
   startDate         varchar(45) comment '开始时间',
   endDate           varchar(45) comment '截止时间',
   schoolName        varchar(45) comment '学校名称',
   tongzhao           varchar(2) comment '是否统招',
   mainmajor          varchar(4) comment '专业大类',
   submajor           varchar(4) comment '专业子类',
   degree             varchar(4) comment '学历/学位',
   constraint pkEducation primary key (resumeId, educationId)
)comment '教育背景' charset=utf8 engine=innodb;

--专业技能
drop table if exists professionalSkill;
create table professionalSkill 
(
   resumeId          varchar(45)          not null comment '简历id',
   professionalSkillId varchar(45)          not null comment '技能id',
   professionalSkillName varchar(45) comment '名称',
   actualExperience  varchar(4) comment '使用时间',
   level              varchar(4) comment '掌握程度',
   constraint pkProfessionalSkill primary key (resumeId, professionalSkillId)
)comment '专业技能' charset=utf8 engine=innodb;

--其他信息
drop table if exists other;
create table other 
(
   resumeId          varchar(45)          not null comment '简历id',
   otherId           varchar(45)          not null comment '信息id',
   title              varchar(45) comment '标题',
   description        varchar(100) comment '描述',
   constraint pk_other primary key (resumeId, otherId)
)comment '其他信息' charset=utf8 engine=innodb;


--附件
drop table if exists file;
create table file 
(
   resumeId          varchar(45)          not null comment '简历id',
   fileId            varchar(45)          not null comment '附件id',
   filename           varchar(45) comment '附件名称',
   description        varchar(100) comment '附件描述',
   fileDir           varchar(100) comment '附件路径',
   constraint pkFile primary key (resumeId, fileId)
)comment '附件' charset=utf8 engine=innodb;


--证书
drop table if exists certification;
create table certification 
(
   resumeId          varchar(45)          not null comment '简历id',
   certificationId   varchar(45)          not null comment '证书id',
   certificationType varchar(4) comment '证书类型',
   certificationName varchar(45) comment '证书名称',
   startDate         varchar(45) comment '获得时间',
   constraint pkCertification primary key (resumeId, certificationId)
)comment '证书' charset=utf8 engine=innodb;


--求职意向
drop table if exists jobintension;
create table jobintension 
(
   resumeId           varchar(45)          not null comment '简历id',
   employmenttype     varchar(45) comment '期望工作性质',
   desiredcity        varchar(45) comment '期望工作地点',
   desiredjobtype     varchar(45) comment '期望从事职业',
   desiredindustry    varchar(45) comment '期望从事行业',
   desiredsalaryscope varchar(45) comment '期望月薪(税前)',
   currentcareerstatus varchar(45) comment '工作状态',
   constraint pkJobintension primary key (resumeId)
)comment '求职意向' charset=utf8 engine=innodb;

drop table if exists customer;
create table customer
(
   uuid                    int not null auto_increment,
   customerId              varchar(20),
   pwd                     varchar(20),
   showName                varchar(100),
   trueName                varchar(100),
   registerTime            varchar(100),
   primary key (uuid)
)comment '用户信息表' charset=utf8 ENGINE=InnoDB;