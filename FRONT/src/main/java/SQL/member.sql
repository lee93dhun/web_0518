

create database jspweb


create table jspweb.member(
	mno int primary key auto_increment ,
    mid varchar(20) not null ,
    mpassword varchar(10) not null , 
    mname varchar(10)  ,
    memail varchar(30) ,
    mphone varchar(20) ,
    maddress varchar(100)
    
)