package SchoolManagement.service.implementation;

import SchoolManagement.model.School;
import SchoolManagement.service.PrincipalService;

public class PrincipalImplementation implements PrincipalService {

    @Override
    public String AdmitStudent(int age) {
        School school = new School();
        school.setMinimum_age(12);
        school.setMaximum_age(20);
        if(age < school.getMinimum_age() || age > school.getMaximum_age()){
            return (" SORRY YOU ARE NOT ADMITTED");
        }
        return ("CONGRATULATIONS YOU HAVE BEEN ADMITTED");

    }

    @Override
    public String ExpelStudent(double grade) {
        School school = new School();
        school.setMinimum_grade(50);
        if (grade < school.getMinimum_grade()) {
            return (" WITHDRAW");
        }
        return (" PROMOTED");
    }
}
