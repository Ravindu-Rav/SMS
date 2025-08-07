package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        try {
            // Check if user is already logged in
            HttpSession existingSession = req.getSession(false);
            if (existingSession != null && existingSession.getAttribute("user") != null) {
                // Already logged in
                req.setAttribute("message", "You are already logged in!");
                req.getRequestDispatcher("JSP/dashboard.jsp").forward(req, res);
                return;
            }

            String username = req.getParameter("username");
            String password = req.getParameter("password");

            if (username == null || username.trim().isEmpty() ||
                password == null || password.trim().isEmpty()) {
                req.setAttribute("error", "Username and password cannot be empty!");
                req.getRequestDispatcher("index.jsp").forward(req, res);
                return;
            }

            if ("admin".equals(username) && "admin123".equals(password)) {
                HttpSession session = req.getSession(); // create new session
                session.setAttribute("user", username);
                res.sendRedirect("JSP/dashboard.jsp");
            } else {
                req.setAttribute("error", "Invalid credentials!");
                req.getRequestDispatcher("index.jsp").forward(req, res);
            }

        } catch (Exception e) {
            req.setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            req.getRequestDispatcher("index.jsp").forward(req, res);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Login servlet handles user authentication";
    }
}
