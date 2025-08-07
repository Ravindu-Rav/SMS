<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
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
    <title>Dashboard</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/dashboard.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>
    <div class="dashboard-container">
        <h2>👋 Welcome, <%= user %>!</h2>

        <div class="card-grid">
            <a href="addStudent.jsp" class="card">
                <i class="fas fa-user-plus"></i>
                <span>Add Student</span>
            </a>

            <a href="viewStudent.jsp" class="card">
                <i class="fas fa-users"></i>
                <span>View Students</span>
            </a>

            <a href="updateStudent.jsp" class="card">
                <i class="fas fa-user-edit"></i>
                <span>Update Student</span>
            </a>

            <a href="deleteStudent.jsp" class="card">
                <i class="fas fa-user-minus"></i>
                <span>Delete Student</span>
            </a>

            <a href="${pageContext.request.contextPath}/logout" class="card logout">
                <i class="fas fa-sign-out-alt"></i>
                <span>Logout</span>
            </a>
        </div>
    </div>
</body>
</html>
