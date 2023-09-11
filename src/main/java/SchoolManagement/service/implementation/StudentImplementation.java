package SchoolManagement.service.implementation;

import SchoolManagement.enums.Classes;

public class StudentImplementation implements StudentService{
    @Override
    public String studentService(Classes studentClass, Classes CourseClass) {
        if (studentClass.equals(CourseClass)) {
         return "YOU ARE PERMITTED TO ATTEND THE CLASS";
        }
        return "YOU ARE NOT PERMITTED TO ATTEND THE CLASS";
    }
}
