package Models;

// UndergraduateStudent inherits from Student, adds 'year' attribute
public class UndergraduateStudent extends student {
    private int year;  // Year of study, e.g. 1, 2, 3, 4

    public UndergraduateStudent() {
        super();
    }

    public UndergraduateStudent(String id, String name, String email, String course, double gpa, int year) {
        super(id, name, email, course, gpa);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
               "year=" + year +
               ", " + super.toString() +
               '}';
    }
}
