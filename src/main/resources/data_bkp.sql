create table PERSON(id integer not null,name varchar(255) not null,location varchar(255),birth_date timestamp,primary key(id) );

Insert into PERSON(id,name,location,birth_date) values(1001,'Anirban','Pune',NOW());

Insert into PERSON(id,name,location,birth_date)values(1002,'Pratap','Guwahati',NOW());

Insert into PERSON(id,name,location,birth_date)values(1003,'James','New York',NOW());


create table STUDENT(id integer not null,name varchar(255) not null primary key(id) );

create table PASSPORT(id integer not null,number varchar(255) not null);


create table REVIEW(id int not null, rating varchar(255), description varchar(255));

Insert into STUDENT(id,name,passport_id) values(1001,'Anirban',4001);

Insert into STUDENT(id,name,passport_id)values(1002,'Pratap',4002);

Insert into STUDENT(id,name,passport_id)values(1003,'James',4003);


Insert into STUDENT_COURSE(STUDENT_ID,COURSE_ID) values(1001,'1');
Insert into STUDENT_COURSE(STUDENT_ID,COURSE_ID) values(1001,'2');
Insert into STUDENT_COURSE(STUDENT_ID,COURSE_ID) values(1002,'2');
Insert into STUDENT_COURSE(STUDENT_ID,COURSE_ID) values(1003,'3');
Insert into STUDENT_COURSE(STUDENT_ID,COURSE_ID) values(1003,'1');



Insert into PASSPORT(id,number) values(4001,'ABC546F');

Insert into PASSPORT(id,number)values(4002,'DER675G');

Insert into PASSPORT(id,number)values(4003,'GHF675A');

Insert into REVIEW(id,rating,description,course_id) values('4','Awesome',4);
Insert into REVIEW(id,rating,description,course_id) values('5','Excelent',4);
Insert into REVIEW(id,rating,description,course_id) values('3','Good',2);

create table COURSE(id integer not null,name varchar(255) not null);
Insert into COURSE(id,name) values(1001,'Science');