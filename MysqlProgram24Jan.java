use students_db;

CREATE TABLE worker_tbl1(
	WORKER_ID INT NOT NULL PRIMARY KEY,
	FIRST_NAME CHAR(25),
	LAST_NAME CHAR(25),
	SALARY INT(15),
	DEPARTMENT CHAR(25)
)
insert into worker_tbl1 values(001,'Sweta','Madavi',400000,'HR');
insert into worker_tbl1 values(002,'Prisha','Raut',50000,'Admin');
insert into worker_tbl1 values(003,'Pooja','Mehta',90000,'Admin');
insert into worker_tbl1 values(004,'Tejaswini','Thakre',100000,'HR');
insert into worker_tbl1 values(005,'Nandini','Lad',80000,'Admin');
insert into worker_tbl1 values(006,'Krupali','Ghai',100000,'HR');
insert into worker_tbl1 values(007,'Reyansh','Singani',60000,'Account');
insert into worker_tbl1 values(008,'Prachi','Desai',70000,'Account');
select * from worker_tbl1;
/*OUTPUT:
# worker_id	first_name	last_name	worker_salary	worker_department
    1	         Sweta	        Madavi  	400000	         HR
    2	         Prisha         Raut	        50000	         Admin
    3	         Pooja	        Mehta	        90000	         Admin
    4	         Tejaswini	Thakre	        100000	         HR
    5	         Nandini	Lad	        80000	         Admin
    6	         Krupali	Ghai	        100000	         HR
    7	         Reyansh	Singania	60000	         Account
    8	         Prachi  	Desai	        70000	         Account
*/

CREATE TABLE bonus_tbl1(
	WORKER_REF_ID INT,
	BONUS_AMOUNT INT(10),
	FOREIGN KEY (WORKER_REF_ID)REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);
insert into bonus_tbl1 values(0011,5000);
insert into bonus_tbl1 values(0012,8000);
insert into bonus_tbl1 values(0013,3500);
insert into bonus_tbl1 values(0011,3000);
insert into bonus_tbl1 values(0012,2000);
select * from bonus_tbl1;
/*OUTPUT:
# ref_id_bonus	amount_bonus
    11	         5000
    11	         3000
    12	         8000
    12	         3000
    13	         3500
*/

CREATE TABLE title_tbl(
	WORKER_REF_ID INT,
	WORKER_TITLE CHAR(25),
	FOREIGN KEY (WORKER_REF_ID)REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);
insert into title_tbl values(001,'Executive');
insert into title_tbl values(002,'Manager');
insert into title_tbl values(008,'Asst. Manager');
insert into title_tbl values(005,'Manager');
insert into title_tbl values(004,'lead');
insert into title_tbl values(007,'Executive');
insert into title_tbl values(006,'Manger');
insert into title_tbl values(003,'lead');
select * from title_tbl;
/*OUTPUT:
# ref_id_title	worker_title
    1	        Executive
    2	        Manager
    3	        lead
    4	        lead
    5	        Manager
    6	        Manager
    7	        Executive
    8	        Asst. Manager
*/
