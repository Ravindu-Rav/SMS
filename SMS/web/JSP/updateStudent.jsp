<%@ page import="java.util.*, Models.student, Servlets.StudentServlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/addstudent.css"> <!-- reuse the same CSS -->
</head>
<body>

    <h2>Update Student</h2>

    <form action="../StudentServlet" method="post">
        <label for="id">Student ID:</label>
        <input type="text" name="id" required />

        <label for="name">Name:</label>
        <input type="text" name="name" required />

        <label for="email">Email:</label>
        <input type="email" name="email" required />

        <label for="course">Course:</label>
        <input type="text" name="course" required />

        <label for="gpa">GPA:</label>
        <input type="text" name="gpa" required />

        <input type="hidden" name="action" value="update" />
        <button type="submit">Update Student</button>
    </form>

    <div class="nav">
        <a href="dashboard.jsp">Back to Dashboard</a>
        <a href="viewStudent.jsp">View Students</a>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </div>

</body>
</html>
