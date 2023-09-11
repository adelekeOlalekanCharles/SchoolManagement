package SchoolManagement.model;

import SchoolManagement.enums.Religion;
import SchoolManagement.enums.Sex;

public class Applicant extends Person{

    public Applicant(String name, int age, String phoneNumber, String address, Sex sex, Religion religion) {
        super(name, age, phoneNumber, address, sex, religion);
    }

    public Applicant() {
    }

}
