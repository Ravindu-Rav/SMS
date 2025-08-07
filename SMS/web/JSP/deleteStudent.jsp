<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/addstudent.css"> <!-- Use the same CSS -->
</head>
<body>

    <h2>Delete Student</h2>

    <form action="../StudentServlet" method="post">
        <label for="id">Student ID:</label>
        <input type="text" name="id" required />

        <input type="hidden" name="action" value="delete" />
        <button type="submit">Delete Student</button>
    </form>

    <div class="nav">
        <a href="dashboard.jsp">Back to Dashboard</a>
        <a href="viewStudent.jsp">View Students</a>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </div>

</body>
</html>
