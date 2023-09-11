package org.example;


import SchoolManagement.enums.Classes;
import SchoolManagement.enums.Religion;
import SchoolManagement.enums.Sex;
import SchoolManagement.model.*;
import SchoolManagement.service.implementation.PrincipalImplementation;
import SchoolManagement.service.implementation.StudentImplementation;
import SchoolManagement.service.implementation.TeacherImplementation;

import static SchoolManagement.enums.Classes.JSS2;


public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", Classes.JSS1);
        Course english = new Course("English", JSS2);
        Course physics = new Course("Physics", Classes.JSS3);

        Principal principal = new Principal("MrGideon", 53, "+2348162785000","OritaObele", Sex.FEMALE, Religion.CHRISTIANITY, 12);
        Student student1 = new Student("Adeleke",13,"+234912225664","Cathedral", Sex.MALE,Religion.CHRISTIANITY,34,JSS2,"MATHEMATICS",30.3);
        Student student2 = new Student("Adeleye",20,"09087977666","OdoOja",Sex.MALE,Religion.CHRISTIANITY,76,Classes.JSS3,"English",70.5);
        Teacher teacher1 = new Teacher("MrGodwin", 56,"09098789097","Nao",Sex.MALE, Religion.CHRISTIANITY,34,math, Classes.JSS1);
        Teacher teacher2 = new Teacher("MrOkoro",34,"08139295301","OjaOba",Sex.FEMALE,Religion.CHRISTIANITY,45,math, JSS2);
        Applicant applicant = new Applicant("Oluyemi",12,"081234567","Owode",Sex.MALE,Religion.CHRISTIANITY);


        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        System.out.println(principalImplementation.AdmitStudent(applicant.getAge()));
        System.out.println(principalImplementation.ExpelStudent(student1.getStudentGrade()));

        TeacherImplementation teacherImplementation = new TeacherImplementation();
        System.out.println(teacherImplementation.teachStudent(Classes.JSS1, math.getCourseClass()));

        StudentImplementation studentImplementation = new StudentImplementation();
        System.out.println(studentImplementation.studentService(Classes.JSS1, math.getCourseClass()));
        System.out.println(studentImplementation.studentService(JSS2, english.getCourseClass()));
        System.out.println(studentImplementation.studentService(Classes.JSS3, english.getCourseClass()));



    }

    }

