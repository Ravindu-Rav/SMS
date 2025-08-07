package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        HttpSession session = req.getSession(false); // use false to avoid creating a session
        if (session != null) {
            session.invalidate(); // destroy session
        }
        res.sendRedirect("index.jsp"); // or "login.jsp" depending on your file name
    }

    @Override
    public String getServletInfo() {
        return "Handles user logout and session invalidation.";
    }
}
