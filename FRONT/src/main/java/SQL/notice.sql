create table jspweb.notice(

	nno int primary key auto_increment,
    ntitle varchar(100) not null ,
    ncontents varchar(2000) not null ,
    nwriter varchar(100) not null ,
    ndate datetime default current_timestamp not null ,
    ncount int not null ,
    nfile varchar(1000) 
)
s
create table jspweb.user(
	uno int primary key auto_increment ,
    uid varchar(30) not null ,
    upassword varchar(30) not null ,
    uname varchar(30) not null ,
    uaddress varchar(1000) not null ,
    uemail varchar(100) not null ,
    upoint int(30) not null  
)