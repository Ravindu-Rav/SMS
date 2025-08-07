<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login | Student Management System</title>
    <link rel="stylesheet" href="CSS/main.css">
    <link rel="stylesheet" href="CSS/login.css">
</head>
<body>
    <div class="login-container">
        <h2>Student Management System</h2>
        
        <form action="LoginServlet" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Login</button>

            <div class="error-msg">
                <%
                    String error = (String) request.getAttribute("error");
                    if (error != null) {
                %>
                    <p><%= error %></p>
                <%
                    }
                %>
            </div>
        </form>
    </div>
</body>
</html>
