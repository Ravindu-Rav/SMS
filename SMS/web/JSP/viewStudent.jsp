<%@ page import="java.util.*, Models.student, Servlets.StudentServlet" %>
<%
    String user = (String) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("../index.jsp"); // redirect if not logged in
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>View Students</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/student.css">
</head>
<body>

<h2>Student List</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Course</th>
        <th>GPA</th>
    </tr>
    <%
        List<student> students = StudentServlet.getStudents();
        for (student s : students) {
    %>
    <tr>
        <td><%= s.getId() %></td>
        <td><%= s.getName() %></td>
        <td><%= s.getEmail() %></td>
        <td><%= s.getCourse() %></td>
        <td><%= s.getGpa() %></td>
    </tr>
    <% } %>
</table>

<div class="nav">
        <a href="dashboard.jsp">Back to Dashboard</a>
        <a href="viewStudent.jsp">View Students</a>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
</div>
</body>
</html>
