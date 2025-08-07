package Servlets;

import Models.student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

    private static List<student> studentList = new ArrayList<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");

        switch (action) {
            case "add":
                addStudent(req);
                break;
            case "update":
                updateStudent(req);
                break;
            case "delete":
                deleteStudent(req);
                break;
        }

        res.sendRedirect("JSP/viewStudent.jsp");
    }

    // Add new student with GPA validation
    private void addStudent(HttpServletRequest req) {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        String gpaStr = req.getParameter("gpa");

        try {
            double gpa = Double.parseDouble(gpaStr);

            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("GPA must be between 0.0 and 4.0");
                return;
            }

            // Basic validation
            if (id != null && !id.isEmpty() && name != null && !name.isEmpty()) {
                student student = new student(id, name, email, course, gpa);
                studentList.add(student);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid GPA format. Must be a number.");
        }
    }

    // Update existing student with GPA validation
    private void updateStudent(HttpServletRequest req) {
        String id = req.getParameter("id");
        String gpaStr = req.getParameter("gpa");

        try {
            double gpa = Double.parseDouble(gpaStr);
            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("GPA must be between 0.0 and 4.0");
                return;
            }

            for (student s : studentList) {
                if (s.getId().equals(id)) {
                    s.setName(req.getParameter("name"));
                    s.setEmail(req.getParameter("email"));
                    s.setCourse(req.getParameter("course"));
                    s.setGpa(gpa);
                    break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid GPA format. Must be a number.");
        }
    }

    // Delete student by ID
    private void deleteStudent(HttpServletRequest req) {
        String id = req.getParameter("id");
        studentList.removeIf(s -> s.getId().equals(id));
    }

    public static List<student> getStudents() {
        return studentList;
    }
}
