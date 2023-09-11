package SchoolManagement.model;

public class School {
    private String SchoolName;
    private Student student;
    private Staff staff;
    private String address;
    private double minimum_grade;
    private int minimum_age;
    private int maximum_age;

    public School(String schoolName, Student student, Staff staff, String address, double minimum_grade, int minimum_age, int maximum_age) {
        SchoolName = schoolName;
        this.student = student;
        this.staff = staff;
        this.address = address;
        this.minimum_grade = minimum_grade;
        this.minimum_age = minimum_age;
        this.maximum_age = maximum_age;
    }

    public School() {
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMinimum_grade() {
        return minimum_grade;
    }

    public void setMinimum_grade(double minimum_grade) {
        this.minimum_grade = minimum_grade;
    }

    public int getMinimum_age() {
        return minimum_age;
    }

    public void setMinimum_age(int minimum_age) {
        this.minimum_age = minimum_age;
    }

    public int getMaximum_age() {
        return maximum_age;
    }

    public void setMaximum_age(int maximum_age) {
        this.maximum_age = maximum_age;
    }

    @Override
    public String toString() {
        return "School{" +
                "SchoolName='" + SchoolName + '\'' +
                ", student=" + student +
                ", staff=" + staff +
                ", address='" + address + '\'' +
                ", minimum_grade=" + minimum_grade +
                ", minimum_age=" + minimum_age +
                ", maximum_age=" + maximum_age +
                '}';
    }
}




