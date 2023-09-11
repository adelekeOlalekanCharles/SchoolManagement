package SchoolManagement.model;

import SchoolManagement.enums.Religion;
import SchoolManagement.enums.Sex;

public class Staff extends Person {
    private int idNumber;

    public Staff(String name, int age, String phoneNumber, String address, Sex sex, Religion religion, int idNumber) {
        super(name, age, phoneNumber, address, sex, religion);
        this.idNumber = idNumber;
    }

    public Staff(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
