<p align="center">
<img width="600" height="150" src="png_files/Grade_Keeper2.png" title="Grade_Keeper_2">
</p>

**Grade Keeper** is a SQL database containing all information pertaining to the Employees, Students, and Instructors
at a fictional university. **Grade Keeper** includes both the database and the necessary front end Java program to read 
and manipulate the DB.

## Table Of Contents
- [Table Of Contents](#table-of-contents)
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Environment Setup](#environment-setup)
- [Evaluation and Testing](#evaluation-and-testing)
- [Built With](#built-with)
- [Authors](#authors)
- [Acknowledgments](#acknowledgments)

### Getting Started

These instructions will get you a copy of our Grade Keeper project up and running on your local machine for evaluation
and testing purposes. 

### Prerequisites

An installation of MySQL.

### Installation

Import the included SQL file to build the data base.

```bash
Grade_Keeper_2.sql

```

### Environment Setup

Compile the java program.

```bash
javac -cp lib/mariadb-java-client-2.4.2.jar SER322/jdbclab.java
```

Run the java program
```bash
java -cp lib/mariadb-java-client-2.4.2.jar:. SER322.jdbclab "jdbc:mariadb://localhost:3306/JDBClab1??autoReconnect=true&&useSSL=false" root SER322 org.mariadb.jdbc.Driver query1
```

### Evaluation and Testing

**Functions of the Java program**

* Display all relations except prerequisites and grades
* Display all students
* Average GPA for a student
* Total credit hours for a student
* Adding grades for a student
* Find grades for a specific student
* List grades for a specific course
* Display all courses with prerequisites
  - Drop down menu will allow you to choose course (returns required courses for course selected)
* Select a list of students from specific courses
* _Sort functionality included_

### Built With

* [MySQL](https://mysql.com)
* [Eclipse](https://www.eclipse.org/ide/)
* [JDK8](https://www.oracle.com/technetwork/java/javase/overview/index.html)
* [GitHub](https://github.com)
* [Google Docs](https://www.google.com/docs/about/)
* [Pencil Project](https://pencil.evolvus.vn)

### Authors

* Jesse Quy
* Cristina Gonzales
* Kevin Halliwell
* Brandon Kynsi

### Acknowledgements

```
TBD Will be updated before submitting
```
