package SchoolManagement.service.implementation;

import SchoolManagement.enums.Classes;
import SchoolManagement.service.TeacherService;

public class TeacherImplementation implements TeacherService {
    @Override
    public String teachStudent(Classes teacherClass, Classes courseClass) {
        if (teacherClass.equals(courseClass)) {
            return "YOU ARE ELIGIBLE TO TEACH THE COURSE";
        }
        return "YOU ARE NOT ELIGIBLE TO TEACH";
    }
}
