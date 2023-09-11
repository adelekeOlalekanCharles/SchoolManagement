package SchoolManagement.model;

import SchoolManagement.enums.Religion;
import SchoolManagement.enums.Sex;

public class Principal extends Staff{

    public Principal(String name, int age, String phoneNumber, String address, Sex sex, Religion religion, int idNumber) {
        super(name, age, phoneNumber, address, sex, religion, idNumber);
    }

    public Principal(int idNumber) {
        super(idNumber);
    }
}

