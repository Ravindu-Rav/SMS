package Models;


// Base class Student demonstrating encapsulation, constructors, method overloading
public class student {
    private String id;
    private String name;
    private String email;
    private String course;
    private double gpa;

    // No-arg constructor
    public student() {}

    // Full parameter constructor
    public student(String id, String name, String email, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.gpa = gpa;
    }

    // Constructor overloading: without GPA
    public student(String id, String name, String email, String course) {
        this(id, name, email, course, 0.0);  // default GPA = 0.0
    }

    // Getters and Setters (Encapsulation)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString method for debugging and printing
    @Override
    public String toString() {
        return "Student{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", course='" + course + '\'' +
               ", gpa=" + gpa +
               '}';
    }
}
