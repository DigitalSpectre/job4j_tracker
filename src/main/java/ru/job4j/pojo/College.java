package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Sidorov Ivan Petrovich");
        student.setGroup("B1");
        student.setEnrollment(new Date());

        System.out.println(student.getFullName() + " of group " + student.getGroup() + " enrolled " + student.getEnrollment());
    }
}
