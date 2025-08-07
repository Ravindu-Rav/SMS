<%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String user = (String) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("../index.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
     <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/addstudent.css">
</head>
<body>
    <h2>Add New Student</h2>
    <form action="../StudentServlet" method="post">
        <input type="hidden" name="action" value="add">

        <label for="id">Student ID:</label>
        <input type="text" id="id" name="id" required>

        <label for="name">Full Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email">

        <label for="course">Course:</label>
        <input type="text" id="course" name="course">

        <label for="gpa">GPA:</label>
        <input type="number" step="0.01" id="gpa" name="gpa" min="0" max="4">

        <button type="submit">Add Student</button>
    </form>

    <div class="nav">
        <a href="dashboard.jsp">Back to Dashboard</a>
        <a href="viewStudent.jsp">View Students</a>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </div>
</body>
</html>
