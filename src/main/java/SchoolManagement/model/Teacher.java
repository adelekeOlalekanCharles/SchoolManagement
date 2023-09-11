package SchoolManagement.model;

import SchoolManagement.enums.Classes;
import SchoolManagement.enums.Religion;
import SchoolManagement.enums.Sex;

public class Teacher extends Staff{
    private Course course;
    private Classes classes;

    public Teacher(String name, int age, String phoneNumber, String address, Sex sex, Religion religion, int idNumber, Course course, Classes classes) {
        super(name, age, phoneNumber, address, sex, religion, idNumber);
        this.course = course;
        this.classes = classes;
    }

    public Teacher(int idNumber, Course course, Classes classes) {
        super(idNumber);
        this.course = course;
        this.classes = classes;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course=" + course +
                ", classes=" + classes +
                '}';
    }
}
