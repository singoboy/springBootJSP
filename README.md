# SpringBoot JSP

Spring boot Integration contains Spring Jpa ,Spring mvc ,Spring Security , Spring JDBC Template USE JSP

test run at My SQL , TOMCAT 7 OR JBOSS EAP 7

Before run it ,remember change database configuration 

spring.datasource.url = jdbc:mysql://localhost:8889/test?useSSL=false
spring.datasource.username = root <br>
spring.datasource.password = root

enter  the following path to run it

http://localhost:8080/springBoot/person/index
http://localhost:8080/springBoot/create?email=[email]&name=[name]
http://localhost:8080/springBoot/get-by-email?email=[email]
http://localhost:8080/springBoot/delete?id=[id]

spring jdbc test<br>
http://localhost:8080/springBoot/dUser?name=[name]

note
<h4>mysql defaul port is 3306
<h4>jsp is under WEN-INF you should via them through controller
