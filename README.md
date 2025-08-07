# Student Management System (SMS)

## Overview
This is a Java-based web application for managing student records. The system allows users to add, view, update, and delete student information through a web interface.

## Features
- User login with hardcoded username/password validation
- Student Dashboard with navigation links
- Add new students (Name, ID, Email, Course, GPA)
- View all students in a tabular format
- Update existing student details by ID
- Delete students by ID
- Logout functionality with session handling
- Server-side validation for inputs (including GPA range 0.0 to 4.0)
- Data stored temporarily in-memory using an ArrayList (no database)

## Technologies Used
- Java Servlets
- JSP (Java Server Pages)
- HTML, CSS (with custom styling for modern UI)
- Session management with HttpSession
- In-memory data management with Java Collections (ArrayList)

## Project Structure
/src
├── /main/java
│   ├── /models
│   │   └── Student.java
│   └── /servlets
│       └── StudentServlet.java
├── /main/webapp
│   ├── /css
│   │   ├── main.css
│   │   ├── student.css
│   │   └── dashboard.css
│   ├── /jsp
│   │   ├── addStudent.jsp
│   │   ├── viewStudent.jsp
│   │   ├── updateStudent.jsp
│   │   ├── deleteStudent.jsp
│   │   ├── dashboard.jsp
│   │   └── login.jsp
│   ├── /WEB-INF
│   │   └── web.xml
│   └── index.jsp

## How to Run
1. Import the project into a Java IDE (e.g., Eclipse, IntelliJ IDEA) with a configured servlet container (e.g., Apache Tomcat).
2. Build and deploy the application to the servlet container.
3. Access the application via browser:
4. Login with hardcoded credentials (e.g., username: `admin`, password: `password`).
5. Use the dashboard to manage student records.

## Notes
- This project uses in-memory storage, so data will be lost when the server stops.
- GPA input is validated on the server to be between 0.0 and 4.0.
- Alerts are shown after add, update, and delete operations to inform the user of success.

## Author
**Ravindu**

---
