# CS504-Homework1
RESTful APIs using Spring Boot, mysql 

# 1 introduction
a demo using Spring Boot, mysql, Java, SQL and  Intelli IDEA to implement RESTful APIs.

# 2 steps


## 2.1 step 1 -- mysql(install, create database, table and insert data)
1) install mysql
2) log on to mysql
3) create a database called "running_information_analysis_db" and use this database
4) use scripts in "/database/1) create table.txt" to create tables
5) use scripts in "/database/2) insert test data.txt" to insert test data into tables
6) use scripts in "/database/3) check the data.txt" to check all the data

## 2.2 step 2 -- java -jar Running-Information-Analysis-Service-1.0.0.BUILD-SNAPSHOT.jar
1) install java 8
2) download "/jar/Running-Information-Analysis-Service-1.0.0.BUILD-SNAPSHOT.jar"
3) use "java -jar Running-Information-Analysis-Service-1.0.0.BUILD-SNAPSHOT.jar" to launch the programme

## 2.3 step 3 -- use browser to test REST APIs
1) visit the following address to see data in Json format(all the data are in descendinging order of heartRate and each page show two pieces of data)  
"http://localhost:8080/findAllDisplayWithPage/x" where x is the page number(between 0 and 6)
2) use the following address to delete data  
"http://localhost:8080//deleteByRunningId/x" where x is the runningId(between 1 and 14)

# 3 source files(Spring Boot, mysql, Java, SQL, Intelli IDEA)
all the source files are located in "/source", please open them using Intelli IDEA

