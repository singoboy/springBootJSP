# SpringBoot JSP

Spring boot Integration contains Spring Jpa ,Spring mvc ,Spring Security , Spring JDBC Template USE JSP<br>
provide csrf protection<br>
test run at My SQL , TOMCAT 7 OR JBOSS EAP 7


Before run it ,remember change database configuration at application.properties

spring.datasource.url = jdbc:mysql://localhost:8889/test?useSSL=false<br>
spring.datasource.username = root <br>
spring.datasource.password = root<br>

enter  the following path to run it

http://localhost:8080/springBoot/person/index<br>
http://localhost:8080/springBoot/user/create?email=[email]&name=[name]<br>
http://localhost:8080/springBoot/user/get-by-email?email=[email]<br>
http://localhost:8080/springBoot/user/delete?id=[id]<br>

spring jdbc test<br>
http://localhost:8080/springBoot/user/dUser?name=[name]

note
<h4>mysql defaul port is 3306
<h4>jsp is under WEN-INF you should via them through controller
