package SchoolManagement.model;

import SchoolManagement.enums.Classes;
import SchoolManagement.enums.Religion;
import SchoolManagement.enums.Sex;

import java.util.ArrayList;

public class Student extends Person {

    private int idNumber;
    private Classes classes;
    private Course course;
    private double studentGrade;

  ArrayList<Student> studentList = new ArrayList<>();

    public Student(String name, int age, String phoneNumber, String address, Sex sex, Religion religion, int idNumber, Classes classes, Course course, double studentGrade, ArrayList<Student> studentList) {
        super(name, age, phoneNumber, address, sex, religion);
        this.idNumber = idNumber;
        this.classes = classes;
        this.course = course;
        this.studentGrade = studentGrade;
        this.studentList = studentList;
    }

    public Student(int idNumber, Classes classes, Course course, double studentGrade, ArrayList<Student> studentList) {
        this.idNumber = idNumber;
        this.classes = classes;
        this.course = course;
        this.studentGrade = studentGrade;
        this.studentList = studentList;
    }

    public Student(String adeleke, int i, String s, String cathedral, Sex sex, Religion religion, int i1, Classes classes, String mathematics, double v) {
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", classes=" + classes +
                ", course=" + course +
                ", studentGrade=" + studentGrade +
                ", studentList=" + studentList +
                '}';
    }
}
