# project
<h2>What is CompanyEmployee project?</h2>
This can be a web site of any company.
CompanyEmployee project is made for owner/Hr/manager of company who needs the data of company employee.
In this project the Admin tag is active rest of the tags are need to be linked with other pages.
This project is made using jsp,servlet and sql oracle database.

<h2>Operations :</h2>
You can perform various operations like:
1 Add
2 delete
3 update
On employee of the company

<h2>Steps To install this project on eclipse:</h2>
<li> Create Dynamic web Project</li>
<li> Right click on your project ->build path ->configure build path ->add external jar ->select servlet-api</li> 
<li> In WebContent/WebINF/lib folder paste the ojdbc14 jar file</li>
<li> Copy all jsp,html file and folders from WebContent folder of my project and paste it all in WebContent folder of your project.</li>
<li> Create Packages in src folder like my project structure</li>
<li> Paste all programs into your projects.</li> 
<li> On database you need to create two tables admin and employee</li>
<li> Admin Table</li> 
create table admin(
ad_id number(38) primary key,
ad_name varchar(255),
ad_address varchar(255),
ad_contact number(38),
ad_salary number(38),
ad_email varchar(255),
ad_uname varchar(255),
ad_password varchar(255))
<li>Employee Table</li>
create table employee(
emp_id number(38) primary key,
emp_name varchar(255),
emp_address varchar(255),
emp_contact number(38),
emp_dept varchar(255),
emp_salary number(38),
emp_email varchar(255),
emp_uname varchar(255),
emp_password varchar(255))
<li> For run the application first add the admin to database using insert query or running "adminRegistraion.jsp" file on server</li>
<li>After adding admin,run "index.html" file then click on "Admin" tag then login via username and password</li>
<br>
<br>

Home page
![Screenshot (8)](https://user-images.githubusercontent.com/69745859/115980800-1d093500-a5ad-11eb-81de-f2eb35547613.png)

<br>
Admin page

![Screenshot (10)](https://user-images.githubusercontent.com/69745859/115980839-5fcb0d00-a5ad-11eb-8952-32ca7bfc0bfc.png)

<br>
Admin Details after login

![Screenshot (11)_LI](https://user-images.githubusercontent.com/69745859/115980878-9ef95e00-a5ad-11eb-9dd4-264f6340d8d2.jpg)

<br>
Add employee page

![Screenshot (12)](https://user-images.githubusercontent.com/69745859/115981041-a2411980-a5ae-11eb-885e-180c541e3ef4.png)

<br>

Employee login
![Screenshot (13)](https://user-images.githubusercontent.com/69745859/115981091-f1874a00-a5ae-11eb-9955-8a90be783de0.png)

<br>

Details of Employee

![Screenshot (17)](https://user-images.githubusercontent.com/69745859/115981158-7eca9e80-a5af-11eb-9490-cee040c18f84.png)

<br>

Employee List
![Screenshot (19)_LI](https://user-images.githubusercontent.com/69745859/115981203-ce10cf00-a5af-11eb-93e1-3ae193992aaa.jpg)

<br>

If any query related to this project, you can reach on my social Account 
<br>

[Facebook](https://www.facebook.com/ajay.ingle.9231)

<br>

[Instagram](https://www.instagram.com/ajay_ingle27)
